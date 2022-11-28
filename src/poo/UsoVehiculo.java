package poo;


public class UsoVehiculo {

    public static void main(String[] args) {

        /*Coche Fiat_Bravo = new Coche(); //INSTANCIAR UNA CLASE, EJEMPLAR DE CLASE
        Fiat_Bravo.establece_color("azul maserati");//llamamos al método setter
        Fiat_Bravo.configura_climatizador("si");//llamamos al método setter
        Fiat_Bravo.configura_asientos("si");//llamamos al método setter
        System.out.println("Este coche tiene " + Fiat_Bravo.dime_cantidad_ruedas() + " ruedas + una de emergencia");
        System.out.println(Fiat_Bravo.dime_datos_generales());
        System.out.println(Fiat_Bravo.dime_color());
        System.out.println(Fiat_Bravo.dime_asientos());
        System.out.println(Fiat_Bravo.dime_climatizador());
        System.out.println(Fiat_Bravo.dime_peso_coche());
        System.out.println("El precio final del coche es " + Fiat_Bravo.precio_coche() + "€");
        System.out.println("El coche tiene un motor de " + Fiat_Bravo.getMotor() + " centímetros cúbicos"); */
        
       Furgoneta Fiat_Doblo = new Furgoneta (1,600);
        Fiat_Doblo.establece_color("Blanco");
        
        Fiat_Doblo.establece_color("Blanco");
        Fiat_Doblo.configura_asientos("No");
        Fiat_Doblo.configura_climatizador("Si");
        System.out.println(Fiat_Doblo.dime_datos_generales() + " , "  + Fiat_Doblo.dimeDatosFurgoneta() +" , \n" +  Fiat_Doblo.dime_color());
        
        
    }

}
