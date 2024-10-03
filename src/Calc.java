import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {

        String nombre = "Emiliano RV";
        String tipoCuenta = "Debito";
        double saldo = 1999.98;
        int opcion = 0;

        System.out.println("**************");
        System.out.println("\nNombre del cliente: " + nombre);
        System.out.println("El tipo de cuenta es:" + tipoCuenta);
        System.out.println("Su saldo disponible es:$ " + saldo);

        System.out.println("\n**************");

        String menu = """
                *** Escriba el numero en la opcion deseada***
                
                1- Consultar saldo 
                2- Retirar 
                3- Depositar 
                9- Salir
                """;

        Scanner teclado = new Scanner(System.in);
        while (opcion !=9){

            System.out.println(menu);
            opcion= teclado.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("El saldo es: $ " + saldo);
                    break;
                case 2:
                    System.out.println("Cantidad de retiro");
                    double valorRetirar = teclado.nextDouble();
                    if (saldo > valorRetirar) {
                        System.out.println("Saldo insuficiente");
                    }
                    else{
                        saldo = saldo - valorRetirar;
                        System.out.println("Su saldo es: " + saldo);
                        }break;

                case 3:
                    }






            }
        }
    }
}
