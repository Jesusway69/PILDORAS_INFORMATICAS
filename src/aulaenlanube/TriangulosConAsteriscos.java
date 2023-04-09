package aulaenlanube;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class TriangulosConAsteriscos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca altura del triángulo: ");
        int altura = sc.nextInt();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        System.out.println();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j <= i; j++) {

                if (i == 0 || i == altura - 1 || j == 0 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();

        }

        int base = altura * 2 - 1;
        System.out.println();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j <= base; j++) {

                if (j >= base / 2 - i && j <= base / 2 + i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();

        }
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {

                if (j == base / 2 - i || j == base / 2 + i || i== altura -1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
        sc.close();
    }
}
