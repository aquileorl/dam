
//ENCONTRAR UN NÚMERO DETERMINADO DENTRO DE UN ARRAY Y MOSTRAR LA POSICIÓN EN LA QUE SE ENCONTRÓ

import java.util.Scanner;


public class ejemplo2 {

    public static final int TAMANYO = 5;

    public static void main(String[] args){

        int [] numeros = new int[TAMANYO];
        int numero_a_buscar = 0;
        boolean encontrado = false;
        int posicion = 0;
        Scanner sc = new Scanner(System.in);

        //PIDE LA LISTA DE NUMEROS
        for(int i=0; i<TAMANYO; i++){
            System.out.println("Inserta el número "+i+": ");
            numeros[i] = sc.nextInt();
        }

        //AHORA PIDE UN NÚMERO A BUSCAR
        System.out.println("Inserta el número que quieres buscar: ");
        numero_a_buscar = sc.nextInt();

        //AHORA VAMOS A BUSCAR
        for(int j=0; j < numeros.length; j++){
            if(numeros[j] == numero_a_buscar){
                posicion = j;
                encontrado = true;
            } 
        }

        //AHORA VAMOS A DELIBERAR RESULTADOS EN FUNCIÓN DE SI FUE ENCONTRADO O NO
        if (encontrado) {
            System.out.println("El número fue encontrado en la posición "+ posicion );
        } else {
            System.out.println("Lo siento, el número buscado no está en la lista.");
        }

    } 
}
