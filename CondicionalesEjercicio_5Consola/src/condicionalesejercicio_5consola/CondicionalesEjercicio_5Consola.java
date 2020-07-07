/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionalesejercicio_5consola;

import java.util.Scanner;

/**
 *
 * @author erick
 */
public class CondicionalesEjercicio_5Consola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);
     
     int nHorasTrabajadas;
     float salarioTotal;
     
        System.out.println("Digite el numero de hotas trabajadas en la semana");
        
        // Solito el numero de horas trabajadas
        nHorasTrabajadas = entrada.nextInt();
        
        //Evaluo la condiciones de cuanto es el salario total del obrero
        if(nHorasTrabajadas <= 40) {
            salarioTotal = nHorasTrabajadas * 16;
        }else {
        salarioTotal = (40*16) + ((nHorasTrabajadas - 40)* 20);
        }
        System.out.println("El salario semanal del Obrero es de: " + salarioTotal );
    }
    
}
