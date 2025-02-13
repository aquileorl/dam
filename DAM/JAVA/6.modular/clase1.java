




public class clase1 {
    
    public static void main(String [] args){

        int a = 10, b=7, c=14 ; 
        int suma = sumaDosNumeros(a, b);
        System.out.println("La suma de 2 números es: "+ suma);
        sumaTresNumeros(a, b, c);
        System.out.println("La suma de 2 números es: "+ Aritmetica.sumaDosNumeros(a, c));
    }

    public static int sumaDosNumeros(int num1, int num2){
         
        return num1+num2;
    }

    public static void sumaTresNumeros(int num1, int num2, int num3){
        
        System.out.println("La suma de los 3 números es: "+(num1+num2+num3));

    }



}
