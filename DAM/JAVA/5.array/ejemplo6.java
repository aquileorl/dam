
import java.util.Random;

public class ejemplo6 {

    public static int TAMANYO = 5;

    public static void main(String[] args){

        int[][][] ventas = new int[TAMANYO][TAMANYO][TAMANYO];
        Random rand = new Random();

        //QUEREMOS SABER LAS VENTAS POR REGIÓN, PRODUCTO Y TRIMESTRE

        for (int i = 0; i < TAMANYO; i++) {
            for (int j = 0; j < TAMANYO; j++) {
                for (int k = 0; k < TAMANYO; k++) {
                    ventas[i][j][k] = rand.nextInt(100)+1;
                    
                }
                
            }
            
        }

        // MOSTRAMOS LAS VENTAS
        System.out.println("REPORTE DE VENTAS: ");
        for (int i = 0; i < ventas.length; i++) {
            System.out.println("REGION "+(i+1)+": ");
            for(int j=0; j < ventas[i].length ; j++){
                System.out.println("PRODUCTO "+(j+1)+": ");
            
                for(int k=0 ; k < ventas[i][j].length ; k++){
                    System.out.print("ventas: "+ ventas[i][j][k] + " ");
                    }
                System.out.println();
            }
            System.out.println();
        }

    }
    
}
