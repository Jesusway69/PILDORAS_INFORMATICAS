package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class UsoEmpleadoVector {
    
    public static void main(String[] args) {
        
        EmpleadoVector[] misEmpleados = new EmpleadoVector[3];        
        misEmpleados[0] = new EmpleadoVector("Luis Pérez", 85000, 1990, 12, 17);
        misEmpleados[1] = new EmpleadoVector("Ana López", 95000, 1995, 6, 2);
        misEmpleados[2] = new EmpleadoVector("María Martín", 105000, 2002, 2, 15);
        
        for (int i = 0; i < 3; i++) {
            misEmpleados[i].subeSueldo(5);
            /*este for se puede también hacer de modo reducido
            creando una variable de la clase EmpleadoVector asi:
            for(EmpleadoVector e: misEmpleados){
            e.subeSueldo(5);
            }
            */
        }
        for (int i=0;i<3;i++){
            System.out.println("Nombre: "+ misEmpleados[i].dameNombre()+ " - Sueldo: "+ 
                    misEmpleados[i].dameSueldo()+ " - Fecha alta: "+ misEmpleados[i].dameFechaContrato());
            /*Este for tambien se puede simplificar igual que el anterior pero en la
            impresión hay que sustituir las llamadas al vector[i] por la variable e , así:
            e.damenombre , e.dameSueldo y e.dameFechaContrato
            */
                    
        }
    }
    
}

class EmpleadoVector {
    
    public EmpleadoVector(String nom, double sue, int agno, int mes, int dia) {
        nombre = nom;
        sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);
        altaContrato = calendario.getTime();
    }
    
    public String dameNombre() {//getter
        return nombre;
    }
    
    public double dameSueldo() {//getter
        return sueldo;
    }
    
    public Date dameFechaContrato() {//getter
        return altaContrato;
    }
    
    public void subeSueldo(double porcentaje) {//setter
        double aumento = sueldo * porcentaje / 100;
        sueldo += aumento;
        
    }
    
    private String nombre;
    private double sueldo;
    private Date altaContrato;
}
