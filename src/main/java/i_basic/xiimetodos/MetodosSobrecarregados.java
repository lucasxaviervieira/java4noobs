package i_basic.xiimetodos;

public class MetodosSobrecarregados {

    public static void main(String[] args) {
        System.out.println(sum(1,2));
        System.out.println(sum(5.1,3.3));
        System.out.println(sum(1,2,3));
    }
    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }
}
