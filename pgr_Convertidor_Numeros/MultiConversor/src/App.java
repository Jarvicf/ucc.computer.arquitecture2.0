import java.util.InputMismatchException;
import java.util.Scanner;
 
public class App {
 
    public static void main(String[] args) {
 
        Scanner capturar = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
        System.out.println("BIENVENIDO AL MULTICONVERSOR");
        while (!salir) {
 
            System.out.println("1. Conversor Decimal a Binarios");
            System.out.println("2. Conversor Binario a Decimal");
            System.out.println("3. Conversor Decimal a Octal");
            System.out.println("4. Conversor Octal a Decimal");
            System.out.println("5. Conversor Decimal a Hexadecimal");
            System.out.println("6. Conversor Hexadecimal a DEcimal");
            System.out.println("7. Salir");
 
            try {
 
                System.out.println("Escribe una de las opciones");
                System.out.print(">");
                opcion = capturar.nextInt();
 
                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion 1");
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion 2");
                        break;
                    case 3:
                        System.out.println("Has seleccionado la opcion 3");
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                capturar.next();
            }
        }
 
    }
 
}