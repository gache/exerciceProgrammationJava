
package boucleejercicio20;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class BoucleEjercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        float sueldo, sueldoMaximo = 0 ;
        int numeroSueldos;
        
      
        numeroSueldos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de numeros de sueldo que desea: "));
        
       for(int i = 1; i <= numeroSueldos; i++){
        sueldo = Float.parseFloat(JOptionPane.showInputDialog("Digite el sueldo N°" +i+":" ));
        
        if(sueldo > sueldoMaximo){
            sueldoMaximo = sueldo;
        }
       }
       
        System.out.println("El sueldo maximo es: " + sueldoMaximo);
    }
    
}
