package DAM.JAVA.herencias.gestionCarrera;

public class CorredorElite extends CorredorProfesional {


    public CorredorElite(String n_ombre, int e_dad, String c_iudad, double t_carrera, String p_atrocinador){

        super(n_ombre, e_dad,c_iudad,t_carrera,p_atrocinador);
    }

    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
    }

    public void premioGanado(double premio){
        System.out.println("He ganado un premio de "+ premio);
    }


}
