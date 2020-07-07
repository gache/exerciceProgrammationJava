
package boucleejercicio1;

import java.util.Scanner;

public class BoucleEjercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeroDigitado, cuadrado;
        
        System.out.println("Digite un numero: ");
        numeroDigitado = entrada.nextInt();
        
        while(numeroDigitado >= 0) {
            cuadrado = (int)Math.pow(numeroDigitado, 2); 
            
            System.out.println("El numero " + numeroDigitado + " su cuadrado es " + cuadrado );
            System.out.println("Digite un numero: ");
            numeroDigitado = entrada.nextInt();}    
    }
    
}
