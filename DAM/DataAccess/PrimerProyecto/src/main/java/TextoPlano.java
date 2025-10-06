import java.nio.file.*; //aqui en nio new input output tenemos las funciones de file, incluira clases de libreria nio
//como el path que hablamos en los apuntes. Para crear, escribir, truncar archivos
import java.nio.charset.StandardCharsets; //para caracteres especiales no den problemas
import java.io.*; //aqui tienes las clases como filereader y filewriter
import java.util.*;  //para colecciones, listas, fechas

public class TextoPlano {

    private static Path RUTA = Paths.get("clientes.txt"); //ir a la carpeta rapiz del proyecto donde este el archivo
    //c:/users/peponcia/...../clientes.txt
    //si entre parentesis no ponemos el "clientes.txt" nos dará la carpeta raiz del proyecto

    public static void main(String[] args){

        //lista clientes
        List<Cliente> clientes = List.of();
    }
}
