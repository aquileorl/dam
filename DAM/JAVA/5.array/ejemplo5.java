import java.util.Random;

public class ejemplo5 {
    
    public static int TAMANYO = 5;

    public static void main(String[] args){
        //MATRIZ TRIDIMENSIONAL
        int[][][] cubo = new int[TAMANYO][TAMANYO][TAMANYO];
        Random rand = new Random();

        //RELLENAMOS EL CUBO
        for (int i = 0; i < TAMANYO; i++) {
            for (int j = 0; j < TAMANYO; j++) {
                for (int k = 0; k < TAMANYO; k++) {
                    cubo[i][j][k] = rand.nextInt(100)+1;
                }
                
            }  
        }

        //MOSTRAR EL CUBO
        for (int i = 0; i < TAMANYO; i++) {
            for (int j = 0; j < TAMANYO; j++) {
                for (int k = 0; k < TAMANYO; k++) {
                    System.out.println("cubo["+i+"]["+j+"]["+k+"] = "+cubo[i][j][k]);
                }
                
            }  
        }
    }
}
