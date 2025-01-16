
import java.util.Arrays;



public class ejemplo3 {
    public static int MAX_VECTOR = 10;

    public static void main (String [] args){
        int [] miVector = {1,2,3,4,5,6,7,8,9,10};
        int [] notas = new int[10];

        for(int i=0;i<MAX_VECTOR;i++){
            notas[i] = 0;
        }

        //COPIANDO LA REFERENCIA (DIRECCIÓN DE MEMORIA)
        miVector = notas;
        miVector[0]=10;

        System.out.println(miVector[0]); //ESTO SERÁ IGUAL A 10
        System.out.println(notas[0]); // ESTO SERÁ IGUAL A 10 TAMBIÉN

        //CÓMO COPIAR LOS ARRAYS MANTENIENDO CADA UNO SU DIRECCIÓN DE MEMORIA

        for(int i=0; i < miVector.length ; i++){
            miVector[i] = notas[i];
        }

        /*Lo anterior es una forma. Pero los arrays tienen también métodos propios 
         * Para ello importamos el import java.util.Arrays;
         * Y podemos usar el siguiente método que hay abajo para copiar arrays.
         * 
        */

        System.arraycopy(notas, 0, miVector, 0, miVector.length);
        /* 
         * Los argumentos del método va así: 
         * (vector que quiero copiar, posición de inicio desde donde empezar la copia, 
         * vector de destino, posición de la que empezaré a copiar, número de elementos a copiar)
         * 
         * En el ejemplo arriba puesto, significa:
         * Quiero copiar el contenido del vector notas, desde la posición 0, al vector miVector, desde
         * la posición 0, tantos elementos tengo miVector como tamaño.
         * 
         * Este método de Arrays hace lo mismo que hicimos con el bucle FOR de más arriba.
         * 
        */

        // OTRO EJEMPLO
        int [] arr1 = {0,1,2,3,4,5};
        int [] arr2 = {5,10,20,30,40,50};

        System.arraycopy(arr1, 0, arr2, 0, 3); //este caso sólo copiará 3 elementos

        for(int i = 0; i<arr2.length;i++){  
            System.out.print(arr2[i] + " ");
        }

        System.out.println("\n");
        // EJEMPLO DONDE QUEREMOS CAMBIAR UNA POSICIÓN ESPECÍFICA
        // VAMOS A COPIAR LA POSICIÓN 3 DEL ARR1 EN LA POSICIÓN 2 DEL ARR2
        System.arraycopy(arr1 , 3, arr2 , 2 , 1 );
        for (int i = 0; i<arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        // MÉTODO EQUALS, NOS DICE SI AMBOS VECTORES/arrays CONTIENEN LO MISMO
        Arrays.equals(arr1, arr2);
        System.out.print(Arrays.equals(arr1, arr2));

        // OTRO MÉTODO -> CLONE (CLONAR)
        int [] arr3 = {0,1,2};
        int [] arr4 = arr3.clone();
        // Esto copiará en arr4 lo que hay en arr3. Lo clona. Pero no copia la dirección. Siguen
        // siendo arrays distintos. 

        arr3[0] = 10;
        //Esto dará 10 en la posición 0 del arr3. Pero la posición 0 del arr4 seguirá siendo 0;
        //porque esto copia contenido, no dirección de memoria.
        System.out.println("\n");
        System.out.print("El vector arr3 es: ");
        for(int i=0; i<arr3.length ; i++){
            System.out.print(arr3[i]+ " ");
        }
        System.out.println("El vector arr4 es: ");
        for(int i=0; i<arr4.length ; i++){
            System.out.print(arr4[i]+" ");
        }
    }   
}
