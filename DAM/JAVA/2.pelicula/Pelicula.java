

public class Pelicula {

    public String titulo;
    public String director;
    public String genero;
     
    public Pelicula(String titulo, String director, String genero){
        this.titulo = titulo;
        this.director = director;
        this.genero = genero;

    }

    public static void main(String[] args) {

        
        Pelicula pelicula1 = new Pelicula("Malditos Bastardos", "Tarantino", "Satirica");

        System.out.println(pelicula1.titulo);
        System.out.println(pelicula1.director);
        System.out.println(pelicula1.genero);

        
    }

}
