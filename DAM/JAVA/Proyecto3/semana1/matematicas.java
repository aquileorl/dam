package semana1;

public class matematicas {

    public static int sumaDos(int num1, int num2){
        return num1+num2;
    }

    public static int LongitudVector(int [] v){
        return v.length;
    }

    public static void imprimirVector(int [] v){
        for(int i = 0; i<v.length ; i++){
            System.out.println(v[i]);
        }
    }

    public static void sumarUnoEntero(int a){
        a++;
        
    }

    public static void sumarUnoArray(int [] vector){
        for(int i = 0; i<vector.length;i++){
            vector[i]++;
        }
    }

    public static int CalcularFactorial(int n){
        int factorial = 1;
        for(int i = 1; i <= n ; i++){
            factorial = factorial*i;
        }

        return factorial;
    }

    public static int CalcularFactorialRecursivo(int n){
        if (n == 1){
            return 1;
        }
        return CalcularFactorialRecursivo(n-1)*n;
    }

    //x^y
    //2^3 = 2*2*2
    public static int potencia(int x, int y){
        int resultado=x; 
        for(int i=1; i<y; i++){
            resultado = resultado * x;
            
        }

        return resultado;
    }
    //factorial(2,3) = 
    public static int potenciaRecursiva(int x, int y){
        if (y==1){ //si la y llega a 1 no  tendrá que multiplicar más
            return 1;
        }
        return x*potenciaRecursiva(x,y-1);
    }
}
