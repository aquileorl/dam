package DAM.JAVA.herencias.gestionCarrera;

public class CorredorProfesional extends Corredor implements Entrenar, Patrocinable{

    String patrocinador;

    public CorredorProfesional(String nombre, int edad, String ciudad, double tiempoCarrera, String patrocinador){
        super(nombre, edad, ciudad, tiempoCarrera);
        this.patrocinador = patrocinador;
    }

    @Override
    public void mostrarInformacion(){
        System.out.println("Nombre: "+ nombre + "Edad: "+ edad+ "Ciudad: "+ciudad+ "Tiempo de carrera: "+tiempoCarrera);
        System.out.println("Categoría: PROFESIONAL");
        System.out.println("Patrocinador: "+ patrocinador);
    }

    @Override
    public void estirar(){
        System.out.println("Entrenando como un profesional que soy");
    }

    @Override 
    public void estorbar(){
        System.out.println("Estorbo poco");
    }

    @Override public void doparse(){
        System.out.println("VIVA EL EPO");
    }

    @Override 
    public void mostrarPatrocinador(){
        System.out.println("Patrocinador:" + patrocinador);
    }

   





}
