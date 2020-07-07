/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionalesejercicio_7consola;

import java.util.Scanner;

/**
 *
 * @author erick
 */
public class CondicionalesEjercicio_7Consola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       // Declaracion de las variables
       int N1, N2, N3;
       
       // Solicitando cualquier numero y lo guardo en sus respectivas variables 
        System.out.println("Digite un numero cualquiera: ");
        N1 = entrada.nextInt();
        System.out.println("Digite nuevamente otro numero: ");
        N2 = entrada.nextInt();
        System.out.println("Digite otro numero : ");
        N3 = entrada.nextInt();
        
        // Analizando la condicion cual es el numero mayor
        if((N1 > N2) && (N2 > N3)){
            System.out.println("El orden de  los numero es: " + N1 +"  "+ N2 +"  "+N3);
        }
        
        else if ((N1 > N3) && (N3 > N2)){
        System.out.println("El orden de  los numero es: " + N1 +"  "+ N3 +"  "+N2);
        }
        
        else if ((N2 > N1) && (N1 > N3)){
            System.out.println("El orden de  los numero es: " + N2 +"  "+ N1 +"  "+N3);
        }
        
        else if((N2 > N3) && (N3 > N1)){
        System.out.println("El orden de  los numero es: " + N2 +"  "+ N3 +" "+N1);
        }
        
        else if((N3 > N1) && (N1 > N2)) {
        System.out.println("El orden de  los numero es: " + N3 +"  "+ N1 +" "+N2);
        }
        else {
        System.out.println("El orden de  los numero es: " + N3 +"  "+ N2 +" "+N1);
        }
    }
    
}
