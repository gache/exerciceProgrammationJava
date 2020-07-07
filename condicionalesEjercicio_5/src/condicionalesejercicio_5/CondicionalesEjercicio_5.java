/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionalesejercicio_5;

import javax.swing.JOptionPane;

/**
 *
 * @author erick
 */
public class CondicionalesEjercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nHorasTrabajo; 
        float salarioTotal;
      
          // Solito el numero de horas trabajadas
         nHorasTrabajo =  Integer.parseInt(JOptionPane.showInputDialog("Digite cuantas horas trabajo en la semana: "));
         
         
         //Evaluo la condiciones de cuanto es el salario total del obrero
         if(nHorasTrabajo <= 40){
             salarioTotal =  nHorasTrabajo * 16;
      
         }else{
         salarioTotal = (40*16) + ((nHorasTrabajo-40)*20);
         }
         JOptionPane.showConfirmDialog(null, "El salario semanal del obrero es de:  " + salarioTotal);
             
    }
    
}
