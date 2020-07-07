/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boucleejercicio5;

import javax.swing.JOptionPane;

/**
 *
 * @author erick
 */
public class BoucleEjercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero, aleatorio, contador = 0;

        aleatorio = (int) (Math.random() * 100); // generar un numero aleatoria entre 1 y 100;

        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

            if (aleatorio > numero) {
                System.out.println("Digite un numero mayor");

            } else {
                System.out.println("Digite un numero menor");
            }
            
            contador++;
        } while (numero != aleatorio);
        
        System.out.println("\n Genial Adivinaste el numero en: " + contador + "intentos");
    }

}
