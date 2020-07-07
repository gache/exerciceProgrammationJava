/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionalesejercicio_1console;

import java.util.Scanner;

/**
 *
 * @author erick
 */
public class CondicionalesEjercicio_1Console {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        
        // Solicitando el numero al usuario y guardo el valor en la variable numero
        System.out.println("Digite un numero cualquiera: ");
        numero = entrada.nextInt();
        
        // Evaluo la condicion si el numero digitado por el usuario es multiplo de 10
        if(numero%10 == 0) {
            System.out.println("El numero " +numero+  " es multiplo de 10");
        }else{
            System.out.println("El numero " + numero+  " no es multiplo de 10");
        }
    }
    
}
