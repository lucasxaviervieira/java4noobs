package ii_intermediary.xii_immutable_lists.less_verbose;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Integer> asList = Arrays.asList(1,2,3);
        asList.set(0,30);

        List<Integer> of = List.of(1,2,3); // does not accepts nullable values
        of.set(0,30); // UnsuportedOperationException
    }
}
