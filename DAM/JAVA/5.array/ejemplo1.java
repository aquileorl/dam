import java.util.Scanner;

public class ejemplo1{
    public static void main(String[] args){

        //Vamos a recoger notas de 10 alumnos
        Scanner sc = new Scanner(System.in);
        //Reservamos espacio para las 10 notas
        int[] notas = new int[10];

        //DIME LA PRIMERA NOTA
        System.out.print("Dime la primera nota: ");
        notas[0] = sc.nextInt();

        //DIME LA SEGUNDA NOTA
        System.out.print("Dime la segunda nota: ");
        notas[1] = sc.nextInt();

        //AHORA MUESTRA LAS NOTAS
        System.out.println("Nota 1: "+ notas[0]);
        System.out.println("Nota 2: "+ notas[1]);
    }
}

