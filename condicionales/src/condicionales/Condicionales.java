/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales;

import javax.swing.JOptionPane;

/**
 *
 * @author erick
 */
public class Condicionales {

    /**
     * @param args the command line arguments
     */
    
    /* Operadores 
    
    == : Igualdad
    != : Diferencia
    >  : Mayor que
    >= : Mayor o igial
    <  : Menor que
    <= : Menor o igual
    
    */
    
    
    public static void main(String[] args) {
       
        int numero, datos = 5;
     
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero:"));
        
        // Evaluo la condicion de Igualdad
        if(numero == datos){
            JOptionPane.showConfirmDialog(null, "El numero es igual a 5");
        }else{
            JOptionPane.showConfirmDialog(null, "El numero es diferente de 5");
        }
        
        System.out.println(numero);
        
    }
    
}
