/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_3cantidaddinero;

import java.util.Scanner;

/**
 *
 * @author erick
 */
public class Ejercicio_3CantidadDinero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entradaDatos = new Scanner(System.in);
        int guillermo, luis, juan, total;
        
        System.out.println("Digite la cantidad de dinero que tiene guillermo");
        guillermo = entradaDatos.nextInt();
        
            luis = guillermo / 2;
            juan = (guillermo + luis) / 2;
            total = guillermo + luis + juan;
       
        System.out.println("Guillermo tiene : "+ guillermo );
        System.out.println("Luis tiene : " + luis);
        System.out.println("Juan tiene : " + juan);
        System.out.println("El total entre los tres es : " + total);
    }
    
}
