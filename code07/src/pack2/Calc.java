package pack2;

public class Calc {

    //overload : method same name, same return type, different count and type parameters
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(double a, double b) {
        return ((int) (a + b));
    }


    public static int sum(int a, int b, int c) {
        return a + b + c;
    }
}
