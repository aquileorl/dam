package personas;

public class Persona {
    
    //ATRIBUTOS -> características que tendrá la persona
    String nombre;
    int edad;
    String direccion;

    //CONSTRUCTOR -> cómo se construirá un objeto Persona
    public Persona(String nombre, int edad, String direccion){
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }

    //MÉTODOS -> cómo interactuamos con la persona
    
    //método para obtener su nombre
    public String getNombre(){
        return this.nombre;
    }
    //método para establecer su nombre
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    //método para obtener su edad
    public int getEdad(){
        return this.edad;
    }

}
