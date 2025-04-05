package DAM.JAVA.herencias.gestionCarrera;

public class CorredorJuvenil extends CorredorProfesional{

    String categoridadEdad;

    public CorredorJuvenil(String nombre, int edad, String ciudad, double tiempoCarrera, String patrocinador, String categoria){

        super(nombre, edad, ciudad, tiempoCarrera, patrocinador);
        this.categoridadEdad = categoria;

    }

    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Categoria: "+ categoridadEdad);
        mostrarPatrocinador();
    }

}
