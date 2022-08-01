
import javax.swing.JOptionPane;

public class PesoIdeal {

    public static void main(String[] args) {

        String genero = "";
        do 
        {
            genero=JOptionPane.showInputDialog("Eres hombre o mujer? (H/M)");

        }while(genero.equalsIgnoreCase("H") == false && genero.equalsIgnoreCase("M") == false);
        int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en cm: "));
        int pesoideal = 0;
        if (genero.equalsIgnoreCase("H")) {
            pesoideal = (altura - 90);
        } else if (genero.equalsIgnoreCase("M")) {
            pesoideal = (altura - 110);
        }
        System.out.println("Tu peso ideal es " + pesoideal + " Kg");

    }

}
