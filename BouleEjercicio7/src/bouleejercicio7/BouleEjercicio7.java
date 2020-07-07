package bouleejercicio7;

import java.util.Scanner;

public class BouleEjercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero, elemento = 0, suma = 0;
        float media;

        System.out.println("Digite un numero: ");
        numero = entrada.nextInt();

        while (numero >= 0) {

            suma += numero;
            elemento++;

            System.out.println("Digite otro numero: ");
            numero = entrada.nextInt();
        }

        if (elemento == 0) {
            System.out.println("Error No se puede hacer la division en  cero ");
        } else {

            media = (float) suma / elemento;
            System.out.println(" La media  es: " + media);
        }

    }

}
