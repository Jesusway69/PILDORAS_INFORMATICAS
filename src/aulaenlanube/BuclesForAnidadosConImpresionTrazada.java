package aulaenlanube;

public class BuclesForAnidadosConImpresionTrazada {

    public static void main(String[] args) {

        int a = 5, b = 2, c = 3;
        System.out.printf("%2s  %2s  %2s  %2s  %2s\n", "a", "b", "c", "i", "j");
        System.out.printf("%2s\n", "*******************");

        for (int j = 0; j <= a; j++) {

            for (int i = 1; i <= b; i++) {
                c = a++;
                b--;
                System.out.printf("%2d  %2d  %2d  %2d  %2d\n", a, b, c, i, j);
               
            }

        }

    }

}
