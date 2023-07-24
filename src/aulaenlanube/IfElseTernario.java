package aulaenlanube;

public class IfElseTernario {

    public static void main(String[] args) {

        int a = 10, b = 5, x;
        x = a == 10 ? b == 10 ? 100 : 1 : a;
        System.out.println(x);

        int c = 1, d = 10, y;
        y = c == 10 ? d * 2 : d == 10 ? 100 : c;
        System.out.println(y);

        int f = 10, g = 5, z;
        z = f == 11 ? 50 : 40;
        System.out.println(z);

    }

}
