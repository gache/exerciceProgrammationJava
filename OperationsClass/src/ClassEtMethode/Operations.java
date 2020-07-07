
package ClassEtMethode;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Operations {
    
    // creation mes atribut
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplication;
    int division;
    
    // creation des methodes
    
    public void pedirNumeros(){
        Scanner datos = new Scanner(System.in);
        
        System.out.println("Digite un numero");
        numero1 = datos.nextInt();
        
        System.out.println("Digite un dexième numero");
        numero2 = datos.nextInt(); 
    }
    // Methode de suma
    public void suma(){
        suma = numero1 + numero2;
    }
    
    // Methode de resta
    public void resta(){
        resta = numero1 - numero2;
    }
    
    // Methode de multiplicacion
    public void multiplication(){
        multiplication = numero1 * numero2;
    }
    
    // Methode de division
    public void division(){
        division = numero1 / numero2;
    }
    
    // Methode de para ver los relsultados de las operaciones
    public void verResultado(){
        System.out.println("El resltado de la suma es: " + suma);
        System.out.println("El resltado de la resta es: " + resta);
        System.out.println("El resltado de la multiplication es: " + multiplication);
        System.out.println("El resltado de la division es: " + division);
    }
    
}
