 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposdevariables;

/**
 *
 * @author erick
 */
public class TiposDeVariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //  Variables que almacenan  numeros enteros
        
        byte entero; // Representa un tipo de dato de 8 bits con signo. De tal manera que puede almacenar los valores numéricos de -128 a 127
        entero = 80;
        short entero2 = 1800; //Representa un tipo de dato de 16 bits con signo. De esta manera almacena valores numéricos de -32.768 a 32.767.
        int entero3   = 15000; //Es un tipo de dato de 32 bits con signo para almacenar valores numéricos. Cuyo valor mínimo es -2,147,483,648 y el valor máximo 2,147,483,647. 
        long entero4  = 1500000; // Es un tipo de dato de 64 bits con signo que almacena valores numéricos entre -9,223,372,036,854,775,808 y el valor maximo 9,223,372,854,775,807 
        
        System.out.println("El Numero byte es: " + entero);
        System.out.println("El Numero short dos  es: " + entero2);
        System.out.println("El Numero int tres  es: " + entero3);
        System.out.println("El Numero long cuatro es: " + entero4);
        
        // Variables que almacenan  numeros reales 
        
        float reales = 1.5f; // cuando declaro la variable de tipo float debo colocar al final de la declaración la letra f indicando float
        
        double reales2 = 34.55154; //con este tipo de variable no tengo necesidad de colocar la letra f
        System.out.println("El Numero float es: " + reales);
        System.out.println("El Numero double es: " + reales2);
        
        // Varibale que almacena caracteres 
        
        char caracter = '1';
        System.out.println("El Caracter char es: " + caracter ); // para almacenar un caracter hay que utilizar comillas simples
        
        // Varibale que almacenan de tipo boolean  se usa mucho en las condicionales 
        
        boolean decision = true; // tiene dos verdadero o falso
        System.out.println("La Decision boolean es : " + decision);
    }
    
}
