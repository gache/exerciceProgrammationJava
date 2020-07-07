/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_8ecuacionsegundogrado;

import java.util.Scanner;

/**
 *
 * @author erick
 */
public class Ejercicio_8EcuacionsegundoGrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entradaDatos = new Scanner(System.in);
        double a, b, c, resultado1, resultado2;
        
        // Solicitando el valor de A
        System.out.print("Digita el valor de A: ");
        a = entradaDatos.nextDouble();
        
        // Solicitando el valor de B
        System.out.print("Digita el valor de B: ");
        b = entradaDatos.nextDouble();
        
        // Solicitando el valor de C
        System.out.print("Digita el valor de C: ");
        c = entradaDatos.nextDouble();
        
        resultado1 = (-b+Math.sqrt(Math.pow(b,2) - (4*a*c))) / (2*a);
        
        resultado2 = (-b-Math.sqrt(Math.pow(b,2) - (4*a*c))) / (2*a);
        
        System.out.println("\nLa raiz uno es: " + resultado1 );
        System.out.println("\nLa raiz dos es: " + resultado2 );
        
    }
    
}
