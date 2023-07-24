

package aulaenlanube;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class ComprobarNumeroBinarioConMetodoRecursivo {

 
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Introduzca número para comprobar si es binario: ");
      long n = sc.nextInt();
      if (esBinario(n)) System.out.println("El número " + n +" es binario");
      else System.out.println("El número " + n +" no es binario y su valor en binario es: " + convertir(n));
    }
    
    static boolean esBinario (long n){
       if (n>= 0 && n<10){
           if (n==0 || n==1)return true;
           return false;
       }
       if (n%10==0 || n%10==1)return esBinario(n/10);
       return false;
        
    }
    
    static long convertir (long n){
        if (n==0 || n==1) return n;
        else return n%2+10*convertir(n/2);
    }

}
