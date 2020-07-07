/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadorternario;

import javax.swing.JOptionPane;

/**
 *
 * @author erick
 */
public class OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        String  mensaje;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero cualquiera: "));
        
        mensaje = (numero%2 == 0) ? "El numero es par " :"El numero es impar";
        
        JOptionPane.showConfirmDialog(null, mensaje);
    }
    
}
