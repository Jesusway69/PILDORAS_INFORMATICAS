

package aulaenlanube;

import java.util.Scanner;

public class BucleForEntrada {

    public static void main(String[] args) {
        
        
        Scanner scan = new Scanner(System.in);
        
        float acumulador =0f;
        
    
       System.out.print("Dime cantidad de numeros a calcular media: ");
         int cantidadnumeros = scan.nextInt();
      
      for(int i=1;i<=cantidadnumeros;i++){
        
          System.out.print("Introduzca número "+i+" de "+cantidadnumeros+": ");
          int num = scan.nextInt();
          acumulador+=num;
          
          
           }
        
                  System.out.print("la media de todos los números es "+ (acumulador/cantidadnumeros)+ "\n");
                  scan.close();

        
        
        
    }

}
