/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionalesejercicio_4consola;

import java.util.Scanner;

/**
 *
 * @author erick
 */
public class CondicionalesEjercicio_4Consola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final float descuento;
              float compra;
              
        // Solito el valor de la compra
        System.out.println("Digite el monto de su compra: ");
        compra = entrada.nextFloat();
        
        // Evaluo la condicion si la compra le debo aplicar el descuento 
        if(compra > 300) {
            descuento = compra * 0.20f;
            compra = compra - descuento;
            System.out.println("Su compra con el descuento es de: " + compra);
        }else {
            System.out.println("Su compra sin descuento es de: " + compra);
        }
    }
    
}
