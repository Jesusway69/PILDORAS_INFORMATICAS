package pruebas_varias;


public class VoltearVector {

  
    public static void main(String[] args) {
      
      int [] vector ={0,1,2,3,4,5,6,12,8,9};
      int backup;
      
      for (int indice = 0; indice<vector.length;indice++){
         boolean bandera;
       
        backup = vector[indice];
        vector[indice]=vector[vector.length-1-backup];
        vector[vector.length-1-indice]= backup;
        bandera= false;
      
 if (bandera = true){  
    System.out.print(vector [indice] + "  "); 
 }
       
   System.out.print (vector[backup]+ " ");    
          
       
      }


    }


}
