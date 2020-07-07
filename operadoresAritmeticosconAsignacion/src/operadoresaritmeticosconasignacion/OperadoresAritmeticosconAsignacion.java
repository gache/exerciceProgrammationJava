/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresaritmeticosconasignacion;

/**
 *
 * @author erick
 */
public class OperadoresAritmeticosconAsignacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int numero = 15;
      // numero = numero + 5; 
      //numero += 5; Con esta abreviatura estoy empleando dos asignaciones que es operador de suma y de asignacion ya que estoy igualando la variable a la misma variable y lo puedo hacer con la resta, multiplicacion, division, y el modulo
      numero += 5; // Esto es igual a decir numero = numero + 5;
      System.out.println(numero); 
    }
    
}
