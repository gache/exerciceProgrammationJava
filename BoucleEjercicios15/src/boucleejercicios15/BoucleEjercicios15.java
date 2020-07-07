package boucleejercicios15;

import javax.swing.JOptionPane;

public class BoucleEjercicios15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad, sumaEdad = 0, contaMayor18 = 0, contaMayor175 = 0;
        float altura, sumaAltura = 0, mediaAltura, mediaEdad;

        for (int i = 1; i <= 5; i++) {
            edad = Integer.parseInt(JOptionPane.showInputDialog("Alumno " + i+ " Digite su edad: "));
            altura = Float.parseFloat(JOptionPane.showInputDialog("Alumno " + i+" Digite su altura: "));

            sumaEdad += edad; // Suma iteractiva de las edades
            sumaAltura += altura; // Suma iteractiva de la Altura;

            if (edad >= 18) { // verificando la condidicion de cuantos alumnos son mayores de edad
                contaMayor18++; // agregando a mi contador el alumno que cumple la condicion de 18 años
            }
            if(altura >= 1.75) { // verificando la condidicion de cuantos alumnos tienen una altura de 1.75
            contaMayor175++; // agregando a mi contador el alumno que cumple la condicion de la altura
            }
        }
        
        mediaEdad = (float)sumaEdad /5; // sacando la media de las ededes
        mediaAltura = (float) sumaAltura /5; // sacando la media de la altura 
        
        System.out.println("la media de las edades de los alumnos es: " + mediaEdad);
        System.out.println("La media de las alturas de los alumnos es:" + mediaAltura);
        System.out.println("El numero de alumnos mayores de 18 son: " + contaMayor18);
        System.out.println("El numero de alumnos con altua de 1.75 son: " +contaMayor175);

    }

}
