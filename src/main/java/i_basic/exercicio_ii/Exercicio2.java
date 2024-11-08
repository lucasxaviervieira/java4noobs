package i_basic.exercicio_ii;

public class Exercicio2 {
    public static void main(String[] args) {
        int[] studentsAge = {7,5,9,6,8,10};
        System.out.println(uponAverageAge(studentsAge));

    }

    public static int calculateAgeAverage(int[] studentsAge) {
        int average = 0;
        for (int age : studentsAge) {
            average += age;
        }
        average /= studentsAge.length;
        return average;
    }

    public static int uponAverageAge(int[] studentsAge) {
        int manyUpon = 0;
        int average = calculateAgeAverage(studentsAge);
        for (int age: studentsAge) {
            if (age >= average) {
                manyUpon += 1;
            }
        }
        return manyUpon;
    }
}
