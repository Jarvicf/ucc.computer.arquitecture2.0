import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner obtener = new Scanner (System.in);
        int numref = 0;
        int menu = 0;
        String Resultado  =  "";
        String ResultadoGFinal = "";
        while(menu == 0){
        System.out.println("Bienvenido al conversor de Números");
        System.out.println("############## MENU ###############");
        System.out.println("Seleccione una opción");
        System.out.println("1 > Conversión de Decimal a Binarios");
        System.out.println("2 > Conversión de Binario a Decimal");
        System.out.println("9 > Salir");
        
        //Capturamos la opcion de usuario
       int opc = obtener.nextInt();
        //Ciclo
        
             //Menu
        switch(opc){
            case 1:
            int divisor = 2;
            int cociente = 0;
            int residuo = 0;
    
            String operar = "S" ;
            System.out.println("Conversión de Binario a Decimal");
            System.out.print("Ingrese Numero a Convertir: ");
            int numero = obtener.nextInt();
            numref =  numero;
                if(numero >=1){
                    while(operar == "S"){
                         //Operamos y obtenemos el Cociente y el residuo
                         cociente = numero / divisor;
                         residuo = numero % divisor;
                         if (cociente >= 2)
                            {
                                Resultado = Resultado + residuo;                            
                                numero = cociente;
                            }
                            else
                            {
                                Resultado = Resultado + residuo;                                //txtResultado.Text = Resultado;
                                operar = "N";
                            }
                    }
                    Resultado = Resultado + cociente;
                }
                break;
            }        
            //Arreglamos el número
            for(int i = Resultado.length() -1;i>0 -1;i--)
            {
                char Digito = Resultado.charAt(i);
                //System.out.print(Digito);
                ResultadoGFinal = ResultadoGFinal + Digito;
            }
            System.out.println(">> En número decimal "+ numref + " Corresponde a "+ResultadoGFinal+ " En número Binario"); 
            System.out.println("");
        }
        obtener.close();
    }
}
