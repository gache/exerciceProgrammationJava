package boucleejercicio13;

import java.util.Scanner;

/**
 *
 * @author erick
 */
public class BoucleEjercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numeroDigitado, sumaPositivo = 0, conteoPositivo = 0, sumaNegativo = 0, conteoNegativos = 0, numeroCeros = 0;
        float mediaNegativos, mediaPosivos;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite un numero: ");
            numeroDigitado = entrada.nextInt();

            if (numeroDigitado == 0) { // Numeros de ceros
                numeroCeros++; // Aumentamos en uno el numero de ceros
            } else if (numeroDigitado > 0) { // si el numero es positivo    
                sumaPositivo += numeroDigitado; // La suma iteractiva de positivos 
                conteoPositivo++;
            } else { // si el numero es positivo  
                sumaNegativo += numeroDigitado; // La suma iteractiva de negativos 
                conteoNegativos++;
            }

        }

       // Sacando la media de los numeros Positivos
        
        if(conteoPositivo == 0) {
            System.out.println("No se puede sacar la media por que no ha digitado un numero positivo");
        } else {
        mediaPosivos = (float) sumaPositivo / conteoPositivo;
            System.out.println("la media de los numero positivo es: " + mediaPosivos);
        }
        
         // Sacando la media de los numeros Negativos
        
        if(conteoPositivo == 0) {
            System.out.println("No se puede sacar la media por que no ha digitado un numero negativos");
        } else {
        mediaPosivos = (float) sumaNegativo / conteoNegativos;
            System.out.println("la media de los numero negativos es: " + mediaPosivos);
        }
        
        System.out.println("se han digitado " + numeroCeros + " veces");
    }

}
