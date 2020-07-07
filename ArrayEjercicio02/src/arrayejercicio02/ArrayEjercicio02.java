
package arrayejercicio02;

import java.util.Scanner;

public class ArrayEjercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        float numeros [] = new float[5];
        
        System.out.println("Digite los numeros del array: ");
        
        for(int i = 0; i < 5; i++){
            
            System.out.print( (i +1 ) + " Digite su numero: ");
            numeros[i] = entrada.nextFloat();
        }
        
        // mostrar los numeros de manera inversa
        
        for(int i = 4; i > 0; i--){
            System.out.println(numeros[i]);
        }
    }
    
}
