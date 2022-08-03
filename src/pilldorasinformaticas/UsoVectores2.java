package pilldorasinformaticas;


public class UsoVectores2 {

    public static void main(String[] args) {

        String[] pais = new String[8];
        pais[0] = "España";
        pais[1] = "Colombia";
        pais[2] = "Perú";
        pais[3] = "Chile";
        pais[4] = "Argentina";
        pais[5] = "Venezuela";
        pais[6] = "México";
        pais[7] = "Cuba";

        for (int i = 0; i < 8; i++) {
            System.out.println("pais " + (i + 1) + " " + pais[i]);
        }

    }
}
