package pilldorasinformaticas;

import javax.swing.*;

public class JavaOptionPane {

    public static void main(String args[]) {

        String nombreusuario = JOptionPane.showInputDialog("Introduce tu nombre ");
String edad = JOptionPane.showInputDialog(" Introduce tu edad ");
int edad1= Integer.parseInt(edad);
edad1++;
System.out.println("Hola " + nombreusuario + " el año que viene tendrás " + (edad1 +1) + " años ");
    }

}
/*
Como el método sowImputDialog devuelve siempre un string y así declaramos la edad
al poner (edad+1) no suma sino que concatena un 1 despues de la cifra que le hayamos dado,
para que sume debemos convertir edad a int y guardarlo en otra variable por ej edad1 con el método 
Integer.ParseInt(variabla a convertir)

Se puede declarar la suma de +1 dentro del espacio a imprimir (edad1+1)
o bien declarando antes un incremento con el símmbolo edad1++ , si se dejan ambos
como en el ejemplo se sumarán dos
*/