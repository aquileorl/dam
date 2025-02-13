public class ejemplo2 {
    public static void main(String[] args) {
        int [] vector = {3,2,1};
        int [] vector2= {4,5,6};

        System.out.print("El primer vector es: ");
        showArray(vector);
        
        System.out.print("El segundo vector es: ");
        showArray(vector2);
        
        System.out.println("Ahora vamos a copiar el vector2 en vector1");
        arrayCopy(vector, vector2);
        
        System.out.print("El primer vector es: ");
        showArray(vector);
        
        System.out.print("El segundo vector es: ");
        showArray(vector2);

    }

    public static void arrayCopy(int [] a, int [] b){
        for (int i = 0; i<a.length; i++){
            a[i] = b[i];
        }
    }

    public static void showArray(int [] a){

        for(int i = 0; i<a.length;i++){ 
            System.out.print(a[i]+" ");
        }
        System.out.println();

    }
}
