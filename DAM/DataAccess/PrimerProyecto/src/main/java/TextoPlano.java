import java.nio.file.*; //aqui en nio new input output tenemos las funciones de file, incluira clases de libreria nio
/*
* La librería nio (New Input Output) contiene funciones de File y otras clases de librería nio
* como el Path. Además de otras clases para crear, escribir y truncar archivos.
 */
import java.nio.charset.StandardCharsets;
/*
* La librería de nio.charset.StandardCharsets es para que no haya problemas a la hora de trabajar
* en las importaciones y exportaciones con caracteres especiales
* */

import java.io.*; //Aquí tenemos clases como las de Filereader y Filewriter
import java.util.*;  //Librería para clases de listas, colecciones, fechas, etc.

public class TextoPlano {

    private static Path RUTA = Paths.get("clientes.txt"); //ir a la carpeta rapiz del proyecto donde este el archivo
    //c:/users/peponcia/...../clientes.txt
    //si entre parentesis no ponemos el "clientes.txt" nos dará la carpeta raiz del proyecto

    public static void main(String[] args){

        //lista clientes
        List<Cliente> clientes = List.of( //Este tipo de List, lo que hace de fondo es instanciar un new ArrayList();
                new Cliente(1, "Ana", "ana@correo.com", 1200),
                new Cliente(2, "Juan", "juan@correo.com", 1500),
                new Cliente(3, "Leo", "coronado@correo.com", 1800)
        );

        /*Vamos a crear ahora un objeto BufferedWriter: para así poder escribir en el fichero
        * En otras palabras, establece un canal de comunicación entre nuestro código Java y el fichero
        * que va a estar dentro de nuestra carpeta*/
        //BufferedWriter bw = Files.newBufferedWriter(RUTA, StandardCharsets.UTF_8);
        /*De por sí solo, la línea de arriba daría error. Hay que controlarlo sí o sí por excepciones.
        * Así que lo vamos a controlar de la siguiente manera:*/
        try (
                BufferedWriter bw = Files.newBufferedWriter(RUTA, StandardCharsets.UTF_8)
        ){
            /*Ahora creamos un bucle-for para escribir cada uno de los clientes en el fichero.
            * Recordar que la unidad de lectura y escritura es línea a línea, así que habrá que
            * meter un salto de línea "a mano"*/
            for (Cliente c : clientes){
                bw.write(c.getId() + ";"+ c.getNombre()+";"+c.getEmail()+";"+c.getSaldo());

                bw.newLine(); //esto realizará el salto de línea
            }

            System.out.println("Escrito en " + RUTA.toAbsolutePath());

        } catch (IOException e) {
            e.printStackTrace(); //nos dirá qué tipo de incidencia ha habido, en caso de existir
        }
    }
}
