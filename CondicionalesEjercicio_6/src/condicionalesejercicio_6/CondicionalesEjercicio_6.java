/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionalesejercicio_6;

import javax.swing.JOptionPane;

/**
 *
 * @author erick
 */
public class CondicionalesEjercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        int numero1, numero2;
        
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero cualquiera: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
        
        if ((numero1%2 == 0) && (numero2%2 == 0) ) {
        JOptionPane.showConfirmDialog(null, "Ambos numeros son Pares");
        }else if ((numero1%2 != 0 && numero2%2 != 0)) {
             JOptionPane.showConfirmDialog(null, "Ambos numeros son Impares");
        }else {
        JOptionPane.showConfirmDialog(null, "Uno de los numeros es par y el otro es impar ");
        }
    }
    
}
