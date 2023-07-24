package pruebas_varias;

import java.util.Scanner;

public class ContarVocales {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String cadena = "";
    int cantidadvocales = 0;
    String ervocales = "[aeiouAEIOUáéíóúÁÉÍÓÚ]+";

    System.out.print("Escriba texto para contar vocales: ");
    String cadenasc = sc.next().trim();
    for (int i = 0; i < cadenasc.length(); i++) {
      String caracter = String.valueOf(cadenasc.charAt(i));
      if (caracter.matches(ervocales)) {
        cantidadvocales++;
      }

    }
    System.out.println("El texto contiene " + cantidadvocales + " vocales.");
  }

}
