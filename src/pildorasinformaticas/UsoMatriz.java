package pilldorasinformaticas;


public class UsoMatriz {

    public static void main(String[] args) {
        int[][] m = new int[4][5];
        m[0][0] = 15;
        m[0][1] = 28;
        m[0][2] = 19;
        m[0][3] = 9;
        m[0][4] = 25;

        m[1][0] = 10;
        m[1][1] = 52;
        m[1][2] = 20;
        m[1][3] = 39;
        m[1][4] = 7;

        m[2][0] = 56;
        m[2][1] = 24;
        m[2][2] = 36;
        m[2][3] = 12;
        m[2][4] = 8;

        m[3][0] = 74;
        m[3][1] = 47;
        m[3][2] = 35;
        m[3][3] = 5;
        m[3][4] = 42;
        
        for(int i=0 ;i<4;i++){
           for(int j=0;j<5;j++) {
              System.out.print(m[i][j] + " ");  
           }
            
            
        }
        
       
    }

}
