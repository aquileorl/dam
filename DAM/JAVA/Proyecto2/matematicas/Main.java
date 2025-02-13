package matematicas;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        int a = 0, b = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime 2 números: ");
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println("La suma es: "+ Aritmetica.sumaDosNumeros(a,b));
        System.out.println("La resto es: "+ Aritmetica.restaDosNumeros(a, b));

        boolean primo = Aritmetica.esPrimo(a);
        if(primo){
            System.out.println(a+" es número primo.");
        } else {
            System.out.println(a+" No es número primo");
        }


        
    }
}
