package pilldorasinformaticas;

import java.util.Scanner;

public class EvaluaEdadElseIf {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce tu edad: ");
        int edad = entrada.nextInt();
        if (edad < 18) {
            System.out.print("eres un niñato ");
        } else if (edad < 40) {
            System.out.print("eres joven aun ");
        } else if (edad < 65) {
            System.out.print("eres un viejales ");
        } else  {
            System.out.print("tienes mas años que un bosque ");

        }

    }
}
