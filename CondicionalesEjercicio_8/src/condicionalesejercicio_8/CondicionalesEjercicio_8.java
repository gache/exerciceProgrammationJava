/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionalesejercicio_8;

import javax.swing.JOptionPane;

/**
 *
 * @author erick
 */
public class CondicionalesEjercicio_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaracion de la variable
        int numero;
        
        // Solicitando cualquier numero y lo guardo en sus respectiva variable
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero cualquiera entre 0 y 99.999 : "));
        
        // Evalundo la condicion de cuntas cifras tiene el numero digitado
        if (numero < 10){
            JOptionPane.showConfirmDialog(null, "El numero " + numero + " tiene una cifra");
        }
        else if (numero < 100){
            JOptionPane.showConfirmDialog(null, "El numero " + numero + " tiene dos cifra");
        }
        else if(numero < 1000) {
            JOptionPane.showConfirmDialog(null, "El numero " + numero + " tiene tres cifra");
        }
        else if (numero < 10000){
            JOptionPane.showConfirmDialog(null, "El numero " + numero + " tiene cuatro cifra");
        }
        else if (numero < 100000){
            JOptionPane.showConfirmDialog(null, "El numero " + numero + " tiene cinco cifra");

        }else {
            JOptionPane.showConfirmDialog(null, "El numero " + numero + " tiene  mas de cinco cifra");
        }
        
    }
    
}
