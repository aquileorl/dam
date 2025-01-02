

/*
 * PROYECTO 1: SOFTWARE SISTEMA DE GESTIÓN DE HOSPITALES
 * -> FASE 1. El programa debe:
 *      • Pedir los datos de un paciente (NUSS, síntoma, exploración inicial, nivel de 
        prioridad y temperatura actual del paciente).  
        • Controlar la corrección de los datos entrados. 
        • Mostrar por pantalla un resumen de los datos introducidos. 
 */

 import java.util.Scanner;

 public class Hospital{

       public final static int VALORMINIMO_NUSS = 100000;
       public final static int VALORMAXIMO_NUSS = 999999;
       public final static int VALORMINIMO_SINTOMA = 0;
       public final static int VALORMAXIMO_SINTOMA = 3;
       public final static int VALORMINIMO_EXPLORACION = 0;
       public final static int VALORMAXIMO_EXPLORACION = 3;
       public final static int VALORMINIMO_PRIORIDAD = 0;
       public final static int VALORMAXIMO_PRIORIDAD = 5;
       public final static int VALORMINIMO_TEMPERATURA = 27;
       public final static int VALORMAXIMO_TEMPERATURA = 45;


       public static void main(String[] args) {
              //Declaramos variables
           int nuss, sintoma, exploracion = 0, nivelPrioridad, temperaturaActual;
           String sintoma_paciente="";
           String exploracion_paciente="";
           Scanner sc = new Scanner(System.in);
           boolean verificador_nuss = false;
           boolean verificador_sintoma = false;
           boolean verificador_exploracion = false;
           boolean verificador_prioridad = false;
           boolean verificador_temperatura = false;

           System.out.print("¿NUSS?: ");
           nuss = sc.nextInt();

           if(nuss >= VALORMINIMO_NUSS && nuss <= VALORMAXIMO_NUSS){
              verificador_nuss = true;
           }  else{
                     while(verificador_nuss != true){

                     System.err.println("NUSS inválido. Inserte uno válido: ");
                     nuss = sc.nextInt();
                     if(nuss >= VALORMINIMO_NUSS && nuss <= VALORMAXIMO_NUSS){
                            verificador_nuss = true;
                     }
                     }
              }      
       

           System.out.println("¿Síntoma?");
           System.out.println("\t Dolor (0)");
           System.out.println("\t Lesión traumática (1)");
           System.out.println("\t Fiebre alta (2)");
           System.out.println("\t Confusión o desorientación (3)");
           System.out.print(": ");

           sintoma = sc.nextInt();
       
           if(sintoma >= VALORMINIMO_SINTOMA && sintoma <= VALORMAXIMO_SINTOMA){
              verificador_sintoma = true;
           } else {
              while(verificador_sintoma != true){
                     System.out.print("Valor síntoma incorrecto. Introduce uno correcto: ");
                     sintoma = sc.nextInt();
                     if (sintoma >= VALORMINIMO_SINTOMA && sintoma <= VALORMAXIMO_SINTOMA){
                            verificador_sintoma = true;
                     }
              }
           }
           
           switch (sintoma){
              case 0: System.out.println("Exploración: ");
                     System.out.println("\t Dolor torácico (0)");
                     System.out.println("\t Dolor abdominal (1)");
                     System.out.println("\t Dolor de cabeza (2)");
                     System.out.println("\t Migraña (3)");

                     exploracion = sc.nextInt();

                     if(exploracion >= VALORMINIMO_EXPLORACION && exploracion <= VALORMAXIMO_EXPLORACION){
                            verificador_exploracion = true;
                     } else {
                            while (verificador_exploracion != true){
                                   System.out.println("Valor de exploración erróneo. Prueba otra vez:");
                                   exploracion = sc.nextInt();
                                   if (exploracion >= VALORMINIMO_EXPLORACION && exploracion <= VALORMAXIMO_EXPLORACION) {
                                          verificador_exploracion = true;
                                   }
                            }
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
                     exploracion = sc.nextInt();
                     if(exploracion >= VALORMINIMO_EXPLORACION && exploracion <= VALORMAXIMO_EXPLORACION){
                            verificador_exploracion = true;
                            
                     } else {
                            while (verificador_exploracion != true){
                                   System.out.println("Valor de exploración erróneo. Prueba otra vez:");
                                   exploracion = sc.nextInt();
                                   if (exploracion >= VALORMINIMO_EXPLORACION && exploracion <= VALORMAXIMO_EXPLORACION) {
                                          verificador_exploracion = true;
                                   }
                            }
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
                     exploracion = sc.nextInt();
                     if(exploracion >= VALORMINIMO_EXPLORACION && exploracion <= VALORMAXIMO_EXPLORACION){
                            verificador_exploracion = true;
                     } else {
                            while (verificador_exploracion != true){
                                   System.out.println("Valor de exploración erróneo. Prueba otra vez:");
                                   exploracion = sc.nextInt();
                                   if (exploracion >= VALORMINIMO_EXPLORACION && exploracion <= VALORMAXIMO_EXPLORACION) {
                                          verificador_exploracion = true;
                                   }
                            }
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
                     exploracion = sc.nextInt();
                     if(exploracion >= VALORMINIMO_EXPLORACION && exploracion <= VALORMAXIMO_EXPLORACION){
                            verificador_exploracion = true;
                     } else {
                            while (verificador_exploracion != true){
                                   System.out.println("Valor de exploración erróneo. Prueba otra vez:");
                                   exploracion = sc.nextInt();
                                   if (exploracion >= VALORMINIMO_EXPLORACION && exploracion <= VALORMAXIMO_EXPLORACION) {
                                          verificador_exploracion = true;
                                   }
                            }
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
           
           System.out.print("¿Nivel de prioridad?: ");
           nivelPrioridad = sc.nextInt();
           if (nivelPrioridad >= VALORMINIMO_PRIORIDAD && nivelPrioridad <= VALORMAXIMO_PRIORIDAD){
              verificador_prioridad = true;
           } else{
              while (verificador_prioridad != true){
                     System.out.println("Nivel de prioridad incorrecto. Inserte nivel válido:");
                     nivelPrioridad = sc.nextInt();
                     if(nivelPrioridad >= VALORMINIMO_PRIORIDAD && nivelPrioridad <= VALORMAXIMO_PRIORIDAD){
                            verificador_prioridad = true;
                     }
              }
           }

           System.out.print("¿Temperatura actual?: ");
           temperaturaActual = sc.nextInt();
           if(temperaturaActual >= VALORMINIMO_TEMPERATURA && temperaturaActual <= VALORMAXIMO_TEMPERATURA){
              verificador_temperatura = true;
           } else {
              while(verificador_temperatura != true){
                     System.out.println("Temperatura errónea. Tómela otra vez: ");
                     temperaturaActual = sc.nextInt();
                     if(temperaturaActual >= VALORMINIMO_TEMPERATURA && temperaturaActual <= VALORMAXIMO_TEMPERATURA){
                            verificador_temperatura = true;
                     }
              }
           }

           System.out.println();

           System.out.println("NUSS        SÍNTOMA       EXPLORACIÓN       NIVEL DE PRIORIDAD       TEMPERATURA ACTUAL"); 
           System.out.println(nuss +"          " + sintoma + "              " + exploracion_paciente + "                         " +  nivelPrioridad + "               " +  temperaturaActual);
       }
 }