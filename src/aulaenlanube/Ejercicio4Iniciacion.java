/**
 * Ejercicio 4 - Iniciación a JAVA
 * 
 * Dada una secuencia de números enteros positivos acabada en 0.
 * Obtener la suma de aquellos números tales que su número de cifras sea igual a la suma de las mismas.
 * No se pueden utilizar Arrays.
 * 
 * Ejemplo para entrada: [1, -111, 5, 111, 66, 201, 27, 0]
 * Salida:               [1+111+201=313]
 * 
 */

package aulaenlanube;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class Ejercicio4Iniciacion {

    public static void main(String[] args) {
        
          Scanner sc = new Scanner(System.in);
        int numeros;
        int total = 0;
        String textoSuma = "";
     

        do {

            System.out.print("Introduzca números positivos para sumarlos , con 0 finaliza-> ");
            numeros = sc.nextInt();
            
            int cifras = 1;
            int suma = numeros %10;
            int copia = numeros;
           
            while (copia >9){
               copia /=10;
               cifras++;
               suma += copia%10;
                
            }
            
            if (cifras == suma) {
                total += numeros;
                textoSuma += numeros + " + ";
            }

        }while (numeros != 0); 
  System.out.println(textoSuma + "\b\b= " + total);
  sc.close();
        
        
        
        
        
    }

}
