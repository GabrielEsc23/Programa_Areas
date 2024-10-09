import java.util.Scanner;

public class Programa_Areas{
    public static void main(String[] args){
        Scanner numero=new Scanner(System.in);
        int opcion;
        System.out.println("Selecciona una opcion" +
                "1.Área del Triángulo" +
                "2.Área del Cuadrado" +
                "3.Área del Círculo: ");
         opcion=numero.nextInt();
        if (opcion==1){
            Scanner entrada=new Scanner(System.in);
            float base,altura,resultado;
            System.out.println("Introduzca el valor de base del triángulo");
            base=entrada.nextFloat();
            System.out.println("Introduzca el valor de altura del triangulo");
            altura=entrada.nextFloat();
            resultado=(base*altura)/2;
            System.out.println("El valor del área del triángulo es de: "+resultado);

        } else if (opcion==2) {
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
        }
    }
}
