public class General {

   
    //Metodo para convertir de otal a decimal
    public static long octalADecimal(String octal) {
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

    public static String decimalAOctal(int decimal) {
        String octal = "";
        String caracteresOctales = "01234567";
        while (decimal > 0) {
            int residuo = decimal % 8;
            octal = (caracteresOctales.charAt(residuo) + octal);
            decimal /= 8;
        }
        return octal;
    }
    
    public static boolean VerificarNumero(int numeroInto){
        
          String numeroIn = Integer.toString(numeroInto);
        
        for(int i = numeroIn.length() -1  ;i >= 0;i--)
        {
            char  dato = numeroIn.charAt(i);
            String Digito = String.valueOf(dato);
            int datounico = Integer.parseInt(Digito);
            if(datounico <= 0 || datounico >= 7){
                return false;
            }                
        }
        
        return true;         
    }

    
    
}
