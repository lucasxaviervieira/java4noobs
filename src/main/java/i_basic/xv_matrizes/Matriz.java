package i_basic.xv_matrizes;

import java.util.Arrays;

public class Matriz {
    public static void main (String[] args) {
        int[][] matriz = new int[2][2];

        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[1][0] = 3;
        matriz[1][1] = 4;

        System.out.println(Arrays.deepToString(matriz));

    }

}