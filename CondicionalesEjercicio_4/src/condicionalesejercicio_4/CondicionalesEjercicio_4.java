/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionalesejercicio_4;

import javax.swing.JOptionPane;

/**
 *
 * @author erick
 */
public class CondicionalesEjercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        final float descuento;
               float compra;
        // Solito el valor de la compra
        compra = Float.parseFloat(JOptionPane.showInputDialog("Digite el monto de su compra"));
        
        // Evaluo la condicion si la compra le debo aplicar el descuento 
        if(compra > 300) {
            descuento = compra * 0.20f;
            compra -= descuento;
            JOptionPane.showConfirmDialog(null, "Su compra ha sido de: " + compra);
        }else {
        JOptionPane.showConfirmDialog(null, "Su compra ha sido de: " + compra);
        }
        
        
        
        
    }
    
}
