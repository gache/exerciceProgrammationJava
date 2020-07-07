
package Arguments;


public class OperationAvecArgument {
    // creation mes atribut
    int suma;
    int resta;
    int multiplication;
    int division;
    
    // creation des methodes
    
    // Methode de suma
    public void suma(int numero1, int numero2){
        suma = numero1 + numero2;
    }
    
    // Methode de resta
    public void resta(int numero1, int numero2){
        resta = numero1 - numero2;
    }
    
    // Methode de multiplicacion
    public void multiplication(int numero1, int numero2){
        multiplication = numero1 * numero2;
    }
    
    // Methode de division
    public void division(int numero1, int numero2){
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
