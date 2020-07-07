package boucleejercicio16;

import javax.swing.JOptionPane;

public class BoucleEjercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numero;
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digiete un numero entre 0 y 10"));
        } while (numero < 0 || numero > 10);
        
        for(int i = 12; i > 0; i--) {
            System.out.println(numero + " x " + i + " = " + i*numero);
        }

    }

}
