/* Ejercicio de condicionales
 * Haremos un recomendador de películas en base a 2 factores: genero y duracion
 * 
 * El género favorito del usuario (acción, terror, drama, ciencia ficción)
 * La duración que desea (menos de 90m, entre 90 y 120m, más de 120m)
 * 
 * El programa debe:
 * Pedir al usuario que ingrese su género favorito y la duración deseada
 * Usar condicionales para recomendar una película específica según la 
 * combinación de género y duración
 * 
 * Mostar un mensaje si el género o la duración no están disponibles
 */


public class RecomendadorPeliculas{

    public static void main(String[] args) {
        String genero = args[0];
        int duracion = Integer.parseInt(args[1]); //Este método convierte lo que hay dentro del argumento a INT
        
        /*De esta forma definimos las variables declarándolas en la consola
         * Poniendo por ejemplo el RecomendadorPeliculas.java Terror 90
         * ¿Ves? el archivo va seguido de los argumentos que le he pasado
         * El 90 lo pasa como String (recuerda que args es array de tipo String), 
         * y con el método que definimos antes lo pasamos a INT para que luego nuestro programa
         * trabaje con el como int porque así lo necesitamos
         */

        if (genero.equalsIgnoreCase("Terror")){
            
            if (duracion<90){
                System.out.println("Te recomiendo A Quiet Place (94 minutos)");
            }
            else if (duracion >= 90 && duracion < 120) {
                System.out.println("Te recomiendo Silent Hill 2 (112 minutos)");
            }
            else  {
                System.out.println("Te recomiendo No apagues la luz (168 minutos)");
            }
           
            
        } else if (genero.equalsIgnoreCase("Acción")) {
            if (duracion<90){
                System.out.println("Te recomiendo Sed de Venganza (90 minutos)");
            }
            else if (duracion > 90 && duracion < 120) {
                System.out.println("Te recomiendo El caballero oscuro (112 minutos)");
            }
            else {
                System.out.println("Te recomiendo Misión Imposible (168 minutos)");
            }
           
        } else if (genero.equalsIgnoreCase("Drama")) {
            if (duracion<90){
                System.out.println("Te recomiendo Lo que el viento se llevó (90 minutos)");
            }
            else if (duracion > 90 && duracion < 120) {
                System.out.println("Te recomiendo El niño del pijama de rayas (112 minutos)");
            }
            else {
                System.out.println("Te recomiendo Titanic (168 minutos)");
            }

        } else if (genero.equalsIgnoreCase("Ciencia ficción")) {
            if (duracion<90){
                System.out.println("Te recomiendo ET (90 minutos)");
            }
            else if (duracion > 90 && duracion < 120) {
                System.out.println("Te recomiendo Regreso al futuro (112 minutos)");
            }
            else {
                System.out.println("Te recomiendo Interstellar (168 minutos)");
            }

        } else {
            System.out.println("El género no está disponible");
        }

       
    }
}