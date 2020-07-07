/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresaritmeticos2;

import java.util.Scanner;

/**
 *
 * @author erick
 */
public class OperadoresAritmeticos2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entradaDeDatos = new Scanner(System.in);
        
        float numero1, numero2, suma, resta, multiplicacion, division, residuo;
        
        System.out.println("Digita dos numero: ");
        numero1 = entradaDeDatos.nextFloat();
        numero2 = entradaDeDatos.nextFloat();
        
        suma = numero1 + numero2;
        resta = numero1 - numero2;
        multiplicacion = numero1 * numero2;
        division = numero1 / numero2;
        residuo = numero1 % numero2;
        
        System.out.println("el resultado de la suma es: " + suma);
        System.out.println("el resultado de la resta es: " + resta);
        System.out.println("el resultado de la multiplicacion es: " + multiplicacion);
        System.out.println("el resultado de la division es: " + division);
        System.out.println("el resultado de la residuo es: " + residuo);
    }
    
}
