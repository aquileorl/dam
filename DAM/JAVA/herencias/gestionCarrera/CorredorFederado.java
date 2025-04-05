package DAM.JAVA.herencias.gestionCarrera;

public class CorredorFederado extends Corredor implements Entrenar{
    
    String licenciaFederativa;

    public CorredorFederado(String nombre, int edad, String ciudad, double tiempoCarrera, String licencia){

        super(nombre, edad, ciudad, tiempoCarrera);
        this.licenciaFederativa = licencia;

    }

   @Override
   public void mostrarInformacion(){
    System.out.println("Nombre: "+ nombre + "Edad: "+ edad+ "Ciudad: "+ciudad+ "Tiempo de carrera: "+tiempoCarrera);
    System.out.println("Tipo de Corredor: FEDERADO");
    System.out.println("Licencia Federativa: "+ licenciaFederativa);
   }

   
   @Override
   public void estirar(){
    System.out.println("Estirando");
   }

   @Override
   public void estorbar(){
    System.out.println("Estorbando");
   }

   @Override
   public void doparse(){
    System.out.println("Dopándome....");
   }
   
    
    


    

}
