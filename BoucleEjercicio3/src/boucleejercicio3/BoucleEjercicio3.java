/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boucleejercicio3;

import java.util.Scanner;

/**
 *
 * @author erick
 */
public class BoucleEjercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;

        System.out.println("Digite un numero: ");
        numero = entrada.nextInt();

        while (numero != 0) {
            if (numero % 2 == 0) {
                System.out.println("El numero " + numero + " es par ");
            } else {
                System.out.println("El numero " + numero + " es impar ");
            }
            System.out.println("Digite otro numero: ");
            numero = entrada.nextInt();
        }
    }

}
