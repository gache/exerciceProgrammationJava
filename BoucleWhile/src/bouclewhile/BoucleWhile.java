
package bouclewhile;

import java.util.Scanner;

/**
 *
 * @author erick
 */
public class BoucleWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner datos = new Scanner(System.in);
        
       int i = 1; 
       int numero;
       
        System.out.println("Digite un numero por favor:");
        numero = datos.nextInt();
       
       while (i <= numero){
           System.out.println(i);
           i++;
       }
    }
    
}
