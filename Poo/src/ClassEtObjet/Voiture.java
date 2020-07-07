
package ClassEtObjet;

/**
 *
 * @author erick
 */
public class Voiture {
    // Atributs de ma class
    
    String marque;
    String couleur;
    int km;
    
    // methode main de ma class 
    
    public static void main (String [] arg){
        // Nouvelle instance de ma class
        Voiture voiture1 = new Voiture();
        
        voiture1.marque = "Peugeot 308";
        voiture1.couleur = "Bleu";
        voiture1.km = 30000;
        
        System.out.println("La marque de la voiture 1 est " + voiture1.marque);
        System.out.println("La couleur de la voiture 1 est " + voiture1.couleur);
        System.out.println("Le nombre de kilomètre de la voiture 1 est de " + voiture1.km + "km");
    }
}
