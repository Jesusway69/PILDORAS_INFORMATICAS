package pilldorasinformaticas;


import javax.swing.*;

public class AccesoAplicacion {

    public static void main(String[] args) {

        String clave = "Jesus";
        String password = "";
        while (clave.equals(password) == false) {
            password = JOptionPane.showInputDialog("Introduzca clave");
            if (clave.equals(password) == false) {
                System.out.println("Clave incorrecta");

            }
        }
        System.out.println("Clave correcta");

    }

}
