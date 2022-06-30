package pilldorasinformaticas;
import javax.swing.*;

public class RaizCuadrada {

  
    public static void main(String[] args) {
        
        
String n1=JOptionPane.showInputDialog("Introduce un número");

double n2= Double.parseDouble(n1);

System.out.print("La raiz cuadrada de " + n2 + " es ");

System.out.printf("%1.2f\n" , Math.sqrt(n2));

    }

}
