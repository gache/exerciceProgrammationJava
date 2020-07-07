/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionalesejercicio_1;

import javax.swing.JOptionPane;

/**
 *
 * @author erick
 */
public class CondicionalesEjercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        
        // Solicitando el numero al usuario y guardo el valor en la variable numero
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        // Evaluo la condicion si el numero digitado es multiplo de 10
        if(numero%10 == 0 ){
           JOptionPane.showConfirmDialog(null, "El numero " + numero + " es multiplo de 10 ");
        }else{
            JOptionPane.showConfirmDialog(null, "El numero " + numero + " no es multiplo de 10 ");
        }
        
    }
    
}
