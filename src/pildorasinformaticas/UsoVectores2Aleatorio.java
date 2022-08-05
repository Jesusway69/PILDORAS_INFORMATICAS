package pilldorasinformaticas;


public class UsoVectores2Aleatorio {


    public static void main(String[] args) {
        
       int [] v=new int[6];
       for (int i=0;i<v.length;i++){
           v[i]=(int) Math.round(Math.random()*50);
       }
        for(int n:v){
            System.out.println(n + " ");
        }
    }

}
