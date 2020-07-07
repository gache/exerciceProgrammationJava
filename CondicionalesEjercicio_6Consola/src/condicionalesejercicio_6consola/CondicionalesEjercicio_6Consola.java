/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionalesejercicio_6consola;

import java.util.Scanner;

/**
 *
 * @author erick
 */
public class CondicionalesEjercicio_6Consola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero1, numero2;
        
        // Solicitando los datos al usuario
        System.out.println("Digite un numero cualquiera: ");
        numero1 = entrada.nextInt();
        System.out.println("Digite otro numero: ");
        numero2 = entrada.nextInt();
        
        // Evaluando la condicion
        if((numero1%2 == 0) && (numero2%2 == 0)) {
            System.out.println("Ambos numero son Pares");
        } else if ((numero1%2 != 0 && numero2%2 != 0 )){
            System.out.println("Ambos numero son Impares");
        }else {
            System.out.println("Uno de los numeros es Par y el otro es Impar");
        }
            
    }
    
}
