package ii_intermediary.xii_immutable_lists;

public class App {
    public static void main(String[] args) {
        Immutable immutable = new Immutable();
        immutable.appendNumber(1);
        immutable.appendNumber(2);
        immutable.appendNumber(3);
        immutable.appendNumber(14);
        System.out.println(immutable.getNumbers());
    }
}