package ii_intermediary.xii_immutable_lists;

import java.util.List;
import java.util.LinkedList;
import java.util.Collections;

public class Immutable {
    private final List<Integer> numbers = new LinkedList<>();

    public List<Integer> getNumbers() {
        return Collections.unmodifiableList(numbers);
    }

    public void appendNumber(int number) {
        numbers.add(number);
    }
}
