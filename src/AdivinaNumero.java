
import java.util.Scanner;

public class AdivinaNumero {

    public static void main(String[] args) {

        int aleatorio = (int) (Math.random() * 1000);

        //System.out.println(aleatorio);
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int intentos = 0;

        while (num != aleatorio) {
            intentos++;
            System.out.println("Introduce un número: ");
            num = sc.nextInt();
            if (aleatorio < num) {
                System.out.println("Más bajo");
            } else if (aleatorio > num) {
                System.out.println("Más alto");
            }
        }
        System.out.println("Correcto, el número misterioso era el " + aleatorio);

    }

}
