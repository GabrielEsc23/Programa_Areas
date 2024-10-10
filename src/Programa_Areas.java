import java.util.Scanner;

public class Programa_Areas{
    public static void main(String[] args){
        Scanner numero=new Scanner(System.in);
        int i = 1;
        while(i==1){
        System.out.println("----- Programa para calcular areas ------");
        System.out.println("1.- Área del Triángulo");
        System.out.println("2.- Área del Cuadrado");
        System.out.println("3.- Área del Círculo: ");
        System.out.println("4.- Salir");
        System.out.println("Ingrese la opcion que desea realizar: ");
        int opcion=numero.nextInt();
        
        if (opcion==1){
            Scanner entrada=new Scanner(System.in);
            float base,altura,resultado;
            System.out.println("Introduzca el valor de base del triángulo");
            base=entrada.nextFloat();
            System.out.println("Introduzca el valor de altura del triangulo");
            altura=entrada.nextFloat();
            resultado=(base*altura)/2;
            System.out.println("El valor del área del triángulo es de: "+resultado);

        }else if (opcion==2) {
            Scanner entrada=new Scanner(System.in);
            float lado;
            System.out.println("Ingrese el valor de uno de los lados del cuadrado: ");
            lado=entrada.nextFloat();
            double resultado=  Math.pow(lado,2);
            System.out.println("El area del cuadrado es de "+ resultado);

        }else if (opcion==3) {
            Scanner entrada = new Scanner(System.in);
            double radio;
            System.out.println("Ingrese el valor del radio del círculo: ");
            radio = entrada.nextDouble();
            double area = Math.PI * Math.pow(radio, 2);
            System.out.println("El área del círculo es de " + area);
            
        }else if (opcion == 4){
            System.out.println("Muchas gracias por usar nuestro sistema.");
            break;
            
        }else {
            System.out.println("Opcion no valida, intente de nuevo");
            }
        }
    }
}
