/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresdeincrementodecremento;

/**
 *
 * @author erick
 */
public class OperadoresdeIncrementoDecremento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int x = 10;
       // El operado de incremento es ++  con este operado incremeto a mi variable en un valor
       x++;// Esto equivale x = x + 1; o x +=1;
       
       // El operado de decremento es --  con este operado le resto a mi variable en un valor
       x--; // Esto equivale x = x - 1; o x -=1; 
       System.out.println();
       
       //En que puede variar los valores de incremento o decremento al momento de la asignacion
       
       int p = 5, y;
       y = p++; // a Y le estamos asignando del valor de P y despues de esa asignacion a Y, a P la estamos incremento de un valor. Esto pasa por que el valor del incremento lo estamos colocando despues
       //y = p++;  en este caso asigna y despues incrementa
       y = ++p; // En este caso Incrementamos el valor de P en uno y despues se lo asignamos a Y
       // y = ++p en este caso incrementa y despues asigna
       System.out.println(y);
       System.out.println(p);
    }
    
}
