
import java.util.Scanner;

public class pruebaswitch {
    public static void main(String[] args) {
        int opcion;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce opción: ");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1: System.err.println("Me encanta el 1");
                
                break;
            case 2: System.err.println("Me encanta el 2");
            default:
                System.out.println("Opcion invalida");
                
        }
    }
}
