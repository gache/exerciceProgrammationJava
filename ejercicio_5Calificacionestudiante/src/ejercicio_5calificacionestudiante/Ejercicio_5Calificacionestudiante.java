/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_5calificacionestudiante;

import java.util.Scanner;

/**
 *
 * @author erick
 */
public class Ejercicio_5Calificacionestudiante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner entradadatos = new Scanner(System.in);
      float participacion, examen1, examen2, examenFinal, notaFinal;
      
      //Solisitando la nota de participacion
      System.out.print("Digite la nota de participacion: ");
      participacion =  entradadatos.nextFloat();
      
      //Solisitando la nota del examen numero 1
      System.out.print("Digite la nota del examen numero 1: ");
      examen1 =  entradadatos.nextFloat();
      
      //Solisitando la nota del examen numero 2
      System.out.print("Digite la nota del examen numero 2: ");
      examen2 =  entradadatos.nextFloat();
      
      //Solisitando la nota del examen del examen final
      System.out.print("Digite la nota del examen final: ");
      examenFinal =  entradadatos.nextFloat();
      
     // Sacando los calculos de cada nota
     notaFinal = (participacion*0.10f) +(examen1*0.25f) + (examen2*0.25f) + (examenFinal*0.40f);
    
     // Imprimiendo la nota final
     System.out.println("La nota final del estudiante es: " + notaFinal);
        
        
     // Otra forma de hacer el calculo de las notas
     /*
     participacion *= 0.10f;
     examen1 *= 0.25f;
     examen2 *= 0.25f;
     examenFinal *= 0.40f;
     
    // Imprimir la nota final en consola 
    notaFinal = participacion + examen1 + examen2 + examenFinal;
     
   
     */
     
    }
    
}
