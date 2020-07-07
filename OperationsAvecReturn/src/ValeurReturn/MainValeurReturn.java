
package ValeurReturn;

import javax.swing.JOptionPane;

public class MainValeurReturn {
    
    public static void main(String [] arg) {
     int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
     int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un deuxième numero: "));
     
     OperationsValeurReturn op1 = new OperationsValeurReturn();
     
     System.out.println("El resultado de la suma es " + op1.suma(n1, n2));
     System.out.println("El resultado de la resta es " + op1.resta(n1, n2));
     System.out.println("El resultado de la multiplicacion es " + op1.multiplication(n1, n2));
     System.out.println("El resultado de la division  es " + op1.division(n1, n2));
 
    }
    
    
}
