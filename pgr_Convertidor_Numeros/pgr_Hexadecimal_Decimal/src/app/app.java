import java.util.Scanner;

public class app{
    public static void main(String[] args) {
        int menu =0;
        String num;
        Scanner obtener = new Scanner (System.in);
        general obGeneral = new general();
        System.out.println("Bienvenido al conversor de Numeros");
        System.out.println("############## 🔢 MENU 🔢 ###############");

        try {
            while(menu == 0){
                System.out.println("Seleccione una opcion");
                System.out.println("📌 1 > Conversion de Hexadecimal a Decimal");
                System.out.println("📌 2 > Conversion de Decimal a Hexadecimal");
                System.out.println("📌 9 > Salir");
                
                System.out.print(">>");

                //Capturamos la opcion de usuario
                int opc = obtener.nextInt();
                
                switch(opc){
                    case 1:
                    System.out.println(">> Ingrese un numero Hexadecimal");
                    System.out.print(">>");
                    num = obtener.next();
                        if(obGeneral.checkNumber(num)){
                            System.out.println(" ▶ El numero Hexadecimal "+ num + " Corresponde a "+  obGeneral.hexadecimalADecimal(num) + " a Decimal"); 
                        }
                    break;

                    case 2:
                    System.out.println(">> Ingrese un numero Decimal");
                    System.out.print(">>");
                        try {
                            int dato = obtener.nextInt();
                            System.out.println(" ▶ El numero Decimal "+ dato + " Corresponde a "+  obGeneral.Decimalhexadecimal(dato) + " en Hexadecimal"); 
                        } catch (Exception e) {
                            System.out.println( "❌ Numero ingresado es incorrecto");
                        }                   
                    break;
                    
                    case 9:
                    System.out.println("🤙 Hasta la proxima");
                    System.exit(0);                    
                    break;
                }
               
            }

        } catch (Exception e) {
            System.out.println("❌ Se presento un error");
        }
        obtener.close();
    }
}
