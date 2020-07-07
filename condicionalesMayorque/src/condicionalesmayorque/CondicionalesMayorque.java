/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionalesmayorque;

import java.util.Scanner;

/**
 *
 * @author erick
 */
public class CondicionalesMayorque {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int numero, dato = 5;
       
       // Solicitando los datos al usuario y los guardo en la variable numero
        System.out.println("Digite un numero cualquiera: ");
        numero = entrada.nextInt();
        
        // Evaluando la condicion de Mayor que 
        if(numero > dato){
            System.out.println("El numero digitado es mayor que 5");
        }else{
            System.out.println("El numero digitado es 5 o menor que 5");
        }
    }
    
}
