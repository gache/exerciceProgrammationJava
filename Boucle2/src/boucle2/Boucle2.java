/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boucle2;

import java.util.Scanner;

/**
 *
 * @author erick
 */
public class Boucle2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int i = 5, numeroDigitado;
        
        System.out.println("Digite un numero: ");
        
        numeroDigitado = entrada.nextInt();
        
        while(i <= numeroDigitado){
            System.out.println("Inicio de la boucle ");
            System.out.println(i);
            System.out.println("Fin de la boucle");
            i +=5;
        }
        
        
    }
    
}
