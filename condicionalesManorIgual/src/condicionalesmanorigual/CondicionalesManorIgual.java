/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionalesmanorigual;

import java.util.Scanner;

/**
 *
 * @author erick
 */
public class CondicionalesManorIgual {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
            int numero, dato = 5;
        // Solicitando los datos al usuario y los guardo en la variable numero
            System.out.println("Digite un numero cualquiera ");
            numero = entrada.nextInt();
        
        // Evaluando la condicion de Menor o igual
        if(numero <= dato) {
            System.out.println("El numero es menor o igual a 5");
        }else{
            System.out.println("El numero es mayor a 5");
        }
    }
    
}
