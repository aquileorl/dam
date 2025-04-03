package DAM.JAVA.herencias.herencia1;

public class Vehiculo {
    
    private String marca;


    void acelerar(){
        System.out.println("Acelerando...");
    }


    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
}
