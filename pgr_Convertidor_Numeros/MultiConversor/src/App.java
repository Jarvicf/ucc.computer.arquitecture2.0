import java.util.InputMismatchException;
import java.util.Scanner;
 
public class App {
 
    public static void main(String[] args) {
        //Coleres
        String verde = "\033[32m";
        String amarilla = "\033[103m";
        String rojo = "\033[31m";
        String reset = "\033[39m";
        Conversores conversores = new Conversores();
        Scanner capturar = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
        System.out.println("BIENVENIDO AL MULTICONVERSOR");
        while (!salir) {
 
            System.out.println("1. Conversor Decimal a Binario");
            System.out.println("2. Conversor Binario a Decimal");
            System.out.println("3. Conversor Decimal a Octal");
            System.out.println("4. Conversor Octal a Decimal");
            System.out.println("5. Conversor Decimal a Hexadecimal");
            System.out.println("6. Conversor Hexadecimal a Decimal");
            System.out.println("7. Salir");
 
            try {
 
                System.out.println("Escribe una de las opciones");
                System.out.print(">");
                opcion = capturar.nextInt();
 
                switch (opcion) {
                    case 1:
                    System.out.println("--Conversor Decimal a Binario");
                    System.out.println("--Ingresa un numero Decimal");
                    System.out.print("-->");
                    Long Dato = capturar.nextLong();
                    //Resultado
                    System.out.println("😀>> En número decimal "+ verde +"["+Dato+"]"+ reset+" Corresponde a "+ verde+"["+ conversores.convertir_Decimal_Binario(Dato)+"]"+ reset+" En número Binario 😀"); 
                    System.out.println();    
                        break;
                    case 2:
                    System.out.println("--Conversor Binario a Decimal");
                    System.out.println("--Ingresa un numero Binario");
                    System.out.print("-->");
                    String DatoC2 = capturar.next();
                    //Resultado
                    if (!conversores.contieneSoloLetras(DatoC2)) {
                    System.out.println("😀>> En número binario "+ verde +"["+DatoC2+"]"+ reset+" Corresponde a "+ verde+"["+ conversores.convertir_Binario_Decimal(DatoC2)+"]"+ reset+" En número decimal 😀"); 
                    }else{
                    System.out.println(rojo + ">> ❌ Numero Ingresado no es un numero binario " + verde+"["+DatoC2+"]" + reset);    
                    }
                    System.out.println();    
                        break;
                    case 3:
                    System.out.println("--Conversor Decimal a Octal");
                    System.out.println("--Ingresa un numero Decimal");
                    System.out.print("-->");
                    int DatoC3 = capturar.nextInt();
                     //Resultado
                     System.out.println("😀>> En número decimal "+ verde +"["+DatoC3+"]"+ reset+" Corresponde a "+ verde+"["+ conversores.convertir_decimal_Octal(DatoC3)+"]"+ reset+" En número octal 😀"); 
                     System.out.println();    
                        break;
                    case 4:
                    System.out.println("--Conversor Octal a Decimal");
                    System.out.println("--Ingresa un numero Octal");
                    System.out.print("-->");
                    int DatoC4 = capturar.nextInt();
                    if(conversores.Verificar_Numero_(DatoC4 ,0 ,7)){                     
                    System.out.println("😀>> En número octal "+ verde +"["+DatoC4+"]"+ reset+" Corresponde a "+ verde+"["+ conversores.convertir_octal_Decimal(String.valueOf(DatoC4))+"]"+ reset+" En número decimal 😀"); 
                    }else{
                    System.out.println(rojo + ">> ❌ Numero Ingresado no es Octal " + verde+"["+DatoC4+"]" + reset); 
                    }
                    System.out.println();
                        break;
                    case 5:
                    System.out.println("--Decimal a Hexadecimal");
                    System.out.println("--Ingresa un numero Decimal");
                    System.out.print("-->");
                    int DatoC5 = capturar.nextInt();
                    System.out.println("😀>> En número decimal "+ verde +"["+DatoC5+"]"+ reset+" Corresponde a "+ verde+"["+ conversores.Decimalhexadecimal(DatoC5) +"]"+ reset+" En número Hexadecimal 😀"); 
                    
                    System.out.println();
                        break;
                    case 6:
                    System.out.println("--Conversor Hexadecimal a Decimal");
                    System.out.println("--Ingresa un numero Hexadecimal");
                    System.out.print("-->");
                    String DatoC6 = capturar.next();
                    if(conversores.checkNumber(DatoC6)){
                        System.out.println("😀>> En número decimal "+ verde +"["+DatoC6+"]"+ reset+" Corresponde a "+ verde+"["+ conversores.convertir_Hexadecimal_Decimal(DatoC6)+"]"+ reset+" En número Hexadecimal 😀"); 
                    }
                    System.out.println();   
                        break;
                    case 7:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
                
            } catch (InputMismatchException e) {
                System.out.println(rojo + "Debes insertar un número" + reset);
                System.out.println();
            }
            
        }
        //capturar.close();
    }
 
}