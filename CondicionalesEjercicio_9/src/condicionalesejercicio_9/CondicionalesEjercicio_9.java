/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionalesejercicio_9;

import javax.swing.JOptionPane;

/**
 *
 * @author erick
 */
public class CondicionalesEjercicio_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // Declaracion de las variables
        
        int dia, mes, año;
    
        
        dia = Integer.parseInt(JOptionPane.showInputDialog("Digite un dia"));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Digite un mes"));
        año = Integer.parseInt(JOptionPane.showInputDialog("Digite un año"));
        
        if((dia >= 1) && (dia <= 30)){ // Si el dia es correcto
            if((mes >= 1) && (mes <= 12)) { // si el mes correcto
                if(año != 0){ // si el año es correcto
                 JOptionPane.showConfirmDialog(null, "la fecha correcta");
                } else {
                    JOptionPane.showConfirmDialog(null, "la fecha esta incorrecta, año incorrecto");
                }
            }else {
                JOptionPane.showConfirmDialog(null, "la fecha esta incorrecta, mes incorrecto");
            }
        }else {
        JOptionPane.showConfirmDialog(null, "la fecha esta incorrecta, dia incorrecto");
        }
    }
    
}
