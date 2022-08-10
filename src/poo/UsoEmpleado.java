package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class UsoEmpleado {

    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("Luis Pérez", 85000, 1990, 12, 17);
        Empleado empleado2 = new Empleado("Ana López", 95000, 1995, 6, 2);
        Empleado empleado3 = new Empleado("María Martín", 105000, 2002, 3, 15);
        empleado1.subeSueldo(4);
        empleado2.subeSueldo(5);
        empleado3.subeSueldo(3);
        System.out.println("Nombre: " + empleado1.dameNombre() + " - Sueldo: " + empleado1.dameSueldo() + " - Fecha alta: "
                + empleado1.dameFechaContrato());
         System.out.println("Nombre: " + empleado2.dameNombre() + " - Sueldo: " + empleado2.dameSueldo() + " - Fecha alta: "
                + empleado2.dameFechaContrato());
          System.out.println("Nombre: " + empleado3.dameNombre() + " - Sueldo: " + empleado3.dameSueldo() + " - Fecha alta: "
                + empleado3.dameFechaContrato());

    }

}

class Empleado {

    public Empleado(String nom, double sue, int agno, int mes, int dia) {
        nombre = nom;
        sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);
        altaContrato = calendario.getTime();
    }

    public String dameNombre() {
        return nombre;
    }

    public double dameSueldo() {
        return sueldo;
    }

    public Date dameFechaContrato() {
        return altaContrato;
    }

    public void subeSueldo(double porcentaje) {
        double aumento = sueldo*porcentaje / 100;
        sueldo+=aumento;

    }

    private String nombre;
    private double sueldo;
    private Date altaContrato;
}
