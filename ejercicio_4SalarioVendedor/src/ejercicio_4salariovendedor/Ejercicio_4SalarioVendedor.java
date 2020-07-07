/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_4salariovendedor;

import java.util.Scanner;

/**
 *
 * @author erick
 */
public class Ejercicio_4SalarioVendedor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entradadatos = new Scanner(System.in);
       
       final int salarioFijo = 1000;
       int carrosVendidosMes;
       float costoCarrro, totalSalarioMes;
       // Guardo la informacion del numero de carros vendido
        System.out.println("Digite el numero de carros vendidos al mes");
        carrosVendidosMes = entradadatos.nextInt();
        // guardando la informacion del valor del carro
        System.out.println("Digite el costo del carro");
        costoCarrro = entradadatos.nextFloat();
       
        totalSalarioMes = salarioFijo+ (carrosVendidosMes*150) + (0.05f* costoCarrro*carrosVendidosMes);
        System.out.println("El salario del vendedor al mes es de: " + totalSalarioMes );
    }
    
}
