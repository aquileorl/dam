package proyecto;

public class Perro extends Animal {

    //ATRIBUTOS
    // private String nombre;
    // private int edad; -> Ahora estos 2 atributos ya vienen de la clase padre Animal.
    private int energia;
    private int nivelHambre;
    private String estadoAnimo;
    
    public static int numPatas = 4;

    public static int numPerros = 0;
    private static final int ENERGIAMAX = 100;
    private static final int MINHAMBRE = 0;
    private static final String FELIZ ="Feliz";
    //CONSTRUCTORES
    public Perro(String n, int e, int energia, int nivelHambre, String estadoAnimo){
        super(n,e);
        
        this.energia = energia;
        this.nivelHambre = nivelHambre;
        this.estadoAnimo = estadoAnimo;
    }

    public Perro(){
        
        super("No tengo nombre", 0);
        this.energia = ENERGIAMAX;
        this.nivelHambre = MINHAMBRE;
        this.estadoAnimo = FELIZ;
        
    }

    public Perro(String n){
        super(n,0);
        
        this.energia = ENERGIAMAX;
        this.estadoAnimo = FELIZ;
        this.nivelHambre = MINHAMBRE;

    }
    //MÉTODOS

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String n){
        this.nombre = n ;

    }

    public int getEdad(){
        return this.edad;
    }

    public void setEdad(int e){
        this.edad = e;
    }

    public int getNivelHambre(){
        return this.nivelHambre;
    }

    public void setNivelHambre(int h){
        this.nivelHambre = h;
    }

    public String getEstadoAnimo(){
        return this.estadoAnimo;
    }

    public void setEstadoAnimo(String a){
        this.estadoAnimo = a;
    }

    public void jugar(){
        System.out.println("¡Qué bien me lo estoy pasando");
        this.nivelHambre = this.nivelHambre + 20;
        this.energia = this.energia - 20;
    }

    public void dormir(){
        System.out.println("ZZZZZZZ");
        this.energia = this.energia + 50;
    }

    public void comer(){
        this.nivelHambre--;
    }

    public void comer(int cantidad){
        this.nivelHambre = this.nivelHambre - cantidad;
    }

    public void mostrarEstado(){
        System.out.println("Nombre:" + this.nombre);
        System.out.println("Edad: "+ this.edad);
        System.out.println("Nivel de hambre: "+ this.nivelHambre);
        System.out.println("Nivel de energia: "+ this.energia);
        System.out.println("Estado de animo: "+ this.estadoAnimo);
    }

}
