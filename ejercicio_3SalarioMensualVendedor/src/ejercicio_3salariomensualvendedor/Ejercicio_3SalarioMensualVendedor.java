/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

Salario mensual 1000
comision de 150 por cada carro vendido 
+ 5% del valor de la venta por carro

 */
package ejercicio_3salariomensualvendedor;

import java.util.Scanner;

/**
 *
 * @author erick
 */
public class Ejercicio_3SalarioMensualVendedor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entradaDatos = new Scanner(System.in);
        
        final int salarioMensualFijo = 1000;
        int nCarrosVendidos;
        float costecarro, salarioTotal;
        
        System.out.println("Digite cuantos carros a vendido en el mes");
        nCarrosVendidos =  entradaDatos.nextInt();
        
        System.out.println("Digite el costo del carros ");
        costecarro = entradaDatos.nextFloat();
        salarioTotal = salarioMensualFijo + (nCarrosVendidos*150) + (0.05f*costecarro*nCarrosVendidos);
        
        System.out.println("\nEl salario total del empleado al mes es de: " + salarioTotal );
    }
    
}
