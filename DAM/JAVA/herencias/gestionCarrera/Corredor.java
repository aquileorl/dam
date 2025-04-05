package DAM.JAVA.herencias.gestionCarrera;

public abstract class Corredor {
    
    //ATRIBUTOS
    String nombre;
    int edad;
    String ciudad;
    double tiempoCarrera;


    //CONSTRUCTORES


    public Corredor(String nombre, int edad, String ciudad, double tiempoCarrera) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
        this.tiempoCarrera = tiempoCarrera;
    }
    
    //MÉTODOS
    public abstract void mostrarInformacion();
}
