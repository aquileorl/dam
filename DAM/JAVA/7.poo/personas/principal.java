package personas;

public class principal {

    public static void main(String [] args){
        Persona persona1 = new Persona("Emilio", 33, "4459sqq7s", "Benalmadena");
        Persona persona2 = new Persona("Aida",34,"34543453","Benalmadena");

        persona1.setEdad(36);
        persona2.setEdad(37);

        System.out.println(persona1.getNombre());
        System.out.println(persona2.getNombre());

        
    }

}
