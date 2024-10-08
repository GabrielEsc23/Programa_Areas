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

        }
    }
}