/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entradadatosconsola;

import java.util.Scanner;

/**
 *
 * @author erick
 */
public class EntradaDatosConsola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // Creation del objeto
        Scanner entrada = new Scanner(System.in); // in viene de input o entrada de datos

        //Guardar numeros
        // Declaramos la variable
        int numero;
        
        //System.out.println("Digita un numero: ");
        System.out.println("Digita una Cadena: ");
        // System.out.println("Digita un Caracter: ");
        
        // La variable numero la igualo al objeto entrada con el metodo nextInt()
        //numero = entrada.nextInt(); // nextInt() Nos permite guardar datos siempre y cuando los datos sean enteros
        
        float numero2;
        //numero2 = entrada.nextFloat();  // Con este metodo el valor que introducimos no acepta el punto, para que lo acepte hay que colocar una coma al valor introducido
        
        //System.out.println("El numero es: " + numero);
        //System.out.println("El numero es: " + numero2);
        
        double numero3;
        //numero3 = entrada.nextDouble();
        //System.out.println("El numero es: " + numero3);
        
        //Guardar Cadenas
        
        String cadena;
        cadena = entrada.next(); // con next() guarda la cadena y si encuentra un espacio no guarda ver ejemplo
        //cadena = entrada.nextLine(); //nextLine() meguarda la cadena hasta con sus espacios
        System.out.println("La Cadena es: " + cadena);
    
        //Guardar Caracter
        
        char letra;
        letra = entrada.next().charAt(0); // next() guardas una palabra hasta que encuentre un espacio y charAt(0) va a leer el primer caracter que encuntre y ese es el que va guardar.
        //System.out.println("El Caracter es: " + letra);
    }
    
}
