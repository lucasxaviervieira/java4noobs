package i_basic.xiii_arrays;

import java.util.Arrays;

public class ArraysEFuncoes {

    public static void main(String[] args) {
        int[] studentsAge = {10, 11, 13, 12, 11};
        int[] studentsAge2 = Arrays.copyOf(studentsAge, 10);

        System.out.println(elementsSumArray(studentsAge));

        System.out.println(Arrays.toString(studentsAge));

        System.out.println(Arrays.toString(studentsAge2));

    }

    public static int elementsSumArray(int[] studentsAge) {
        int sum = 0;

        for (int i = 0; i < studentsAge.length; i++) {
            sum += studentsAge[i];
        }
        return sum;
    }
}
