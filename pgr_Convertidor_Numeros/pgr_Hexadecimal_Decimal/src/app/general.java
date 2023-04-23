import java.util.Random;

public class general {
    final String Hex[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};

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

    public long hexadecimalADecimal(String hexadecimal) {
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
