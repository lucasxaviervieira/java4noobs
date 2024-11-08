package ii_intermediary.xv_generics.classes;

class Value<T> {
    private T value;
    Value (T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
public class Main {
    public static void main (String[] args) {
        Value<String> stringValue = new Value<String>("string");
        System.out.println(stringValue.getValue());
        stringValue.setValue("other string");
        System.out.println(stringValue.getValue());

        Value<Integer> integerValue = new Value<Integer>(2);
        System.out.println(integerValue.getValue());
        integerValue.setValue(5);
        System.out.println(integerValue.getValue());
    }
}
