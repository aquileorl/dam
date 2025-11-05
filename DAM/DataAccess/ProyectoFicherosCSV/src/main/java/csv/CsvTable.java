package csv;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.*;

public class CsvTable {

    //Una lista tipo String para poner las cabeceras de la tabla
    private final List<String> headers = new ArrayList<>();
    //Una Lista que contiene Mapas. Cada fila/registro será un Mapa, un par clave-valor.
    private final List<Map<String, String>> rows = new ArrayList<>();


    public List<String> getHeaders(){
        //Devuelve una lista que se puede recorrer, pero no modificar desde clases externas.
        return Collections.unmodifiableList(headers);
    }

    public List<Map<String,String>> getRows(){
        //Devuelve la lista de mapas (registros-filas) de forma inmutable
        return Collections.unmodifiableList(rows);
    }

    public void setHeaders(List<String> hdrs){
        headers.clear(); //1. Limpia las cabeceras anteriores para reutilizar la instancia.
        headers.addAll(hdrs); //2. Añade todos los nuevos elementos de la lista 'hdrs' de golpe.
    }

    public void addRow(List<String> values){
        //1.LinkedHashMap garantiza que el orden de inserción de las claves se respete
        Map<String, String> row = new LinkedHashMap<>();
        int n = headers.size();

        for (int i = 0; i < n; i++) {
            //1. Clave: se extrae la cabecera de la posición i
            String key = headers.get(i);
            //2. Valor: se extrae el dato en la posición i de values , con control de seguridad
            String value = (i < values.size()) ? values.get(i) : "";
            //3. Asignación al mapa: Clave (nombre de la columna = key) y Valor (dato = value)
            row.put(key,value);
        }
        rows.add(row);

    }

    public int size(){
        return rows.size();
    }








}
