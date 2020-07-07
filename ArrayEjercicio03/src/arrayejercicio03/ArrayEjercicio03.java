package arrayejercicio03;

import java.util.Scanner;

public class ArrayEjercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);

        // creacion de las variables
        int sumaPositivo = 0, sumaNegativo = 0, numeroPositivos = 0, numeroNegativos = 0, numerosCeros = 0, mediaPositivos, MediaNegativos;

        // creacion del array
        int[] numerosDigitados = new int[5];

        System.out.println(" Digite los 5 elementos del array: ");

        // Guardando los numeros digitados por el usuarios en el array
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + " Digite los numeros: ");
            numerosDigitados[i] = entrada2.nextInt();

            if (numerosDigitados[i] == 0) {
                numerosCeros++;
            } else if (numerosDigitados[i] > 0) {
                sumaPositivo += numerosDigitados[i];
                numeroPositivos++;

            } else {
                sumaNegativo += numerosDigitados[i];
                numeroNegativos++;
            }

        }

        // sacando la media de los numeros positivos
        if (numeroPositivos == 0) {
            System.out.println("No se puede sacar la media de cero");
        } else {
            mediaPositivos = sumaPositivo / numeroPositivos;
            System.out.println(" la media de los numeros positivos es: " + mediaPositivos);
        }

             // sacando la media de los numeros negativos
        if (numeroNegativos == 0) {
            System.out.println("No se puede sacar la media de cero");
        } else {
            MediaNegativos = sumaNegativo / numeroNegativos;
            System.out.println(" la media de los numeros negativos es: " + MediaNegativos);
        }
        System.out.println("le numeros de ceros es: " + numerosCeros);

    }

}
