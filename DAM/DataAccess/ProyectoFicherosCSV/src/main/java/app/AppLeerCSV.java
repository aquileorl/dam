package app;

import csv.CsvUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class AppLeerCSV {


    //Definir la ruta donde está el CSV
    private static final Path RUTA = Paths.get("data", "clientesResumen.csv");

    public static void main(String[] args) {

        //asegurarse que existe el directorio y el archivo
        try{
            Files.createDirectory(RUTA.getParent()); //dame el padre de este archivo, es decir, el directorio donde está el archivo
        } catch (IOException e){
            System.err.println("No se pudo asegurar: " + e.getMessage());
        }

        //apertura camino en memoria, creando buffer de lectura y lectura línea por línea del archivo.
        try (BufferedReader br = Files.newBufferedReader(RUTA, StandardCharsets.UTF_8)){

            String linea;
            linea = br.readLine();
            if (linea == null) {
                System.err.println("CSV está vacío");
                return;
            }
            List<String> headers = CsvUtils.parseCSVLine(linea);

            while ((linea= br.readLine()) != null){

                List<String> campos = CsvUtils.parseCSVLine(linea);
                //table.addRow(values)
            }

        } catch (NoSuchFileException e){ //excepción de que el archivo no exista en la ruta que pasamos en el try
            System.err.println("No aparece el archivo: " + RUTA.toAbsolutePath());
        } catch (IOException e){
            e.printStackTrace();
        }


        //Mostrar el contenido en una tabla
    }
}
