package poo;


public class UsoCoche {

  
    public static void main(String[] args) {
        
        Coche Fiat = new Coche(); //INSTANCIAR UNA CLASE, EJEMPLAR DE CLASE
        Fiat.establece_color();//llamamos al método setter
        //System.out.println("Este coche tiene " + Fiat.ruedas + " ruedas");

System.out.println("Este coche pesa " + Fiat.peso_total + " kilos");
 System.out.println(Fiat.dime_color());

    }

}
