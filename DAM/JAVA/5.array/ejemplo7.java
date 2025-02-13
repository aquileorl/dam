
import java.util.Arrays;

public class ejemplo7 {

    public static int TAMANYO = 5;
    
public static void main(String[] args){

    int [] valores = new int[TAMANYO];

    //Método para rellenar array si lo quiero inicializar
    Arrays.fill(valores, 0); //me rellena el array a ceros
    Arrays.fill(valores, -1); //me rellena el array a -1

    for (int i = 0; i < TAMANYO; i++) {
        System.out.println(valores[i]);
    }

    Arrays.fill(valores,0); //rellena el array a ceros
    Arrays.fill(valores, 2, 4, -1); // DESDE LA POSICIÓN 2 HASTA LA 4, LOS VALORES SERÁN -1º
    for (int i = 0; i < TAMANYO; i++) {
        System.out.println(valores[i]);
    }
    
    

    //MÉTODO PARA ORDENAR LOS VALORES DEL VECTOR

    int [] numeros = {1,66,4,5,7,88};

    Arrays.sort(numeros);

    for(int i = 0 ; i < numeros.length ; i++){
        System.out.print(numeros[i]+" ");
    }
    System.out.println();

    //MÉTODO PARA ORDENADOR VECTORES - BURBUJA
    
    
    
}

}
