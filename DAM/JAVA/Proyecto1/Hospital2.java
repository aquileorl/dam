

/*
 * PROYECTO 1: SOFTWARE SISTEMA DE GESTIÓN DE HOSPITALES
 * -> FASE 1. El programa debe:
 *      • Pedir los datos de un paciente (NUSS, síntoma, exploración inicial, nivel de 
        prioridad y temperatura actual del paciente).  
        • Controlar la corrección de los datos entrados. 
        • Mostrar por pantalla un resumen de los datos introducidos. 
 */

 import java.util.Scanner;

 public class Hospital2{

       //DECLARAMOS CONSTANTES

       public final static int VALORMINIMO_NUSS = 100000 , VALORMAXIMO_NUSS = 999999;
       public final static byte  VALORMINIMO_SINTOMA = 0, VALORMAXIMO_SINTOMA = 3;
       public final static byte VALORMINIMO_EXPLORACION = 0, VALORMAXIMO_EXPLORACION = 3;
       public final static byte VALORMINIMO_PRIORIDAD = 0, VALORMAXIMO_PRIORIDAD = 5;
       public final static int VALORMINIMO_TEMPERATURA = 27, VALORMAXIMO_TEMPERATURA = 45;
      

       //MÉTODO PRINCIPAL DE ENTRADA
       public static void main(String[] args) {
       
           //DECLARAMOS Y DEFINIMOS VARIABLES
           int nuss= 0, sintoma= 0, exploracion = 0, nivelPrioridad=0, temperaturaActual=0;
           String sintoma_paciente="";
           String exploracion_paciente="";
           boolean correcto = false;
           Scanner sc = new Scanner(System.in);
       
           System.out.println("Introduce Número Seguridad Social: ");
           System.out.println("Valores entre "+ VALORMINIMO_NUSS + " y " + VALORMAXIMO_NUSS);
           
           
           //NOS ASEGURAMOS VALOR CORRECTO
           do { 
              //¿Es tipo entero? Lo tenemos que comprobar
               if (sc.hasNextInt()){ 
                     //leemos la variable y comprobamos rango
                     nuss = sc.nextInt();
                     if ((nuss >= VALORMINIMO_NUSS) && (nuss <= VALORMAXIMO_NUSS)){
                            correcto = true; //se cumple condición para salir bucle
                     } else { 
                            System.out.println("Error en el rango.");
                            System.out.println("Valores válidos "+VALORMINIMO_NUSS+" - "+VALORMAXIMO_NUSS);
                            correcto = false; //no se cumple condición y repetimos bucle
                     }
               } else {
                     System.out.println("Error de tipo.");
                     System.out.println("Valores válidos "+VALORMINIMO_NUSS+" - "+VALORMAXIMO_NUSS);
                     sc.next();
                     correcto = false;
               }
           } while (!correcto);

           //IMPRIMIMOS MENÚ EN PANTALLA Y ELEGIMOS SINTOMA
           System.out.println("¿Síntoma?");
           System.out.println("\t Dolor (0)");
           System.out.println("\t Lesión traumática (1)");
           System.out.println("\t Fiebre alta (2)");
           System.out.println("\t Confusión o desorientación (3)");
           System.out.print(": ");

           sintoma = sc.nextByte();
           
           //ASEGURAMOS VALOR SINTOMA CORRECTO
           while (sintoma < VALORMINIMO_SINTOMA || sintoma > VALORMAXIMO_SINTOMA){
              System.out.println("Síntoma no registre. Elija uno registrado:");
              sintoma = sc.nextByte();
           }
           
           //ASIGNAMOS EXPLORACIÓN SEGÚN VALOR SÍNTOMA
           switch (sintoma){
              case 0: System.out.println("Exploración: ");
                     System.out.println("\t Dolor torácico (0)");
                     System.out.println("\t Dolor abdominal (1)");
                     System.out.println("\t Dolor de cabeza (2)");
                     System.out.println("\t Migraña (3)");
                     sintoma_paciente = "Dolor";

                     exploracion = sc.nextByte();

                     while (exploracion < VALORMINIMO_EXPLORACION || exploracion > VALORMAXIMO_EXPLORACION){
                            System.out.println("Exploración errónea. Escoja una exploración adecuada");
                            exploracion = sc.nextByte();

                     }
                     
                     switch(exploracion){
                            case 0: exploracion_paciente = "Dolor torácico";
                            break;
                            case 1: exploracion_paciente = "Dolor abdominal";
                            break;
                            case 2: exploracion_paciente = "Dolor de cabeza";
                            break;
                            case 3: exploracion_paciente = "Migraña";
                            break; 

                            default: System.err.println("Error");

                     }
                     break;
              case 1: System.out.println("Exploración: ");
                     System.out.println("\t Fractura osea (0)");
                     System.out.println("\t Herida de bala (1)");
                     System.out.println("\t Quemadura (2)");
                     System.out.println("\t Lesión cerebral traumática (3)");
                     sintoma_paciente = "Lesión traumática";

                     exploracion = sc.nextByte();
                     
                     while (exploracion < VALORMINIMO_EXPLORACION || exploracion > VALORMAXIMO_EXPLORACION){
                            System.out.println("Exploración errónea. Escoja una exploración adecuada");
                            exploracion = sc.nextByte();

                     }
                     
                     switch(exploracion){
                            case 0: exploracion_paciente = "Fractura ósea";
                            break;
                            case 1: exploracion_paciente = "Herida de bala";
                            break;
                            case 2: exploracion_paciente = "Quemadura";
                            break;
                            case 3: exploracion_paciente = "Lesión cerebral traumática";
                            break; 

                            default: System.err.println("Error");

                     }

                     break;

              case 2: System.out.println("Exploración: ");
                     System.out.println("\t Neumonía (0)");
                     System.out.println("\t Meningitis (1)");
                     System.out.println("\t Infección viral (2)");
                     System.out.println("\t Reacción alérgica (3)");
                     sintoma_paciente = "Fiebre alta";

                     exploracion = sc.nextByte();
                     
                     while (exploracion < VALORMINIMO_EXPLORACION || exploracion > VALORMAXIMO_EXPLORACION){
                            System.out.println("Exploración errónea. Escoja una exploración adecuada");
                            exploracion = sc.nextByte();

                     }
                     switch(exploracion){
                            case 0: exploracion_paciente = "Neumonía";
                            break;
                            case 1: exploracion_paciente = "Meningitis";
                            break;
                            case 2: exploracion_paciente = "Infección viral";
                            break;
                            case 3: exploracion_paciente = "Reacción alérgica";
                            break; 

                            default: System.err.println("Error");

                     }
                     
                     break;
              case 3: System.out.println("Exploración: ");
                     System.out.println("\t Intoxicación por drogas o alcohol (0)");
                     System.out.println("\t Deshidratación severa (1)");
                     System.out.println("\t Accidente cerebrovascular (2)");
                     System.out.println("\t Hipoglucemia severa (3)");
                     sintoma_paciente = "Migraña";

                     exploracion = sc.nextByte();

                     while (exploracion < VALORMINIMO_EXPLORACION || exploracion > VALORMAXIMO_EXPLORACION){
                            System.out.println("Exploración errónea. Escoja una exploración adecuada");
                            exploracion = sc.nextByte();

                     }

                     switch(exploracion){
                            case 0: exploracion_paciente = "Intoxicación por drogas";
                            break;
                            case 1: exploracion_paciente = "Deshidratación severa";
                            break;
                            case 2: exploracion_paciente = "Accidente cerebrovascular";
                            break;
                            case 3: exploracion_paciente = "Hipoglucemia severa";
                            break; 

                            default: System.err.println("Error");

                     }
                     break;
              default: System.out.println("Valor incorrecto");
           }
           
           //NIVEL DE PRIORIDAD
           System.out.print("¿Nivel de prioridad?: ");
           nivelPrioridad = sc.nextByte();

           //ASEGURAMOS DATO CORRECTO
           while( nivelPrioridad < VALORMINIMO_PRIORIDAD || nivelPrioridad > VALORMAXIMO_PRIORIDAD){
              System.out.println("Valor incorrecto. Vuelva a asignar prioridad: ");
              nivelPrioridad = sc.nextByte();
           }

           //PEDIMOS LA TEMPERATURA
           System.out.print("¿Temperatura actual?: ");
           temperaturaActual = sc.nextInt();
           
           //ASEGURAMOS TEMPERATURA CORRECTA
           while(temperaturaActual < VALORMINIMO_TEMPERATURA || temperaturaActual > VALORMAXIMO_TEMPERATURA){
              System.out.println("Temperatura incorrecta. Inserte un nivel válido: ");
              temperaturaActual = sc.nextInt();
           }

           System.out.println();

           System.out.println("NUSS       SÍNTOMA       EXPLORACIÓN           NIVEL DE PRIORIDAD       TEMPERATURA ACTUAL"); 
           System.out.println(nuss +"     " + sintoma_paciente + "      " + exploracion_paciente + "       " +  nivelPrioridad + "\t\t      " +  temperaturaActual);
       }
       
 }