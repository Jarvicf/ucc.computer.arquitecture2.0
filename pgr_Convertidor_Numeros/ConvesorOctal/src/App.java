import java.util.Scanner;

public class App {
    
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        General obGeneral =  new General();
        Scanner leer = new Scanner(System.in);
        int datoIn;
        System.out.println("Hola, Bienvenido");
        System.out.println("Seleccione una opcion");
        //Opciones

        System.out.println("📌 1 - Conversion de Decimal a Octal");
        System.out.println("📌 2 - Conversion de octal a Decimal");
        System.out.println("📌 9 - Salir");

        try {         
            datoIn = leer.nextInt();
            
            if (datoIn == 1) {
                System.out.println("Ingrese numero decimal a convertir" );
                System.out.print("▶");
                int numero = leer.nextInt();
                leer.close();

                if(numero >= 0){
                    System.out.println("El numero decimal "+ numero + " corresponde a "+ General.decimalAOctal(numero) + " en octal");
                }else{
                    System.out.println("❌ Numero Ingresado debe ser positivo");
                }
                
            }else if (datoIn == 2){
                System.out.println("Ingrese numero octal a convertir" );
                System.out.print("▶");
                int numero = leer.nextInt();
                leer.close();

                if(General.VerificarNumero(numero)){
                    System.out.println("El numero octal "+ numero + " corresponde a "+ General.octalADecimal(String.valueOf(numero))+ " en decimal");
                }else{
                    System.out.println("❌ Numero Ingresado no es Octal");
                }

            }else if (datoIn == 9){

                System.out.println("Hasta la próxima");
                System.exit(0);
            }else{
                System.out.println("❌ Opcion ingresada no valida");
            }
        
        } catch (Exception e) {
            System.out.println("❌ Dato ingresado es errorneo");
        }
    }
        
}