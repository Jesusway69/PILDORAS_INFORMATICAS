package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class UsoPersona {

    public static void main(String[] args) {
    }

}

class Persona{
    
    public Persona(String nom){
        
        
    }
    
    private String nombre;
}

class Empleado2 {

    public Empleado2(String nom, double sue, int agno, int mes, int dia) {
        //nombre = nom;
        sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);
        altaContrato = calendario.getTime();
        ++IdSiguiente;
        Id = IdSiguiente;
        /*Este es el constructor al que le hemos asignado los 5 argumentos,el siguiente incluirá sólo 
        el nombre manteniendo el nombre de la clase Empleado, esto es un ejemplo de polimorfismo
         */

 /*  public String dameNombre() {//getter
        return nombre + " - Id: " + Id;*/
    }

    public double dameSueldo() {//getter
        return sueldo;
    }

    public Date dameFechaContrato() {//getter
        return altaContrato;
    }

    public void subeSueldo(double porcentaje) {//método setter que calcula el sueldo mas el porcentaje que le pasemos
        double aumento = sueldo * porcentaje / 100;
        sueldo += aumento;

    }

    //private String nombre;
    private double sueldo;
    private Date altaContrato;
    private int IdSiguiente;
    private int Id;
}
