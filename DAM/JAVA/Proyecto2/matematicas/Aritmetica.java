package matematicas;

public class Aritmetica {

    public static int sumaDosNumeros(int num1, int num2){
        return num1+num2;
    }

    public static int restaDosNumeros(int num1, int num2){
        return num1-num2;
    }

    public static boolean esPrimo(int num1){
        for(int i=2; i<num1;i++){
            if(num1%i == 0){
                return false;
            } 
        }
        return true;
    }
}
