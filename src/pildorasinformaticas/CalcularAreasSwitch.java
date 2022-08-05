package pilldorasinformaticas;

import java.util.*;
import javax.swing.*;

public class CalcularAreasSwitch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Elige una opción \n1: Cuadrado \n2: Rectángulo \n3: Triángulo \n4: Círculo");
        int fig = sc.nextInt();
        switch (fig) {
            case 1:
                int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce la medida del lado en centímetros:"));
                System.out.println("El área del cuadrado es " + Math.pow(lado, 2) + " cm3");
                break;
            case 2:
                int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la medida de la base en centímetros:"));
                int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la medida de la altura en centímetros:"));
                System.out.println("El área del triángulo es " + base * altura + " cm3");
                break;
            case 3:
                int baset = Integer.parseInt(JOptionPane.showInputDialog("Introduce la medida de la base en centímetros:"));
                int alturat = Integer.parseInt(JOptionPane.showInputDialog("Introduce la medida de la altura en centímetros:"));
                System.out.println("El área del triángulo es " + (baset * alturat) / 2 + " cm3");
                break;
            case 4:
                int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce la medida del radio en centímetros:"));
                System.out.print("El área del círculo es ");
                System.out.printf("%1.2f", Math.PI * (Math.pow(radio, 2)));
                System.out.println(" cm3");

                break;
            default:
                System.out.println("La opción no existe ");

        }
    }

}
