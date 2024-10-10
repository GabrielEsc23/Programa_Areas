import java.util.Scanner;

public class Programa_Areas {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);

        while (true) {
            System.out.println("----- Programa para calcular áreas ------");
            System.out.println("1.- Área del Triángulo");
            System.out.println("2.- Área del Cuadrado");
            System.out.println("3.- Área del Círculo");
            System.out.println("4.- Salir");
            System.out.println("Ingrese la opción que desea realizar: ");
            int opcion = numero.nextInt();

            if (opcion == 1) {
                float base, altura, resultado;
                System.out.println("Introduzca el valor de la base del triángulo: ");
                base = numero.nextFloat();
                System.out.println("Introduzca el valor de la altura del triángulo: ");
                altura = numero.nextFloat();
                resultado = (base * altura) / 2;
                System.out.println("El valor del área del triángulo es de: " + resultado);

            } else if (opcion == 2) {
                float lado;
                System.out.println("Ingrese el valor de uno de los lados del cuadrado: ");
                lado = numero.nextFloat();
                double resultado = Math.pow(lado, 2);
                System.out.println("El área del cuadrado es de: " + resultado);

            } else if (opcion == 3) {
                double radio;
                System.out.println("Ingrese el valor del radio del círculo: ");
                radio = numero.nextDouble();
                double area = Math.PI * Math.pow(radio, 2);
                System.out.println("El área del círculo es de: " + area);

            } else if (opcion == 4) {
                System.out.println("Muchas gracias por usar nuestro sistema.");
                break;

            } else {
                System.out.println("Opción no válida, intente de nuevo.");
            }
        }

        numero.close();
    }
}
