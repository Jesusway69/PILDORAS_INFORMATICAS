package aulaenlanube;

public class BucleForBreakContinue {

    public static void main(String[] args) {

         System.out.println("Empezamos:  ");
        for (int i = 1; i <= 10; i += 1) {
            System.out.println("vuelta:  " + i);
            if (i == 8) {
                break;
            }
            System.out.println("terminada vuelta nº:  " + i);
            

        }
                System.out.println("\nTerminado bucle con break\n");
                
                
                
                 System.out.println("Empezamos:  ");
        for (int i = 1; i <= 10; i += 1) {
            System.out.println("vuelta:  " + i);
            if (i == 8) {
                continue;
            }
            System.out.println("terminada vuelta nº:  " + i);
            

        }
                System.out.println("\nTerminado bucle con continue\n"); 
                
                
                          System.out.println("Empezamos:  ");
        for (int i = 1; i <= 10; i += 1) {
            System.out.println("vuelta:  " + i);
            salir:
            if (i == 8) {
                i++;
                break salir;
            }
            System.out.println("terminada vuelta nº:  " + i);
            

        }
                System.out.println("\nTerminado bucle con redireccionamiento de break\n"); 
        
        int i = 1;
        for (;;) {
            if (i == 6) {
                break;
            }
            System.out.print(i+" ");
            i++;
        }

    }

}
