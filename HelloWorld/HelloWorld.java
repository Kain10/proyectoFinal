package HelloWorld;

public class HelloWorld {
    public static int sumar(int x, int y){
        return x+y;
    }
    public static void main(String[] args) {
        System.out.println("¡Hello world!");
        System.out.println(sumar(5, 10));
        System.out.println(multiplicar(2,3));
        System.out.println(dividir(10, 2));
    }
    public static int multiplicar(int x , int y){
        return x*y;
    }

    public static double dividir(double x, double y){
        return x/y;
    }
}
