package personas;

public class Persona {
    //ATRIBUTOS DE LA PERSONA (cómo defino a la persona)
    private String nombre;
    private int edad;
    private String dni; 
    private String direccion;

    //CONSTRUCTOR
    public Persona(String nombre, int edad, String dni, String direccion){
        this.nombre=nombre;
        this.edad=edad;
        this.dni= dni;
        this.direccion=direccion;
    }


    //MÉTODOS
    public String getNombre(){
        return this.nombre;
    }

    public void SetNombre(String nombre){
        this.nombre = nombre;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }


}
