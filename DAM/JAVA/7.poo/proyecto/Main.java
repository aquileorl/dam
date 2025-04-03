package proyecto;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /* 
        int opcion;
        String nombre;
        int auxPerros;
        int recurso1;
        
        
        Scanner sc = new Scanner(System.in);

        Perro [] perros = new Perro[100];

        do { 

            //DAMOS OPCIONES  - MENU
            opcion = menu();
            //SEGÚN OPCIÓN HACEMOS
            
            switch (opcion) {
                
                case 1:
                    System.out.println("Ha nacido un nuevo cachorro");
                    System.out.println("¿Cómo lo vamos a llamar?:"); 
                    nombre = sc.next();
                    perros[Perro.numPerros] = new Perro(nombre);
                    Perro.numPerros++;
                break;

                case 2:
                    System.out.println("¿Qué perro puede comer? Hay "+ (Perro.numPerros - 1));
                    auxPerros = sc.nextInt();
                    perros[auxPerros].comer();
                    System.out.println("Gracias por alimentarme =)");

                break;

                case 3:
                    System.out.println("¿Qué perro va a jugar? Empieza desde el cero"+ Perro.numPerros);
                    
                    //comprobamos que la opción de tipo entero es válida es válida
                    while(!sc.hasNextInt()){
                        System.out.println("Opción no válida. Inserta entero entre 0 y " + Perro.numPerros);
                        sc.next(); //limpiamos buffer memoria
                    }

                    recurso1 = sc.nextInt();

                    while(!(recurso1 <= Perro.numPerros)){
                        System.out.println("Ese perro no existe. Inserte entre 0 y "+ Perro.numPerros);
                        recurso1 = sc.nextInt();
                    }
                               
                    auxPerros = recurso1;
                    perros[auxPerros].jugar();
                    System.out.println("¡Qué bien me lo he pasado! Guau Guau");
                    
                    

                break;

                case 4: 
                    System.out.println("¿Qué perro va a dormir? Hay"+ Perro.numPerros);
                    auxPerros = sc.nextInt();
                    perros[auxPerros].dormir();
                    System.out.println("ZzzZzZZzzZ");
                break;

                case 5:
                    System.out.println("¿De qué perro quieres información? Hay "+ Perro.numPerros);
                    auxPerros = sc.nextInt();
                    perros[auxPerros].mostrarEstado();
                break;

                case 6: 
                    System.out.println("Gracias por jugar. Hasta la vista");
                break;

                default:
                    System.out.println("Opción no válida.");

            }

            
        } while (opcion != 6); */

        //VAMOS A CREAR UN NUEVO GATO
        Gato gato1 = new Gato("feliz", "Rodolfo", 10);
        gato1.hacerSonido();
        gato1.maullar();

        Perro perro1 = new Perro("Rocky", 0, 5 , 5, "Feliz");
        perro1.hacerSonido();
        

    }

    public static int menu(){
        
        Scanner sc = new Scanner(System.in);
        

        System.out.println("1. Crear perro");
        System.out.println("2. Dar de comer");
        System.out.println("3. Jugar");
        System.out.println("4. Dormir");
        System.out.println("5. Mostrar estado");
        System.out.println("6. Salir");

        System.out.println("Elige opción: ");
        
        return sc.nextInt();
        

    }

}
