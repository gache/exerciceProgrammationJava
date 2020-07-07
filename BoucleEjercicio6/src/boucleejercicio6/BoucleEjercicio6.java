package boucleejercicio6;

import java.util.Scanner;

/**
 *
 * @author erick
 */
public class BoucleEjercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero, suma = 0;

        do {
        System.out.println("Digite un numero: ");
        numero = entrada.nextInt();
        suma += numero;        
        }while (numero != 0);
        System.out.println("la suma total de los numeros digitados es: " + suma);
    }

}
