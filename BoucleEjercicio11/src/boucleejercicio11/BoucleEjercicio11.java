
package boucleejercicio11;

/**
 *
 * @author erick
 */
public class BoucleEjercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        long resultado = 1;
      
        for(int i = 1; i <= 20; i+=2) {
            
            resultado *= i; // multiplicacion iteractiva
        }
        System.out.println("El resultado de i es: " + resultado);
    }
    
}
