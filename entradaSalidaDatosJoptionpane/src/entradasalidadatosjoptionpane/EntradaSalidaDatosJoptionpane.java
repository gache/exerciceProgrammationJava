/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entradasalidadatosjoptionpane;
import javax.swing.JOptionPane; // Esta importacion nos permite hacer ventanas emergentes al momento ejecutar nuestro codigo


/**
 *
 * @author erick
 */
public class EntradaSalidaDatosJoptionpane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  // Declarando las variables
        String cadena;
        int    entero;
        char   letra;
        double decimal;
        
        // Gracias showInputDialog como input es introducir datos en este caso tenemos que dar o introducir la informacion en la ventana que nos sale
        // JOptionPane.showInputDialog(" ") Nos deveulve siempre un string
        
        cadena  = JOptionPane.showInputDialog("Digite una Cadena: "); // Creacion de la ventana emergente y la infomacion que le demos se guarda en la variable respectiva
        entero  = Integer.parseInt(JOptionPane.showInputDialog("Digite un Numero entero: ")); // como JOptionPane.showInputDialog(" ") nos devulve siempre un string para la creacion de un string a entero tenemos que agregar  "Integer.parseInt()" delante y en los parentesis la cadena
        letra   = JOptionPane.showInputDialog("Digite un Caracter: ").charAt(0); // como JOptionPane.showInputDialog(" ") nos devulve siempre un string para la creacion de un string a un entero debo agregar al final charAt(0) con el indice que busco.
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un Decimal: "));  // como JOptionPane.showInputDialog(" ") nos devulve siempre un string para la creacion de un string a double tenemos que agregar "Double.parseDouble" delante y en los parentesis la cadena
       
        //JOptionPane.showMessageDialog(); es salida de datos, con dos parametros en la primera colocamos "null" y el segundo el texto que nosotros querramos
        
        
        JOptionPane.showMessageDialog(null, "La cadena es: " + cadena);
        JOptionPane.showMessageDialog(null, "El Numero entero es: " + entero);
        JOptionPane.showMessageDialog(null, "EL Caracter es: " + letra);
        JOptionPane.showMessageDialog(null, "EL decimal es: " + decimal);
    }
    
}
