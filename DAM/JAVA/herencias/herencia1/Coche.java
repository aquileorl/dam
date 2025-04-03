package DAM.JAVA.herencias.herencia1;


public class Coche extends Vehiculo {
    private  int  numPuertas;


    void mostrarInfo(){
        System.out.println("Marca: "+ super.getMarca() + " Nº puertas: "+ numPuertas);
    }


    public int getNumPuertas() {
        return this.numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }



    @Override
    public String getMarca(){

        System.out.println("No tengo modelo");
        return super.getMarca();
    }
    
    
    

}
