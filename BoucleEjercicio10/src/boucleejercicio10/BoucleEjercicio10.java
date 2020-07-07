/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boucleejercicio10;

import java.util.Scanner;

/**
 *
 * @author erick
 */
public class BoucleEjercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);
     
     int numero, suma = 0;
    
        
       for(int i = 1; i <= 10; i++ ){
        System.out.println("Digite un numero: ");
        numero = entrada.nextInt();
        
        suma = suma + numero; // suma iteractiva
       }
       
        System.out.println("La Suma total de los numeros es: " + suma);
    }
    
}
