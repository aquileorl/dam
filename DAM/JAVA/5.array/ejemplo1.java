import java.util.Scanner;

public class ejemplo1{
    public static final int TAMANYO = 10;
    public static void main(String[] args){

       

        //Vamos a recoger notas de 10 alumnos
        Scanner sc = new Scanner(System.in);
        //Reservamos espacio para las 10 notas
        int[] notas = new int[10];
        //También se puede inicializar de la siguiente manera:
        int [] notas2 = {1,2,3,4,5,6,7,8,9,10};
        //También:
        int [] notas4 = new int[TAMANYO];
        


        //DIME LA PRIMERA NOTA
        System.out.print("Dime la primera nota: ");
        notas[0] = sc.nextInt();

        //DIME LA SEGUNDA NOTA
        System.out.print("Dime la segunda nota: ");
        notas[1] = sc.nextInt();

        //AHORA MUESTRA LAS NOTAS
        System.out.println("Nota 1: "+ notas[0]);
        System.out.println("Nota 2: "+ notas[1]);

        //PARA RELLENAR NOTAS DE FORMAS MÁS EFICIENTE Y RÁPIDO PODEMOS USAR FOR. DE LA SIGUIENTE MANERA:
        int [] notas3 = new int[10];

        for(int i= 0; i<10; i++){
            
            System.out.print("\n Dime la nota: ");
            
                if(sc.hasNextInt()){
                    notas3[i] = sc.nextInt();            
                } else {
                    System.out.println("Nota no válida, inserte otra: ");
                    sc.next();
                        while(!sc.hasNextInt()){
                            System.out.println("ESO NO ES UNA NOTA VÁLIDA: ");
                            sc.next();
                        }
                    notas3[i] = sc.nextInt();
                    
                    
                 }
        }

        for(int contador=0; contador<notas3.length; contador++){
            System.out.println("La nota "+ contador +" es : "+notas3[contador]);
        }

        //PIDO LA NOTA MEDIA
        float media = 0;
        int notas_acumuladas = 0;
        
        for(int i2=0 ; i2<notas3.length ; i2++){
            notas_acumuladas += notas3[i2];
        }
        media = notas_acumuladas / notas3.length;
        System.out.println("LA NOTA MEDIA ES: "+media);
            
            
        }
    }


