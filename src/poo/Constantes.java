package poo;

public class Constantes {

    public static void main(String[] args) {

        Empleados trabajador1 = new Empleados("Paco");
        Empleados trabajador2 = new Empleados("Luis");
        Empleados trabajador3 = new Empleados("Sandra");
        Empleados trabajador4 = new Empleados("Antonio");
        Empleados trabajador5 = new Empleados("Sara");

        trabajador1.cambiaSeccion("RRHH");
        trabajador2.cambiaNombre("Ana");
        System.out.println(trabajador1.devuelveDatos());
        System.out.println(trabajador2.devuelveDatos());
        System.out.println(trabajador3.devuelveDatos());
        System.out.println(trabajador4.devuelveDatos());
        System.out.println(trabajador5.devuelveDatos());
        System.out.println(Empleados.dameIdSiguiente());
    }

}

class Empleados {

    public Empleados(String nom) {
        nombre = nom;
        seccion = "administracion";
        Id = IdSiguiente;
        IdSiguiente++;
    }

    public void cambiaSeccion(String seccion) {
        this.seccion = seccion;

    }

    public void cambiaNombre(String nombre) {
        this.nombre = nombre;
    }

    public String devuelveDatos() {
        return "El nombre es " + nombre + " y la seccion es " + seccion + " y el id es: " + Id;
    }

    public static String dameIdSiguiente() {
        return "El Id que viene a continuación es: " + IdSiguiente;
    }
    private String nombre;
    /*si añadimos final despues de private se convierte en constante y
    el setter con el método cambiaNombre nos daría error
     */
    private int Id;
    private String seccion;
    private static int IdSiguiente = 1;
    /*con static creamos una variable de clase con valor inicial 1 a la que le hemos
    ordenado autoincrementarse en el constructor de la clase Empleados, se diferencia
    de las variables de objeto porque el id nos las muestra en cursiva al igual que el
    método dameIdSiguiente que contiene esa variable de clase
     */
}
