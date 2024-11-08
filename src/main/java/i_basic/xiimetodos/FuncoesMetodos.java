package i_basic.xiimetodos;

public class FuncoesMetodos {

    public static void main(String args[]) {
        int a = 5;
        int b = 10;

        show(sum(a,b));
    }

    public static int sum(int a, int b) {
        return a + b;
    }
    public static void show(int x) {
        System.out.println(x);
    }

}
