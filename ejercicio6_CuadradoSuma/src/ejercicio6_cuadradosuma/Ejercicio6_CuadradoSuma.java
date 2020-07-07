/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6_cuadradosuma;

import java.util.Scanner;

/**
 *
 * @author erick
 */
public class Ejercicio6_CuadradoSuma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner entradaDatos = new Scanner(System.in);
      double a, b, resultado;
      
        System.out.print("Digite el valor de A: ");
        a = entradaDatos.nextDouble();
        System.out.print("Digite el valor de B: ");
        b = entradaDatos.nextDouble();
        
        resultado = Math.pow(a, 2) + Math.pow(b, 2) + (2*a*b);        
        
        System.out.println("El resultado es : " + resultado);
    }
    
}
