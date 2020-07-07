/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionalesejercicio_2;

import javax.swing.JOptionPane;

/**
 *
 * @author erick
 */
public class CondicionalesEjercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int numero1, numero2;
        
        // Solicitando los numeros al usuario y guardo los valores en las variables numero1 y numero2
        numero1 = Integer.parseInt( JOptionPane.showInputDialog("Digite un numero: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
        
        // Evaluando la condicion cual es numero es mayor
        if(numero1 > numero2 ){
            JOptionPane.showConfirmDialog(null, "El numero mayor es: " + numero1);
        }
        else if(numero2 < numero1 ){
            JOptionPane.showConfirmDialog(null, "El numero mayor es: " + numero2);
        }
        else{
            JOptionPane.showConfirmDialog(null, "Ambos numeros son iguales");
        }
    }
    
}
