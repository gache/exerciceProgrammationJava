/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresaritmeticos;

import java.util.Scanner;

/**
 *
 * @author erick
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner entradaDatos = new Scanner(System.in); // System.in  para que lea los datos que yo quiera que lea
       
       float numero1,numero2,suma,resta,multi,div,resto; // declaro mis variable y voy a hacer las operaciones Suma, resta, multi, div.
       
       System.out.println("Digita dos numeros: "); // Imprimo en consola  el mensaje que quiero
       numero1 = entradaDatos.nextFloat(); // deposito el valor digitado en las variables numero1 y numero2
       numero2 = entradaDatos.nextFloat();
       
        suma  = numero1+numero2;
        resta = numero1-numero2;
        multi = numero1*numero2;
        div   = numero1/numero2;
        resto = numero1%numero2;
       
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multi es: " + multi);
        System.out.println("La div es: " + div);
        System.out.println("La resto es: " + resto);
    }
    
}
