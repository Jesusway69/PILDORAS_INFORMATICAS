package aulaenlanube;

/**
 *
 * @author jesus
 */
public class PotenciaConMetodoRecursivo {

    public static void main(String[] args) {
        long base = 2;
        long exponente=3;
        System.out.println(base + " elevado a " + exponente +" es igual a: " + potencia(base , exponente) + ".");

    }

    static long potencia(long base, long exponente) {
        if (exponente == 0) {
            return 1;
        }
        return base * potencia(base, --exponente);

    }
}
