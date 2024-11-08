package ii_intermediary.xv_generics.methods;

public class Main {
    public static void main(String[] args) {
        showValue("test");
        showValue(1);
        showValue(2.1f);

        squareValue(2);
        squareValue(2.1f);
    }

    public static <T> void showValue (T value) {
        System.out.println("The value is: " + value );
    }

    public static <T extends Number> void squareValue(T value) {
        double result = value.doubleValue() * value.doubleValue();
        System.out.println(result);
    }

}
