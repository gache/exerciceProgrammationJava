package boucleejercicio22;

import javax.swing.JOptionPane;

public class BoucleEjercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float nota;
        boolean reprobado = false;

        for (int i = 1; i <= 5; i++) {
            do {
                nota = Float.parseFloat(JOptionPane.showInputDialog("Digite un numero entre 0 - 10: "));
            } while (nota < 0 || nota > 10); // Verificando que la calificacion este entre el rango de 0 a 10

            if (nota < 5) {
                reprobado = true;
            }
        }
        if (reprobado == true) {
            System.out.println("si exite un alumno que reprobo el año");
        } else {
            System.out.println("Felicitaciones todos los alumnos ganaron el año");
        }
    }

}
