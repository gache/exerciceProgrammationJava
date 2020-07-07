/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionalesejercicio_3;

import javax.swing.JOptionPane;

/**
 *
 * @author erick
 */
public class CondicionalesEjercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char teclar;
        // Solicitando al usuario que digite un caracter y guardo en la variable teclar
        teclar = JOptionPane.showInputDialog("Digite una letra: ").charAt(0);
        
        
        // Evaluando la condicion si la letra es mayuscula o miniscula
        if(Character.isUpperCase(teclar)){
            JOptionPane.showConfirmDialog(null, "La letra " + teclar + " es mayuscula" );
        }else{
            JOptionPane.showConfirmDialog(null, "La letra " + teclar + "es minuscula" );
        }
        
    }
    
}
