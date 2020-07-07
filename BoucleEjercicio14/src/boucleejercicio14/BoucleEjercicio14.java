package boucleejercicio14;

import java.util.Scanner;

/**
 *
 * @author erick
 */
public class BoucleEjercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float numero, sumaSueldo = 0;
        int conteoSueldoMil = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite su sueldo por favor: ");
            numero = entrada.nextFloat();

            if (numero >= 1000) {
                conteoSueldoMil++;
            }

            sumaSueldo += numero;
        }

        System.out.println("La suma total de los sueldos es: €" + sumaSueldo);
        System.out.println("El numero de salario superior a 1000 es de: " + conteoSueldoMil);
    }

}
