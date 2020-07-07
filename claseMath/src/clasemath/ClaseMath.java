/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasemath;

/**
 *
 * @author erick
 */
public class ClaseMath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Sacar la raiz cuadrada de un numero
        
       double raiz = Math.sqrt(45.36);
       
    // sqrt() para sacar la raiz cuadrada 
    // cuando coloco este metodo me aparecen los parentesis dentro de estos debos indicar el numero que al que le voy hacer la conversion
    // sqrt de la clase Math funciona con double y me retorna un valor de tipo double
      

    // Tranformar una variable double en int con el metodo sqrt
      
     int raiz2 = (int)Math.sqrt(150);
    // colocando int entre parentesis delante de la clase Math y con esto tranformamos el valor double en un valor int.
    // se recomienda dejarlo en double
      
     
     //Elevar un numero a sa potencia pow
     
     double base = 4, exponente =3;
     double resultado = Math.pow(base, exponente);     
     // pow() es la funcion para elevar un numero  
     //Cuando coloco esta funcio me aparecen unos parentesis y me indica que el numero que quiero elevar debe ser double, 
     //la potencia que quiero elevar tiene que se double y el resultado es double
    
    
    // EL metodo del redondeo round
     
     double numero = 155.52;
     long resultado2 = Math.round(numero);
     
     float numero3 = 15.52f;
     int resultado3 = Math.round(numero3);
     
     // round me dice que si yo quiero cambiar o pasar un double y quiero redondearlo me dice que lo debo guardar el resultado dentro de un long 
     // y si yo quiero pasar un float y quiero redondearlo me dice que lo debo guardar el resultado dentro de un int
     
     
     // Metodo Randon:  podemos obtener un numero aleatorio
     
      double aleatorio = Math.random(); // Randon me va entregar un valor de tipo double
      
    System.out.println(raiz);
    System.out.println(raiz2);
    System.out.println(base);
    System.out.println(resultado);
    System.out.println(resultado2);
    System.out.println(resultado3);
    System.out.println(aleatorio);
     
    }
    
}
