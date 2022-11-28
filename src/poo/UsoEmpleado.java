package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class UsoEmpleado {

    public static void main(String[] args) {

        Jefatura jefe_RRHH = new Jefatura("Jesus", 150000, 2001, 11, 22);
        jefe_RRHH.setIncentivo(20000);
      

        Empleado[] misEmpleados = new Empleado[6];
        misEmpleados[0] = new Empleado("Luis Pérez", 85000, 1990, 12, 17);
        misEmpleados[1] = new Empleado("Ana López", 95000, 1995, 6, 2);
        misEmpleados[2] = new Empleado("María Martín", 105000, 2002, 2, 15);
        misEmpleados[3] = new Empleado("Lucía Gómez");//ejemplo de llamada al constructor que sólo tiene el nombre como parámetro
        misEmpleados[4] = jefe_RRHH; //Polimorfismo, principio de sustitución
        misEmpleados[5] = new Jefatura("Alba", 92000, 2002, 4, 22);
        
        Jefatura jefa_finanzas = (Jefatura) misEmpleados[5];/*Ejemplo de casteo para definir este objeto dentro del vector
        de clase Empleado como objeto de clase Jefatura y así poder aplicarle el método setIncentivo perteneciente a la
        clase heredada Jefatura sumándolo así a los métodos de la clase padre Empleado*/
        jefa_finanzas.setIncentivo(2500);
  
        
        
        /*for (int i = 0; i < 6; i++) {
            misEmpleados[i].subeSueldo(5);
        }
            Este for se puede también hacer de modo reducido (for each)
            creando una variable de la clase Empleado asi:*/
        for (Empleado e : misEmpleados) {
            e.subeSueldo(5);
        }

        
        
        
        /*System.out.println("Nombre: " + misEmpleados[i].dameNombre() + " - Sueldo: "
                    + misEmpleados[i].dameSueldo() + " - Fecha alta: " + misEmpleados[i].dameFechaContrato());
            Este for tambien se puede simplificar igual que el anterior pero en la
            impresión hay que sustituir las llamadas al índice del vector[i] por la variable e , así:*/
        for (Empleado e : misEmpleados) {
            System.out.println("Nombre: " + e.dameNombre() 
                    + " Sueldo: " + e.dameSueldo() /*Este método dameSueldo está igual en la clase Empleado y 
                    en la clase Jefatura aunque con distinta función, el intérprete de java puede identificar
                    qué tipo de objeto es cada elemento del vector y aplicarle a cada cual su cálculo, en el caso
                    de los de la clase padre Empleado el incremento del porcentaje establecido sobre su sueldo
                    y en los de la clase heredada Jefatura el porcentaje establecido sobre el sueldo además del 
                    incentivo creando un concepto de java llamado enlace dinámico*/
                    + " Fecha alta: " + e.dameFechaContrato());
             }
            
            
       
    }
}

class Empleado {

    public Empleado(String nom, double sue, int agno, int mes, int dia) {
        nombre = nom;
        sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);
        altaContrato = calendario.getTime();
        ++IdSiguiente;
        Id = IdSiguiente;
        /*Este es el constructor al que le hemos asignado los 5 argumentos,el siguiente incluirá sólo 
        el nombre manteniendo el nombre de la clase Empleado, esto es un ejemplo de polimorfismo
         */
    }

    public Empleado(String nom) {
        this(nom, 1000, 1900, 01, 01);
        /*A este otro constructor le hemos dado sólo un argumento pero con
        el this y añadiendo los otros 4 argumentos que queramos para que sean por defecto
        nos pondrá estos datos cuando uno de los objetos sólo tenga el nombre y llame a este 
        constructor , podremos añadir todos los constructores que queramos siempre y cuando la cantidad
        y/o tipo de argumentos sean diferentes.
         */
     }

    public String dameNombre() {//getter
        return nombre + " - Id: " + Id;
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

    private String nombre;
    private double sueldo;
    private Date altaContrato;
    private static int IdSiguiente;
    private int Id;
}

final class  Jefatura extends Empleado { /*Anteponiendo el modificador de clase final declaramos que esta clase
    no pueda ser heredada por otra, por ello cualquier clase a la que añadamos extend referenciando a esta
    nos dará error como el ejemplo de abajo de la clase Director (comentada para evitar el error), tambien se puede
    aplicar este modificador a los métodos, si se lo añadimos al método dameSueldo de la clase padre Empleado, el método
    con el mismo nombre que hay en la clase heredada Jefatura nos dará un error, en este caso sólo habría que cambiar
    el nombre de ese método en la clase heredada para evitar el error teniendo en cuenta que el método renombrado no heredará 
    las funciones del método de la clase padre*/

    public Jefatura(String nom, double sue, int agno, int mes, int dia) {

        super(nom, sue, agno, mes, dia);/*con este super le indicamos a cual de los 2 constructores
de la clase padre Empleados queremos llamar según sus parámetros, en este caso al que tiene los 5*/
    }

    public void setIncentivo(double incentivo) {
        this.incentivo = incentivo;
    }

    @Override
  public double dameSueldo() {
        double sueldoJefe = super.dameSueldo();/* con super le indicamos que queremos
lo que devuelve el getter de la clase padre Empleado y no la clase heredada Jefatura para despues
hacer un nuevo return que nos devuelva lo que queremos en el método dameSueldo sobreescribiendo
        el de la clase padre*/
        return sueldoJefe + incentivo;
    }

    private double incentivo;
}

/*class Director extends Jefatura {

public Director (String nom, double sue, int agno, int mes, int dia) {

  super(nom, sue, agno, mes, dia);
}

}*/