
package Constructor;

public class Persona {
    
    // creation mes atribut
    
    String nombre;
    int edad;
    
   // creation du methode constructor
    
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    public void verResultado() {
        
        System.out.println("El nombre de la persona es: " + nombre);
        System.out.println("la edad de la persona es: " + edad);
    
    }
}
