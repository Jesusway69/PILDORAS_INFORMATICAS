package aulaenlanube;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class RectangulosconAsteriscos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca altura del rectángulo: ");
        int base = sc.nextInt();
        System.out.print("Introduzca base del rectángulo: ");
        int altura = sc.nextInt();

        for (int i = 0; i < base; i++) {
            for (int j = 0; j < altura; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        System.out.println();

        for (int i = 0; i < base; i++) {
            for (int j = 0; j < altura; j++) {

                if (i == 0 || i == base - 1 || j == 0 || j == altura - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }

    }
}
