package proyecto;

public class Gato extends Animal {

    // como gato extiende de Animal, ya tiene nombre y tiene edad. Son atributos, por tanto, que no hace falta que defina otra vez. 
    private String estadoAnimo;
    
    public Gato(String ea, String n, int e){
        
        super(n,e); //esto apunta al nombre y la edad de la clase Animal y le asigna lo que paso por argumento en el constructor
        this.estadoAnimo = ea;
    }

    public void maullar(){
        System.out.println("Miaaaaauuuu");
        
    }

    public void setNuevoNombre(String n){
        this.nombre = n;
    }

    @Override
    public void hacerSonido(){
        System.out.println("RRRRRRRRR");
    }



}
