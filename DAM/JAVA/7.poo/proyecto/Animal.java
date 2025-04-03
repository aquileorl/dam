package proyecto;

public abstract class Animal {
    
    //CLASE ABSTRACTA -> NO SE PUEDE INSTANCIAR

    protected String nombre;
    protected int edad;



    public Animal(String n, int e){
        this.nombre = n;
        this.edad = e;
    }

    public void hacerSonido(){
        System.out.println("GRGRGRRRRRRRRRRRR");
    }

}
