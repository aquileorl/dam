
public class ejemplo8 {
    public static int TAMANYO = 5;

    public static void main(String[] ards){
        
        int tmp;
        int [] valores = {4,5,1,88,4,5,66,18};

        //MÉTODO DE ORDENAR VECTORES - BURBUJA

        for(int i = 0; i < valores.length ; i++){
            for(int j = valores.length-1 ; j > i ; j--){
                if(valores[j]<valores[j-1]){
                    tmp = valores[j];
                    valores[j] = valores[j-1];
                    valores[j-1] = tmp;
                }
            }
        }

        for(int i = 0 ; i<valores.length ; i++){

            System.out.print(valores[i]+" ");
        }
    }
}