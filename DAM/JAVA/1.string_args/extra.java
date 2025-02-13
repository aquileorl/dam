
import java.util.Scanner;

public class extra{
    public static void main(String[] args){



        /*
        Añadir entrecomillado dentro del imprimir por pantalla
        usando el carácter especial \" \"
         */
        System.out.println("Hola qué tal estás \"don gato\"");

        //Ahora usamos el \n para que pegueño un salto en la propia frase
        System.out.println("Hola qué tal estás \n don gato");

        //Ahora usamos tabulación con \t
        System.out.println("Hola qué tal estás \n \t don gato");

        //Usamos la \\ para escribir
        //Ahora usamos tabulación con \t

        System.out.println("Hola qué tal estás \\ don gato\\");
        //Usamos salto de página usando \f
        //Ahora usamos tabulación con \t
        System.out.println("Hola qué tal estás \f don gato");



        //Ahora vamos con variables

        /*
        Puedo declarar tantas variables del mismo tipo como quiera, incluso definir
        algunas y otras dejarlas sin valor. El profesor, como consejo, nos dice que
        intentemos definir las variables de inicio.
         */
        int a,b, c=10;
        String nombre;
        nombre= ""; //Recomienda inicializar, es buena práctica
        System.out.println("Dime tu nombre: ");
        Scanner sc = new Scanner(System.in);
        nombre = sc.nextLine();

        /*
        * NOTA IMPORTANTE: NO QUIERE NOMBRES DE VARIABLES COMO a,b,c, o n.
        * Quiere nombres de variables que signifiquen algo y tengan coherencia.
        * Es un 0 automático en el examen si no lo hacemos así
        * */

        int operando1 = 0, operando2 = 0;
        operando1 = operando1 + operando2; //aquí realiza la suma de números enteros
        nombre = nombre + operando1; // aquí concatena el nombre y el caracter del operando1

        System.out.println(nombre);

        // SEGUIMOS PROBANDO COSAS

        operando1++; //Esto sumará 1

        if(operando1<1){
            System.out.println("Operando1 es menor que 1");
        } else{
            System.out.println("Operando1 es igual o mayor que 1");
        }

        //Otra forma de decirlo también sería de la siguiente manera:

        int operando3=0;
        if(++operando3 < 1){
            System.out.println("Operando3 es menor que 1");
        } else{
            System.out.println("Operando3 es igual o mayor que 1");
        }
         //Y por qué no poner dentro del if el (operando3++ <1)
        /*
        -> Dentro del paréntesis:
            -> (++operando3 <1) PRIMERO SUMA Y LUEGO HACE COMPARACIÓN
            -> (operando3++ <1) PRIMERO HACE COMPARACIÓN Y LUEGO SUMA
         */


        //Ahora vamos con booleanos y sus operadores
        boolean continuar= true;
        /*
        Los operadores son el AND, OR, NOT, XOR
        AND -> &&
        OR -> ||
        NOT -> !=
        XOR -> ^

        && devuelve true cuando ambos objetos a comparar son true, sino devolverá false
        || solo devolverá false si ambos objetos a comparar son false, todos los demás casos serán true
        ^ solo devolverá true si un objeto a comparar es true y el otro false, sino siempre false
         */
        if ((operando1<1) && continuar){
            System.out.println("Eres verdadero tio");
        } else{
            System.out.println("NO ERES REAL");
        }

        //OPERADOR TERNARIO
        // Esto sería un IF-TERNARIO
        continuar = (operando1 <= 10) ? true : false;
        /*
        Con esto de arriba indico primero que es una operación, y luego que me devuelva true
        o me devuelva false en función del resultado de la operación.
         */

        //Otra posibilidad sería:
        operando1 = (operando1<5) ? 0:-1; //me devuelve 0 si es correcto y -1 en cualquier otro caso

        //Switch

        switch (operando1){ //dentro de la condicion escribimos lo que vamos a valuar
            case 1: System.out.println("1");
                break; //Si no ponemos el break el codigo seguirá ejecutando los siguientes casos

            case 2: System.out.println("2");
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            default: System.out.println("Valor incorrecto");

         /*
            Ojo atención! -> El profesor nos dice que el switch es el único caso donde usaremos el break.Básicamente
            porque es obligatorio. Si no lo usamos dentro del switch tras el case que cumpla condicion, seguirá
            ejecutando igualmente los case que haya más abajo también.

            Fuera del switch nos lo prohíbe. Dice que está fatal, es una mala praxis. Que si necesitamos un
            break es porque no hemos hecho previamente bien el IF.

            El break sirve para romper bucle. Lo cual nosotros ya deberíamos saber romperlo con la condición
            del if.

             */
        }
        //Vamos a poner un ejemplo de mala praxis con el break
        for(int i = 1; i<5; i++){
            System.out.println("El valor de i es: "+i);
            break; //en este ejemplo solo imprimira el 1 y luego romperá el bucle
        }
    }
}