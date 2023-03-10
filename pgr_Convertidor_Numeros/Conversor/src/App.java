import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner obtener = new Scanner (System.in);
        int numref = 0;
        int menu = 0;
        System.out.println("Bienvenido al conversor de N煤meros");
        System.out.println("############## MENU ###############");
        try{               
            while(menu == 0){
                System.out.println("Seleccione una opci贸n 馃敘");
                System.out.println("馃搶 1 > Conversi贸n de Decimal a Binarios");
                System.out.println("馃搶 2 > Conversi贸n de Binario a Decimal");
                System.out.println("馃搶 9 > Salir");

                System.out.print(">>");

            
                String Resultado  =  "";
                String ResultadoGFinal = "";

                //Capturamos la opcion de usuario
                int opc = obtener.nextInt();
        
                //Menu
                switch(opc){
                    //##############################
                    //Converci贸n de Decimal a Binario
		    //##############################
                    case 1:
                    int divisor = 2;
                    int cociente = 0;
                    int residuo = 0;
    
                    String operar = "S" ;
                    System.out.println("Conversi贸n de Binario a Decimal");
                    System.out.print("Ingrese N煤mero a Convertir: ");
                    int numero = obtener.nextInt();
                    numref =  numero;
                    if(numero >=2){

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
                                    Resultado = Resultado + residuo;                                
                                    operar = "N";
                                }
                        }
                        Resultado = Resultado + cociente;
                        //Arreglamos el n煤mero
                        for(int i = Resultado.length() -1;i>0 -1;i--)
                        {
                            char Digito = Resultado.charAt(i);
                            //System.out.print(Digito);
                            ResultadoGFinal = ResultadoGFinal + Digito;
                        }
                    }else{
                        switch(numero){
                        case 0:
                            ResultadoGFinal = "0";
                            break;
                        case 1:
                            ResultadoGFinal = "1";
                            break;
                        }
                    }
                    System.out.println("--------------------------------------------------------------------------------------");
                    System.out.println("馃榾>> En n煤mero decimal "+ "["+numref+"]"+ " Corresponde a "+ "["+ResultadoGFinal+"]"+ " En n煤mero Binario 馃榾"); 
                    System.out.println("--------------------------------------------------------------------------------------");
                    System.out.println("");
                    break;

                //################################    
                //Converci贸n de Binario a Decinal
		//##############################
                case 2:
                    System.out.println("Conversi贸n de Binario a Decimal");
                    System.out.print("Ingrese N煤mero a Convertir: ");
                    String Numero = obtener.next();
                    int exp = 0;
                    double nunDec = 0;
                    for(int i = Numero.length() -1  ;i >= 0;i--)
                    {
                        char  dato = Numero.charAt(i);
                        String Digito = String.valueOf(dato);
                        if(Digito .equals("1"))
                        {
                            nunDec = nunDec + Math.pow(2, exp);
                            exp ++;
                        }else if(Digito .equals("0"))
                        {
                            exp ++;
                        }else {
 			numero =0;
			System.out.println("El n煤mero ingresado no en Binari");
			//throw new Exception("El n煤mero ingresado no en Binario");
			}
                    }
                    System.out.println("--------------------------------------------------------------------------------------");
                    System.out.println(">> En n煤mero Binario "+ "["+Numero+"]"+ " Corresponde a "+ "["+nunDec+"]"+ " En n煤mero Decimal"); 
                    System.out.println("--------------------------------------------------------------------------------------");
                    System.out.println("");

                    break;    
                //Salir
                case 9:
		    System.out.println("Hasta la pr贸xima");
                    System.exit(0);
                    break;

		default:
		System.out.println(" 馃洃鈥奜pci贸n Incorrecta 馃洃");
                }        
            }
        obtener.close();
        }catch (Exception ex){
	   	
            System.out.println("Se ha presentado un error "+ ex);       
        } 
    }
}
