import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuConvertidor {


    public static void main(String[] args) throws IOException, InterruptedException, NumberFormatException {
        ConsultaMoneda service = new ConsultaMoneda();
        double cantidad = 0;
        int menuPrincipal = 0;
        boolean salir;


        System.out.println("**********************************************************************************");
        System.out.println("Bienvenid@s al convertidor de monedas!");
        System.out.println("Menú Principal:");


        String opciones = """
                ***Elija la opción que desea convertir***
                
                 1.("EUR -->>> USD")
                
                 2.("MXN -->>> COP")
                
                 3.("COP -->>> PEN")
                
                 4."COP -->>> GBP
                
                 5."USD -->>> JPY
                
                 6."AUD -->>> USD
                
                 7. "Salir"
                ****************************************************************************************************""";



        Scanner menu = new Scanner(System.in);
        while (menuPrincipal != 7) {
            System.out.println(opciones);
            menuPrincipal= menu.nextInt();

            switch (menuPrincipal) {
                case 1:
                    System.out.println("***tipo de cambio: >> Euros a Dolares Americanos <<***");
                    System.out.println("Escribe la cantidad que deseas cambiar:");
                    double cantidadMoneda = menu.nextDouble();
                    service.cambioMoneda("EUR", "USD", +cantidadMoneda);
                    break;


                case 2:
                    System.out.println("tipo de cambio: Pesos Mexicanos a Pesos Colombianos");
                    System.out.println("Escribe la cantidad");
                    double cantidadMoneda2 = menu.nextDouble();
                    service.cambioMoneda("MXN", "COP", +cantidadMoneda2);
                    break;

                case 3:
                    System.out.println("tipo de cambio: Pesos Colombianos a Soles peruanos");
                    System.out.println("Escribe la cantidad");
                    double cantidadMoneda3 = menu.nextDouble();
                    service.cambioMoneda("COP", "PEN", +cantidadMoneda3);
                    break;

                case 4:
                    System.out.println("tipo de cambio: Pesos Colombianos a Libra Esterlina");
                    System.out.println("Escribe la cantidad");
                    double cantidadMoneda4 = menu.nextDouble();
                    service.cambioMoneda("COP", "GBP", +cantidadMoneda4);
                    break;

                case 5:
                    System.out.println("tipo de cambio: Dolares Americanos a Yenes Japoneses ");
                    System.out.println("Escribe la cantidad");
                    double cantidadMoneda5 = menu.nextDouble();
                    service.cambioMoneda("USD", "JPY", +cantidadMoneda5);
                    break;


                case 6:
                    System.out.println("tipo de cambio: Dolares Australianos a Dolares Americanos");
                    System.out.println("Escribe la cantidad");
                    double cantidadMoneda6 = menu.nextDouble();
                    service.cambioMoneda("AUD", "USD", +cantidadMoneda6);
                    break;

                case 7:
                    salir = true;
                    System.out.println("¡Gracias por utilizar en convertidor de monedas, hasta pronto!");
                    
            }




            }
        }
    }


