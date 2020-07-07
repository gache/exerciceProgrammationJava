
package boucleejercicio21;

import javax.swing.JOptionPane;

public class BoucleEjercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        
        int numero, conteoNegativo = 0 ;
        boolean hayNegativo = false;
        
        for(int i = 1; i <=10; i++){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero:"));
            
            if( numero < 0) { // si el numero es negativo
                hayNegativo = true;
                conteoNegativo++;
            }
        }
        
        if(hayNegativo == true) {
            System.out.println("Hay negativos y la cantidad es: " + conteoNegativo);
        }else{
            System.out.println("No hay negativos en los numeros digitados");
        }
        

    }
    
}
