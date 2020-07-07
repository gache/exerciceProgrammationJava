/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boucleejercicio4;

import java.util.Scanner;

/**
 *
 * @author erick
 */
public class BoucleEjercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero, cantidadNumerosDigitados = 0;

        System.out.println("Digite un numero: ");
        numero = entrada.nextInt();

        while (numero > 0) {
            cantidadNumerosDigitados++;
            System.out.println("Digite otro numero: ");
            numero = entrada.nextInt();
        }
        System.out.println("Se han introducido en total: " + cantidadNumerosDigitados + " numeros positivos");

    }

}
