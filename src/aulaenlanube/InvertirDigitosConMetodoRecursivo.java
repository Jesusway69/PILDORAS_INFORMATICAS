package aulaenlanube;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class InvertirDigitosConMetodoRecursivo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca número a invertir: ");
        int n = sc.nextInt();
        System.out.print("Su número invertido es: ");
        invertir(n);
        System.out.println();

    }

    static void invertir(int n) {
        if (n >= 0 && n < 10) System.out.print(n);
         else {
            System.out.print(n % 10);
            invertir(n / 10);

        }

    }

}
