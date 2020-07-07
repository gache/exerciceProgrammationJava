/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sentenciaswitch;

import javax.swing.JOptionPane;

/**
 *
 * @author erick
 */
public class SentenciaSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int dato;
        // El usuario digita un numero y lo guardo en la variable dato
        dato = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entre el 1 y el  5: "));
        
        
        // Evaluando el numero que digito el usuario para saber cual condicion se cumple
        switch(dato){
            case 1: JOptionPane.showMessageDialog(null, "El usuario digito el numero 1");
                    break;
            case 2: JOptionPane.showMessageDialog(null, "El usuario digito el numero 2");
                    break;
            case 3: JOptionPane.showMessageDialog(null, "El usuario digito el numero 3");
                    break;
            case 4: JOptionPane.showMessageDialog(null, "El usuario digito el numero 4");
                    break;
            case 5: JOptionPane.showMessageDialog(null, "El usuario digito el numero 5");
                    break;
            default: JOptionPane.showConfirmDialog(null, "El usuario digito otro numero");
                    break;
        }
        
    }
    
}
