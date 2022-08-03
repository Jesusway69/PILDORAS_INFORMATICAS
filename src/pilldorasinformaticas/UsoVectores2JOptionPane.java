package pilldorasinformaticas;


import javax.swing.*;

public class UsoVectores2JOptionPane {

    public static void main(String[] args) {
        String[] pais = new String[8];

        for (int i = 0; i < 8; i++) {
            pais[i] = JOptionPane.showInputDialog("Introduce país " + (i + 1));

        }
        for (String i : pais) {
            System.out.println(i);
        }

    }

}
