import java.util.Random;

public class ejemplo4 {

    public static int TAMANYO=5;

    public static void main(String[] args){
        
        // int [][] miMatriz = new int[3][5];

        // MATRIZ BIDIMENSIONAL. IDENTIFICAR MÁXIMO Y MÍNIMO
        int [][] matriz = new int [TAMANYO][TAMANYO];
        Random rand = new Random();
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        // -> Vamos a rellenar la matriz con números aleatorios
        for(int i=0 ; i < matriz.length ; i++){
            for(int j = 0; j < matriz[i].length ; j++){
                matriz[i][j] = rand.nextInt(100)+1; //este método rellenará con 100 elementos posibles,
                // del 0 al 99, si queremos al 100, sumamos 1.
            }
        }

        menor = matriz[0][0];
        mayor = matriz[0][0];
        /*También podemos hacer en lugar de iniciar las dos variables de esta forma, 
         * inicializarlas al principio con los siguientes métodos:
         *      mayor = Integer.MIN_VALUE;
         *      menor = Integer.MAX_VALUE;
         */

        // -> Vamos a imprimir la matriz
        for(int i=0 ; i < matriz.length ; i++){
            for(int j = 0; j < matriz[i].length ; j++){
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println();
        }


        // -> Si queremos generar número aleatorio entre 5 y 15
        System.out.println(rand.nextInt(15-5+1)+5);

        //Buscar máximo y mínimo
        for(int i = 0; i<matriz.length ; i++){
            for(int j = 0; j<matriz[i].length;j++){
                if ((matriz[i][j]) > mayor ){
                    mayor = matriz[i][j];
                } else if(matriz[i][j] < menor){
                    menor = matriz[i][j];
                }

                
            }
        }
        System.out.println("El elemento máximo es -> "+ mayor);
        System.out.println("El elemeno mínimo es -> "+ menor);
    }
    
}
