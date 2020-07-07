/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sentenciaswitch2;

import java.util.Scanner;

/**
 *
 * @author erick
 */
public class SentenciaSwitch2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        
        System.out.println("Digite un numero entre el 1/5: ");
        numero = entrada.nextInt();
        
        switch(numero){
            case 1: System.out.println("El numero es 1");
                break;
            case 2: System.out.println("El numero es 2");
                break;
            case 3: System.out.println("El numero es 3");
                break;
            case 4: System.out.println("El numero es 4");
                break;
            case 5: System.out.println("El numero es 5");
                break;
            default: System.out.println("El numero no esta en el rango demandado");
        
        }
    }
    
}
