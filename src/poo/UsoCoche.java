package poo;


public class UsoCoche {

  
    public static void main(String[] args) {
        
        Coche Fiat = new Coche(); //INSTANCIAR UNA CLASE, EJEMPLAR DE CLASE
        Fiat.establece_color("azul maserati");//llamamos al método setter
        //System.out.println("Este coche tiene " + Fiat.ruedas + " ruedas");
Fiat.color="amarillo";/*error por no encapsular con private la variable de instancia color,
el programa no da error pero imprime el último valor "amarillo" en lugar del 
establecido en el método setter dentro de "establece_color"
*/
System.out.println("Este coche pesa " + Fiat.peso_total + " kilos");
 System.out.println(Fiat.dime_color());

    }

}
