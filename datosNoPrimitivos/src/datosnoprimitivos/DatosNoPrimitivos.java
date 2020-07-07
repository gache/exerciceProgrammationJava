/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datosnoprimitivos;

/**
 *
 * @author erick
 */
public class DatosNoPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Integer  permite almacenar datos enteros y null.
        // yo no puedo colocar null en un dato de tipo primitivo nos sale error
        // los datos no primitivos nos permiten de utilizar metodos, cosa que no tiene los tipos de datos primitivos
        
        Integer valor = 10;
        Integer valor2 = null;
        
        
        // las cadenas o string
        //en las cadenas tambien podemos utlizar los metodos ya que es una variable no primitivos.
        
        String palabra = "Hola a todos";
        // En las cadenas se usan la comillas dobles, las comillas simples son para las variables de tipo caracter
        
        System.out.println("El valor de la variable es: " + valor);
        System.out.println("El valor de la variable es: " + valor2);
        System.out.println(palabra);
    }
    
}
