
import javax.swing.JOptionPane;


public class Factorial {

   
    public static void main(String[] args) {
        
        long resultado=1L;
        int num=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu número: "));
        for (int i=num;i>0;i--){
            resultado=resultado*i;
            
        }
          System.out.println("El factorial de " + num + " es " + resultado);
    }

}

/*
Adivinar el resultado del factorial de un número
esto es multiplicar el número por todos los anteriores
por ejemplo el de 6 sería 6*5*4*3*2*1=720
en matemáticas se suele representar así: 6!=720
*/