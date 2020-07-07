/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionalesejercicio_3consola;

import java.util.Scanner;

/**
 *
 * @author erick
 */
public class CondicionalesEjercicio_3Consola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char teclar;
        
        // Solicitando al usuario que digite un caracter y guardo en la variable teclar
        System.out.println("Digite un caracter: ");
        teclar = entrada.next().charAt(0);
        
        // Evaluando la condicion si la letra es mayuscula o miniscula
        if(Character.isUpperCase(teclar)){
            System.out.println("La letra " + teclar + " es mayuscula");
        }else{
            System.out.println("La letra " + teclar + " es minuscula");
        }
    }
    
}
