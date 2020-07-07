/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boucleejercicio8;

import java.util.Scanner;

/**
 *
 * @author erick
 */
public class BoucleEjercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int numeroDigitado;
        
        System.out.println("Digite un numero: ");
        numeroDigitado = entrada.nextInt();
        
        for(int i = 1; i <= numeroDigitado; i++){
        
            System.out.println(i);
        }
            
    }
    
}
