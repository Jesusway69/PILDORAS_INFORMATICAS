package poo;

public class Coche {
//variables de instancia

    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso_plataforma;
    String color;
    int peso_total;
    boolean asientos_cuero, climatizador;


    /*private es un modificador de acceso que encapsula el dato
 para que no se pueda modificar en otra clase*/
    public Coche() {
        //constructores
        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1500;
        peso_plataforma = 500;
        peso_total=1360;
    }

    public String dime_largo() { //método getter que nos devuelve un valor con texto
        return "El coche mide " + largo + " de largo";
    }

    public void establece_color(String color_coche) { //método setter que establece valor y no devuelve dato (void)
        color = color_coche;

    }

    public String dime_color() {//método getter que nos devuelve un valor con texto
        return "el color del coche es " + color;
    }
}
