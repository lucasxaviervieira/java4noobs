package ii_intermediary.xiii_sets;

import java.util.Set;
import java.util.HashSet;

public class App {
    public static void main(String[] args) {
        Set<Integer> intSet = new HashSet<>();
        intSet.add(1);
        intSet.add(2);

        if(!intSet.add(1)) {
            System.out.println("Number 10 exists");
        }

        if(intSet.remove(1)) {
            System.out.println("Number 10 exists");
        }

        if (intSet.isEmpty()) {
            System.out.println("void");
        } else {
            System.out.println("not void");
        }
//        intSet.clear();
        System.out.println("length of set is: " + intSet.size());


    }
}
