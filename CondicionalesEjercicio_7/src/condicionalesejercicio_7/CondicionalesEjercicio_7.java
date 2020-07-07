/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionalesejercicio_7;

import javax.swing.JOptionPane;

/**
 *
 * @author erick
 */
public class CondicionalesEjercicio_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      // Declaracion de las variables
      int numero1,numero2,numero3;
      
      // Solicitando cualquier numero y lo guardo en sus respectivas variables
      
      numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero cualquiera"));
      numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero cualquiera"));
      numero3 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero cualquiera"));
      
      // Analizando la condicion cual es el numero mayor
      
      if((numero1 > numero2) && (numero2 > numero3)){
            JOptionPane.showConfirmDialog(null, "los numero son: " +numero1 + " - " +numero2 + " - " +numero3);
      }
      else if ((numero1 > numero3) && (numero3 > numero2)){
            JOptionPane.showConfirmDialog(null, "los numero son: " +numero1 + " - " +numero3 + " - " +numero2);
      }
      else if ((numero2 > numero1) && (numero1 >numero3)) {
           JOptionPane.showConfirmDialog(null, "los numero son: " +numero2 + " - " +numero1 + " - " +numero3);
      }
      
      else if((numero2 >numero3) && (numero3>numero1)){
           JOptionPane.showConfirmDialog(null, "los numero son: " +numero2 + " - " +numero3 + " - " +numero1);
    }
      
      else if((numero3 >numero1) && (numero1 > numero2)){
           JOptionPane.showConfirmDialog(null, "los numero son: " +numero3 + " - " +numero1 + " - " +numero2);
      }
      else{
           JOptionPane.showConfirmDialog(null, "los numero son: " +numero3 + " - " +numero2 + " - " +numero1);
      }
    }
    
}
