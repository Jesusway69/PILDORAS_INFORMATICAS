package poo;

public class Coche {

//variables de instancia

    private int ruedas;
    private double largo;
    private int ancho;
    private int motor;
    private int peso_plataforma;
    private String color;
    private int peso_total;
    private boolean asientos_cuero, climatizador;
    public int plazas;


    /*private es un modificador de acceso que encapsula el dato
 para que no se pueda modificar en otra clase*/
    public Coche() {
        //constructores
        ruedas = 4;
        largo = 4330;
        ancho = 179;
        motor = 2000;
        peso_plataforma = 500;
        peso_total = 1360;
        plazas = 5;
    }

    public String dime_datos_generales() { //método getter que nos devuelve valores con el texto que queramos
        return "La plataforma del vehículo tiene " + ruedas + " ruedas , \n mide "
                + largo / 1000 + " metros \n con un ancho de " + ancho
                + " cms,\n un peso de plataforma de " + peso_plataforma + " kilos";

    }

    public void cantidad_ruedas() {
        ruedas = 5;
        /*esta variable ya está iniciada pero se puede reiniciar así
        pero como está encapsulada con private aunque le demos valor 5 seguirá valiendo 4
         */
        this.ruedas = ruedas;
        /*tambien se puede "settear" así con this. en este caso sin error porque
        tanto la variable de clase como el argumento aunque se llamen igual
        ambos nos piden un int*/

    }

    public int dime_cantidad_ruedas() {
        return 56;
        /*En el caso del getter SÍ se modifica el valor a devolver en la impresión
    , para asegurarnos de que nos devuelve el valor original le pediremos que devuelva la variable
    encapsulada con valor 4 asI: return ruedas;
         */
    }

    public void establece_color(String color_coche) { //método setter que establece valor y no devuelve dato (void)
        color = color_coche;//variable de clase=argumento;

    }

    public String dime_color() {//método getter que nos devuelve un valor con el texto que queramos
        return "el color del coche es " + color;
    }

    public void configura_asientos(String asientos_cuero) {
        /*this.asientos_cuero=asientos_cuero;
con el this. le decimos a java que nos referimos a la variable de clase si se llaman igual
pero como la variable de clase espera un boolean y el argumento un string nos da error
 para solucionarlo le añadiremos un condicional al método setter*/
        
        if (asientos_cuero == "si") {/*este condicional así funciona en consola pero no 
            con entrada de datos por teclado porque lo correcto cuando se comparan cadenas es
            con el método equals así: if(climatizador.equalsignorecase("no"))
            */
            this.asientos_cuero = true;
        } else {
            this.asientos_cuero = false;
        }

    } 

    public String dime_asientos() {
        if (asientos_cuero==true) {
            /*Aquí hemos puesto el comparador ==true aunque en realidad no es
            necesario ya que por defecto java interpreta que el estado inicial
            de un booleano es true, si ponemos if(asientos_cuero) funciona igual.
            */ 
            return "El coche tiene asientos de cuero";
        } else {
            return "El coche no tiene asientos de cuero";
        }
    }

    public void configura_climatizador(String climatizador) {
        if (climatizador == "si") {/*este condicional así funciona en consola pero no 
            con entrada de datos por teclado porque lo correcto cuando se comparan cadenas es
            con el método equals así: if(climatizador.equalsignorecase("si"))
            */
            this.climatizador = true;
        } else {
            this.climatizador = false;
        }
    }

    public String dime_climatizador() {
        if (climatizador == true) {
            /*Aquí hemos puesto el comparador ==true aunque en realidad no es
            necesario ya que por defecto java interpreta que el estado inicial
            de un booleano es true, si ponemos if(climatizador) funciona igual.
            */ 
            return "El coche tiene climatizador";
        } else {
            return "el coche no tiene climatizador";
        }
    }
    

    public String dime_peso_coche() { 
        /* Método setter y getter combinado que establece el valor 
        de la variable peso_total y nos la devuelve con los cálculos hechos
        dentro del mismo método, opción generalmente NO RECOMENDABLE
        */
            
        int peso_carroceria = 840;
        peso_total = peso_plataforma + peso_carroceria;
        if (asientos_cuero == true) {
            peso_total = peso_total + 50;
        }
        if (climatizador == true) {
            peso_total = peso_total + 20;
        }
        return "El peso del coche es "+ peso_total;
    }
    
    public int precio_coche(){
        int precio_final=20000;
        if(asientos_cuero==true){
            precio_final+=2000;
        }
        if(climatizador==true){
            precio_final+=1500;
        }
        return precio_final;
    }
     public int getMotor() {//getter y setter generados por netbeans
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }
    public void cantidadPlazas(){
        this.plazas = plazas;
    }
            
}


