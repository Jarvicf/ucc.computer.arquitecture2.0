public class Conversores {

    final String Hex[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};

    //Metodo Binario
    public String convertir_Decimal_Binario(long decimal) {
        if (decimal <= 0) {
            return "0";
        }
        StringBuilder binario = new StringBuilder();
        while (decimal > 0) {
            short residuo = (short) (decimal % 2);
            decimal = decimal / 2;
            // Insertar el dígito al inicio de la cadena
            binario.insert(0, String.valueOf(residuo));
        }
        return binario.toString();
    }

    public double convertir_Binario_Decimal(String Numero){

        int exp = 0;
        double nunDec = 0;
        for(int i = Numero.length() -1  ;i >= 0;i--){
            char  dato = Numero.charAt(i);
            String Digito = String.valueOf(dato);
            if(Digito .equals("1"))
            {
                nunDec = nunDec + Math.pow(2, exp);
                exp ++;
            }else if(Digito .equals("0"))
            {
                exp ++;
            }
        }
        return nunDec;
    }
        
    //Metodo octal 
     public long convertir_octal_Decimal(String octal) {
        long decimal = 0;
        int potencia = 0;
        for (int x = octal.length() - 1; x >= 0; x--) {
            int valorActual = Character.getNumericValue(octal.charAt(x));
            long elevado = (long) Math.pow(8, potencia) * valorActual;
            decimal += elevado;
            potencia++;
        }
        return decimal;
    }

    public String convertir_decimal_Octal(int decimal) {
        String octal = "";
        String caracteresOctales = "01234567";
        while (decimal > 0) {
            int residuo = decimal % 8;
            octal = (caracteresOctales.charAt(residuo) + octal);
            decimal /= 8;
        }
        return octal;
    }
    
    public boolean Verificar_Numero_(int numeroInto, int inferior, int maximo){
        
          String numeroIn = Integer.toString(numeroInto);
        
        for(int i = numeroIn.length() -1  ;i >= 0;i--)
        {
            char  dato = numeroIn.charAt(i);
            String Digito = String.valueOf(dato);
            int datounico = Integer.parseInt(Digito);
            if(datounico < inferior || datounico > maximo)
            {
                return false;
            }                
        }
        
        return true;         

    }   

    //Metodos Hexadecimal
    public boolean checkNumber(String number) {
        boolean checkhex = true;
        for (int i = number.length()-1; i >= 0; i--){
            char dato = number.charAt(i);
            String digito = String.valueOf(dato);
            if (!existeEnArreglo(Hex, digito )){
                System.out.println("❌ El dato ingresado no es un numero Octal ❌");
                checkhex = false;
                break;
            }
        }
        return checkhex;
    }

    private boolean existeEnArreglo(String[] arreglo, String busqueda) {
        for (int x = 0; x < arreglo.length; x++) {
            String dato = arreglo[x];
          if (arreglo[x].equals(busqueda)) {
            return true;
          }
        }
        return false;
    }

    public long convertir_Hexadecimal_Decimal(String hexadecimal) {
        long decimal = 0;       
        int potencia = 0;        
        for (int x = hexadecimal.length() - 1; x >= 0; x--) {
            int valor = NumEquivalencia(hexadecimal.charAt(x));
            long elevado = (long) Math.pow(16, potencia) * valor;
            decimal += elevado;           
            potencia++;
        }
        return decimal;
    }

    public static int NumEquivalencia(char number) {
        int num = Character.getNumericValue(number);
        switch(number){
            case 'A':
            num = 10;
                break;

            case 'B':
            num = 11;
                break;
            
            case 'C':
            num = 12;
                break; 
        
            case 'D':
            num = 13;
                break;
            
            case 'E':
            num = 14;
                break;
            
            case 'F':
            num = 15;
                break;
        }
        return num;
    }

    public static String EquivaleciaDecHex(int number) {
        String num="" ;
        switch(number){
            case 10:
            num = "A";
                break;

            case 11:
            num = "B";
                break;
            
            case 12:
            num = "C";
                break; 
        
            case 13:
            num = "D";
                break;
            
            case 14:
            num = "E";
                break;
            
            case 15:
            num = "F";
                break;
        }
        return num;
    }

    public String Equivalencia(int dato){

        String Letra = "";
        Letra = EquivaleciaDecHex(dato);
        return Letra;
    }
    
    public String Decimalhexadecimal(int Decimal){
        String Hexa = "";
        int cociente = 0;
        int divisor = 16;
        int residuo = 0;
        String Resultado = "";
        String operar = "S";
        String hex = "";

        while(operar == "S"){        
            cociente = Decimal / divisor;
            residuo = Decimal % divisor;
            
            if(residuo>9){
                hex = Equivalencia(residuo);
            }else{
                hex = String.valueOf(residuo);
            }
                
            if (cociente >= 16)
            {                   
                Resultado = Resultado + hex;                            
                Decimal = cociente;
            }else
            {
                Resultado = Resultado + hex;                                
                operar = "N";
            }
        }
        Resultado = Resultado + cociente;

        //Invertir numero
        for(int i = Resultado.length() -1;i>0 -1;i--)
            {
                char Digito = Resultado.charAt(i);
                //System.out.print(Digito);
                Hexa = Hexa + Digito;
            }
        return Hexa;
    }
}
    

