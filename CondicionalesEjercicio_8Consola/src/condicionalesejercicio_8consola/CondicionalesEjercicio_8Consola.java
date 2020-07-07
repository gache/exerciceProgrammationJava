/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionalesejercicio_8consola;

import java.util.Scanner;

/**
 *
 * @author erick
 */
public class CondicionalesEjercicio_8Consola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        // Declaracion de la variable
        int numero;
        
        // Solicitando cualquier numero y lo guardo en sus respectiva variable
        System.out.println("Digite un numero cualquiera entre 0 y 99.999 : ");
        numero = entrada.nextInt();
        
        // Evalundo la condicion de cuntas cifras tiene el numero digitado
        if(numero < 10){
            System.out.println("El numero " + numero + " tiene una cifra");
        }
        else if (numero < 100){
            System.out.println("El numero " + numero+ " tiene dos cifras");
        }
        else if (numero < 1000){
            System.out.println("El numero " + numero+ " tiene tres cifras");
        }   
        else if (numero < 10000){
            System.out.println("El numero " + numero+ " tiene cuatro cifras");
        }
        else if (numero < 100000) {
           System.out.println("El numero " + numero+ " tiene cinco cifras");
        }
        
        else{
           System.out.println("El numero " + numero+ " tiene mas de cinco cifras");
        }

}
    
}
