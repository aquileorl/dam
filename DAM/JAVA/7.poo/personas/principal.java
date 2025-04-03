package personas;

public class Principal {
    
    public static void main(String[] args) {
        
        Persona persona1 = new Persona("Emilio", 34, "Benalmadena");
        Persona persona2 = new Persona("Aida", 34, "Arroyo la Miel");

        System.out.println("La persona1 es: "+ persona1.getNombre());
        System.out.println("La persona2 es:" + persona2.getNombre());

        persona1.setNombre("Emilio José Ruiz Linares");
        System.out.println("Ahora la persona1 se llama: " + persona1.getNombre());
    }

}
