package DAM.JAVA.herencias.gestionCarrera;

public class Main {
    
    public static void main(String[] args) {
        

        CorredorPopular corredor1 = new CorredorPopular("Emilio", 33, "Malaga", 2.14);
        CorredorFederado corredor2 = new CorredorFederado("Juan", 31, "Madrid", 3.2 , "L2342");
        CorredorElite corredor3 = new CorredorElite("Bruno", 33, "Toledo", 1.35, "FlyEmirates");
        CorredorJuvenil corredor4 = new CorredorJuvenil("Juanito Diaz Calle", 3, "Benalmadena", 4.3, "Real Madrid", "Pre-benjamín");


    corredor1.mostrarInformacion();
    corredor2.mostrarInformacion();
    corredor2.estorbar();
    corredor3.mostrarPatrocinador();
    corredor4.mostrarInformacion();
    System.out.println();
    corredor3.premioGanado(1235.34);
    }
}
