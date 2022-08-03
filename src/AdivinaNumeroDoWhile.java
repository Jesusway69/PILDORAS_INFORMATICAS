
import java.util.Scanner;

public class AdivinaNumeroDoWhile {

    public static void main(String[] args) {

        int aleatorio = (int) (Math.random() * 1000);

        //System.out.println(aleatorio);
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int intentos = 0;

        do {
            intentos++;
            System.out.println("Introduce un número: ");
            num = sc.nextInt();
            if (aleatorio < num) {
                System.out.println("Más bajo");
            } else if (aleatorio > num) {
                System.out.println("Más alto");
            }
        } while (num != aleatorio);
        System.out.println("Correcto!!!, el número misterioso era el " + aleatorio + ", has necesitado " + intentos + " intentos");

    }

}
