
package arraycompletadousuario;

import java.util.Scanner;


public class ArrayCompletadoUsuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int nNombres; // inicializacion de la variable
        
        
        Scanner entrada = new Scanner(System.in); // instanciacion del objeto scanner
        Scanner entrada2 = new Scanner(System.in);
       
        System.out.println("Digite la cantidad  quiere el array");  // Solicitando al usuario la cantidad de elementos del array
        nNombres = entrada.nextInt(); //  guardando la cantidad de elementos digitados en la variable nNombres
        
        // Creacion del Array y dentro de los corchetes coloco la variable nNombre que contiene el numeros de elemetos a crear
        // digitados por el usuario
        String [] nombres = new String[nNombres]; 

       
        // Solicitando los elementos del array por medio de un boucle for
        
        System.out.println("Digite los elementos del arreglos");  
        
        for(int i = 0; i < nNombres; i++){
            System.out.println(( i +1 )+ " Digite un nombre: "); 
            // Solicitando digitar los nombres del array 
            // A mi iterador le sumo uno para que el usuario sepa el valor exacto que ha digitado y no me contabilice el cero 
            
            nombres [i] = entrada2.next();
            // guardo los nombres digitados por el usuario dentro de mi array nombres
            // dentro de los [] colocamos el iterador, para guardar cada nombre que el usiario a digitado en un indice diferente;
        }
        
        // Mostrando mi array con los nombres digitados por el usuario
        System.out.println("Los nombres del Array son: ");
        for(int i = 0; i < nNombres; i++){
            System.out.println(nombres[i]);
        }
        
        
        
        
        
       
    }
    
}
