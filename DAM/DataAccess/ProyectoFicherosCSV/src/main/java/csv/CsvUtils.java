package csv;

import java.util.ArrayList;
import java.util.List;

public class CsvUtils {


    // Ana, "Petardos,SL", 2300

    //Nuestra función debe convertir a una lista tal que así:
    //["Ana", "Petardos,SL", "2300"]

    private CsvUtils() {}

    //Metodo que recibirá una línea y devolverá una lista de Strings con los campos parseados
    public static List<String> parseCSVLine(String line){

        //Creamos la lista que devolveremos en esta funcion
        List<String> out = new ArrayList<>();

        //Creamos el buffer que irá componiendo el String
        StringBuilder sb = new StringBuilder(); //sb acumula caracteres mientras recorre la linea

        //Indicaremos si estamos en un campo entre comillas(")
        // Si es true --> las comas no separan campos y las comillas dobles deben tratarse como escape.
        boolean enComillas = false;

        //Creamos el bucle que recorrerá la línea caracter a caracter
        for (int i = 0; i < line.length(); i++) {

            //'ch' será el caracter actual
            char ch = line.charAt(i);

            //En caso de encontrar una comilla doble...
            if (ch == '"'){

                //Caso 1: estar dentro de comillas y que la siguiente también sea comillas.
                //Esto representa una comilla de escape dentro del campo ("" => un " literal)
                if (enComillas && i+1<line.length() && line.charAt(i+1)=='"'){
                    //añadimos la " literal que se quiere insertar como informacion
                    sb.append('"');
                    //avanzamos un índice adicional para no evaluar después otra vez la siguiente comilla
                    i++;
                    }
                //Caso 2: que no sea comilla escapada, entonces alternamos el estado 'enComillas':
                //--> Si estábamos fuera, ahora entramos en comillas (abrimos campo entre comillas)
                //--> Si estábamos dentro, ahora salimos o cerramos el campo entre comillas.
                //No añadiremos nada al sb porque esas comillas de cerrado de campo no queremos que salgan.
                else {
                        enComillas = !enComillas;
                        //no haremos sb porque no queremos esas comillas
                    }
            //Si en lugar de comillas doble encontramos una coma y no estamos entre comillas...
            //La coma actuará como separador de campos
            } else if (ch == ',' && !enComillas) {

                //añadimos lo que había acumulado del campo previo a la lista out
                out.add(sb.toString());
                //reiniciamos el sb para comenzar a rellenar la info del siguiente campo
                sb.setLength(0);
            }
            // Si no es comillas, ni coma separadora de campo (o la coma está dentro de enComillas)...
            //...añadiremos el caracter al sb
            else {
                sb.append(ch); //añado carácter al buffer
            }
        }
        //Al terminar el bucle, tenemos que añadir el último campo en sb acumulado (si lo hay)..
        //...puesto que en CSV el último campo no acaba en coma y se quedaría sin registrar si no lo metemos
        out.add(sb.toString());

        return out;
    }
}

