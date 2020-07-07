/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1sumanotas;

import java.util.Scanner;

/**
 *
 * @author erick
 */
public class Ejercicio1SumaNotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner dameNotas = new Scanner(System.in);
     
     float nota1, nota2, nota3;
     
     // Guardamos las tres notas
        System.out.println("Digita las tres notas");
        nota1 = dameNotas.nextFloat();
        nota2 = dameNotas.nextFloat();
        nota3 = dameNotas.nextFloat();
        
        // La suma de las tres notas en la variable resultado
        float resultado = nota1 + nota2 + nota3;
        System.out.println( "\nLa suma de las tres notas es : " + resultado);
    }
    
}
