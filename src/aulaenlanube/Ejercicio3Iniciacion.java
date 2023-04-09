/**
 * Ejercicio 3 - Iniciación a JAVA
 *
 * Escribir un programa que pida números enteros positivos hasta que se introduzca un cero.
 * A continuación debe mostrar la suma total de dichos números.
 * Se deben incluir todos los números positivos que hemos ido introduciendo por teclado.
 * No se pueden utilizar Arrays.
 *
 * Ejemplo para entrada: [3, 4, 5, 6, -2, 8, 0]
 * Salida:               [3+4+5+6+8=26]
 *
 */
package aulaenlanube;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class Ejercicio3Iniciacion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numeros;
        int total = 0;
        String textoSuma = "";

        do {

            System.out.print("Introduzca números positivos para sumarlos , con 0 finaliza-> ");
            numeros = sc.nextInt();
            
            if (numeros > 0) {
                total += numeros;
                textoSuma += numeros + " + ";
            }

        }while (numeros != 0); 
  System.out.println(textoSuma + "\b\b= " + total);
  sc.close();
      
    }

}
