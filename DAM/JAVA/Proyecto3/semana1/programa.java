package semana1;

import java.util.Scanner;

public class programa {

    public static void main(String[] args) {

        /*int edad = 0, tempertura = 0;
        int [] vector = {1,2,3,4,5,6};
        System.out.println("Dime tu edad: ");
        edad = leerEntero();
        System.out.println("La edad es: "+edad);
        System.out.println("Dime ahora tu tempertura: ");
        tempertura = leerEntero();
        System.out.println("Tu temperatura es: "+tempertura);

        System.out.println("La suma de edad y temperatura es = "+ matematicas.sumaDos(edad, tempertura));
        
        System.out.println("La longitud del vector es: "+ matematicas.LongitudVector(vector));
        matematicas.imprimirVector(vector);*/

        int a = 4;
        int [] vector = {7,7,7,7,7,7};
        matematicas.sumarUnoEntero(a);
        System.out.println("La variables a es: "+ a);
        matematicas.sumarUnoArray(vector);
        matematicas.imprimirVector(vector);

        int resultado1 = matematicas.CalcularFactorial(a);
        int resultado2 = matematicas.CalcularFactorialRecursivo(a);

        System.out.println("El factorial de "+a+" es: "+resultado1);
        System.out.println("El factorial de "+a+" es: "+resultado2);
    }


    public static int leerEntero(){
        Scanner sc = new Scanner(System.in);
        
        do{
            if(sc.hasNextInt()){
                return sc.nextInt();
            }else {
                System.out.println("Error, introduce un entero por favor: ");
                sc.next();
            }
        }while(true);
        
    }


}
