package aulaenlanube;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class TriangulosConMetodosRecursivos {

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca altura del triángulo: ");
        int altura = sc.nextInt();
        triangulo(altura);
        int contA = 0;
        int contB = 0;
        tri(contB, contA, altura);
    }

    static void triangulo(int n) {

        if (n > 0) {
            triangulo(n - 1);
            filatriangulo(n);

        }
    }

    static void filatriangulo(int n) {
        if (n > 0) {
            System.out.print("* ");
            filatriangulo(n - 1);

        } else {
            System.out.println();

        }
    }

   
    
    /*
     1 solo método mucha pila de llamadas
    */
    static void tri(int contB, int contA, int n) {
        if (contB < contA) {
            System.out.print("* ");
            tri(contB + 1, contA, n);
        } else {
            System.out.println();
            if (contA < n ) 

                tri(0, contA + 1, n);
            

        }
    }

}
