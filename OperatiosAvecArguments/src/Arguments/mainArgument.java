
package Arguments;

import javax.swing.JOptionPane;

public class mainArgument {
    
    public static void main(String [] arg) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un deuxième numero: "));
    
        OperationAvecArgument opAr1 = new OperationAvecArgument(); 
        
        opAr1.suma(n1, n2);
        opAr1.resta(n1, n2);
        opAr1.multiplication(n1, n2);
        opAr1.division(n1, n2);
        opAr1.verResultado();
        
    }
   
   
    
}
