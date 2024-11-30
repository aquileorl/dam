

public class bucles {

    public static void main(String[] args) {
          
        //Bucle for
        for (int i=0; i<5; i++){
            System.out.println("El valor de i es: "+i);
        }

        for(int z = 0; z<10 ; z++){
            if (z<9) {
                System.out.println("No soy el último jeje");
            } else{
                System.err.println("Vaya, he llegado el último");
            }
        } 

        //Bucle while
        
        int contador = 0;
        while (contador < 10) { 
            System.err.println("El contador muestra el número: "+contador);
            contador++;
        }
        System.err.println("El contador terminó en: "+contador);


        //Bucle DO-WHILE
        int contador2 = 0;
        do{
            System.out.println("El contador del DO es: "+contador2);
            contador2++;
        }while(contador2 < 10 );
    }

}


