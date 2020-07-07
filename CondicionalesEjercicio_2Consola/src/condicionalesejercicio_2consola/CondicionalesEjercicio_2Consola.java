/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionalesejercicio_2consola;

import java.util.Scanner;

/**
 *
 * @author erick
 */
public class CondicionalesEjercicio_2Consola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      int numero1, numero2;
      
      // Solicitando los numeros al usuario y guardo los valores en las variables numero1 y numero2
        System.out.println("Digite un numero: ");
        numero1= entrada.nextInt();
        System.out.println("Digite otro numero: ");
        numero2= entrada.nextInt();
      
      // Evaluando la condicion cual es numero es mayor
        
        if(numero1 > numero2){
            System.out.println("El numero mayor es: " + numero1);
        }else if (numero2 > numero1){
            System.out.println("El numero mayor es: " + numero2);
        }else{
            System.out.println("Ambos numeros son iguales");
        }
        
        
    }
    
}
