/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_7caculosemanadias;

import java.util.Scanner;

/**
 *
 * @author erick
 */
public class Ejercicio_7CaculoSemanaDias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entradaDatos = new Scanner(System.in);
       int totalHoras, semanas , dias, horas;
       
        System.out.print("Digite un numero de horas ");
        totalHoras = entradaDatos.nextInt();
        
        semanas = (totalHoras/ 168);
        dias = (totalHoras%168 / 24);
        horas = (totalHoras% 24);
        
        System.out.println("El numero total de horas es " + totalHoras);
        System.out.println("El numero total de semanas que han transcurrido es " + semanas);
        System.out.println("El numero total de dias que han transcurrido es " + dias);
        System.out.println("El numero total de horas que han transcurrido es " + horas);
    }
    
}
