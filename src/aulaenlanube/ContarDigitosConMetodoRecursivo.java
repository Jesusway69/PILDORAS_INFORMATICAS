package aulaenlanube;

/**
 *
 * @author jesus
 */
public class ContarDigitosConMetodoRecursivo {

    public static void main(String[] args) {
        long num = 4255;
        System.out.println("el numero " + num + " tiene " + digitos(num) + " dígito" + (digitos(num) > 1 ? "s" : ""));

    }

    static long digitos(long d) {
        if (d == 0) {
            return 0;
        }else
        return 1 + digitos(d / 10);

    }
}

/*
425,5 divide entre 10
426 sale 425,5 pero al ser long quita los decimales, le suma 1
42,6 divide entre 10
43 sale 42,6 pero al ser long quita los decimales, le suma 1
4,3 divide entre 10
5 sale 4,3 pero al ser long quita los decimales, le suma 1
*/
