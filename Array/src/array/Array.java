
package array;


public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Llenado el array manualmente
        int [] numero = {5,7,9,15,20};
        
        
        //Boucle for normal
        
        /*
        for(int i = 0; i < 5; i++) {
            System.out.println(numero[i]);   
        }*/
        
        // ForEach
        for(int i2: numero){
            System.out.println(i2);
        }
        
        
    }
    
}
