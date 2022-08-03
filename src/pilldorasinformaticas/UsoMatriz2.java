package pilldorasinformaticas;


public class UsoMatriz2 {

    public static void main(String[] args) {

        int[][] m={
            {10, 15, 18, 19, 21},
            {5, 25, 36, 23, 10},
            {18, 11, 3, 29, 23},
            {36, 25, 28, 39, 1},};
        for (int f = 0; f < 4; f++) {
            System.out.println();
            for (c = 0; c <m[0].length; c++) {
                System.out.println(m[f][c] + " ");

            }
        }

    }

}
