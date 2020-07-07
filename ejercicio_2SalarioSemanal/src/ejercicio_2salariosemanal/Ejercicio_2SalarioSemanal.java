/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_2salariosemanal;

import java.util.Scanner;

/**
 *
 * @author erick
 */
public class Ejercicio_2SalarioSemanal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner salarioSemanal = new Scanner(System.in);
        
        int horasTrabajoSemanal;
        float salarioHora;
        
        System.out.println("Digite las horas  semanales trabajadas ");
        horasTrabajoSemanal = salarioSemanal.nextInt();
        
        System.out.println("Digite el salario que gana por hora ");
        salarioHora = salarioSemanal.nextFloat();
        
        float totalSalario = horasTrabajoSemanal *  salarioHora;
        
        System.out.println("\n El salario semanal es: " + totalSalario);
        
        
    }
    
}
