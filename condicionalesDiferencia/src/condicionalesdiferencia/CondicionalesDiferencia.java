/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionalesdiferencia;

import java.util.Scanner;

/**
 *
 * @author erick
 */
public class CondicionalesDiferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entradaDatos = new Scanner(System.in);
       int numero, dato = 5;
        // Solicitando lo datos al usuario
       
        System.out.println("Digite un numero cualquiera ");
        numero = entradaDatos.nextInt();
        
        // Evaluando la condicion de Desigualdad
        if(numero != dato) {
            System.out.println("El numero es diferente de 5");
        }else{
            System.out.println("El numero es igual a 5");
        }
       
    }
    
}
