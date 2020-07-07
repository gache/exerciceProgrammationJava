package arrayejercicio01;

import java.util.Scanner;

public class ArrayEjercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);

        int numero;

        System.out.println("Digite la cantidad de elementos del array: ");
        numero = entrada.nextInt();

        int[] numerosDigitados = new int[numero];

        System.out.println("Digite los numeros del arreglos: ");

        for (int i = 0; i < numero; i++) {
            System.out.println((i + 1) + " Digite los numeros");

            numerosDigitados[i] = entrada2.nextInt();
        }

        for (int i = 0; i < numero; i++) {
        System.out.print(numerosDigitados[i] + " ");

        }

    }

}
