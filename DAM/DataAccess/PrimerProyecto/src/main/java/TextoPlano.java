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
        List<Cliente> clientes = List.of( //Este tipo de List.of, lo que hace de fondo es instanciar un new ArrayList();
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
                /*
                * Le pasamos 1er argumento la ruta a la que escribirá
                * Le pasamos de 2 argumento los caracteres que soportará*/
        ){
            /*Ahora creamos un bucle-for para escribir cada uno de los clientes en el fichero.
            * Recordar que la unidad de lectura y escritura es línea a línea, así que habrá que
            * meter un salto de línea "a mano"*/
            for (Cliente c : clientes){
                bw.write(c.getId() + ";"+ c.getNombre()+";"+c.getEmail()+";"+c.getSaldo());

                bw.newLine(); //esto realizará el salto de línea
            }

            System.out.println("Escrito en " + RUTA.toAbsolutePath());
            //Aquí ponemos la ruta absoluta, no la relativa.
            //--> La relativa nos tomaría solo la carpeta raíz del proyecto
            //--> La absoluta nos tomará toda la ruta que sigue en el sistema

        } catch (IOException e) {
            e.printStackTrace(); //nos dirá qué tipo de incidencia ha habido, en caso de existir
        }

        //AHORA VAMOS A PROCEDER CON LA LECTURA
        //Vamos a crear una lista distinta a la de arriba.
        //Creamos una lista de objetos de clase Cliente.
        List<Cliente> leidos = new ArrayList<>();

        try (
                /*
                * Creamos un Objeto BufferedReader para leer del archivo.
                * Recordamos que a la hora de instanciarlo le pasamos 2 argumentos:
                * 1er argumento --> Ruta desde donde leerá
                * 2º argumento --> Los caracteres que soportará su lectura/escritura
                * */
                BufferedReader br = Files.newBufferedReader(RUTA, StandardCharsets.UTF_8);
        ){
            //Vamos a leer línea a línea, lo mejor es guardar cada línea en una variable que vaya leyendo
            String linea;

            //Ahora necesitamos un bucle que vaya recorriendo línea a línea.
            /*
            * ¿Pero cómo sabemos en la lectura cuando debe parar de leer?
            * En la escritura es fácil, cuando ya no hay más elementos en el for, acabará.
            * Pero ¿y en la lectura? Pues cuando encuentre "null".
            * */
            while( (linea = br.readLine()) != null ){
                //El metodo de readLine() ya incluye la lectura de la línea con el correspondiente salto de línea posterior
                //--> Ahora el contenido de la línea nos interesa "trocearla" y separar cada variable
                /*Para hacer lo de arriba haremos lo siguiente:
                * 1º--> Para meter la información "troceada" en un vector de String, así que 1º crear vector String.
                * 2º--> Utilizaremos el metodo split de la clase String para la función de "trocear"
                * 3º--> Vimos en el MASTEr que el metodo split se le ponia como argumento solo el separador,
                *   que en nuestro caso sería el ";". Eso estaría bien en nuestro ejemplo, pero, qué pasaría si
                *   en nuestra linea hubiese un atributo vacío? Ejemplo: "1";"Ana"; ; 1200. Si usáramos
                *   split(";") saltaría ese vacío y nos metería en nuestro vector de String el 4º atributo en el
                *   campo del 3º atributo. Y estaría mal. Para solucionar esto metemos un -1 como segundo
                *   argumento del split. Esto dará la orden que si encuentra vacío lo guarde como null*/
                String[] partes = linea.split(";",-1);

                if( partes.length !=4 ){
                     System.err.println("Línea con formato incorrecto" + linea);
                }

                try {

                    int id = Integer.parseInt(partes[0]);
                    String nombre = partes[1];
                    String email = partes[2];
                    double saldo = Double.parseDouble(partes[3]);

                    leidos.add(new Cliente(id, nombre, email, saldo));

                } catch (NumberFormatException ex){
                    System.err.println("Error en: "+ linea);
                }

            }


        } catch (IOException e){
            e.printStackTrace();
        }

        leidos.forEach(System.out::println);
    }
}
