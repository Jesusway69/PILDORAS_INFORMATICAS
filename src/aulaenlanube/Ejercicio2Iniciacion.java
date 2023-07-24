/**
 * Ejercicio 2 - Iniciación a JAVA
 *
 * Dado un número entero positivo, determinar cuántos dígitos tiene.
 * No se pueden utilizar ni variables, ni funciones de tipo String.
 *
 * Ejemplo para entrada: [12343]
 * Salida:               [El número introducido tiene 5 cifras]
 *
 */
package aulaenlanube;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class Ejercicio2Iniciacion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número -> ");
        String numero = sc.next();
        boolean correcto = numero.matches("[0-9]+");
        int cifras = 1;
        if (correcto == true) {
            long numerolong = Long.parseLong(numero);
            long copianumero = Long.parseLong(numero);
            while (numerolong > 9) {

                numerolong /= 10; //o se puede usar: numero = numero/10;
                cifras++;
            }
            System.out.println("El número " + copianumero + " tiene " + cifras + "  " + (cifras == 1 ? "cifra" : "cifras"));

        } else {
            System.out.println("Sólo se pueden introducir números");

        }

        sc.close();

    }

}
