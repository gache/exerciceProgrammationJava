/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boucleejercicio2;

import java.util.Scanner;

/**
 *
 * @author erick
 */
public class BoucleEjercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;

        System.out.println("Digite un numero: ");

        numero = entrada.nextInt();

        while (numero != 0) {

            if (numero > 0) {
                System.out.println("El numero digitado es " + numero + " es positive");
            } else {
                System.out.println("El numero digitado es  " + numero + " es negatif");
            }
            System.out.println("Digite un numero: ");
            numero = entrada.nextInt();
        }
    }

}
