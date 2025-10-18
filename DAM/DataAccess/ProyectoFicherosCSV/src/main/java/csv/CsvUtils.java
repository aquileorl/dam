package csv;

import java.util.ArrayList;
import java.util.List;

public class CsvUtils {


    // Ana, "Petardos,SL", 2300

    //Nuestra función debe convertir a una lista tal que así:
    //["Ana", "Petardos,SL", "2300"]

    private CsvUtils() {}

    public static List<String> parseCSVLine(String line){

        List<String> out = new ArrayList<>();

        StringBuilder sb = new StringBuilder(); //un buffer que irá componiendo el String

        boolean enComillas = false;

        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            
            if (ch = '"'){
                if (enComillas && i+1<line.length() && line.charAt(i+1)=='"'){
                sb.append('"');
                i++;
                } else {
                    enComillas = !enComillas;
                    //no haremos sb porque no queremos esas comillas
                }
            } else if (ch == ',' && !enComillas) {
                out.add(sb.toString());
                sb.setLength(0); //reinicio el sb, lo vacío
            } else {
                sb.append(ch); //añado caracter al buffer
            }
        }
        out.add(sb.toString());

        return out;
    }
}

