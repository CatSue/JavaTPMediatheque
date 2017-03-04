import java.util.ArrayList;
import java.util.List;

/**
 * GestionDeMedias : classe permettant de gérer les médias
 *
 * @author Marie PÉTROD
 * @version 1.0
 */

public class GestionDeMedias {

    //Liste de médias
    List<Media> listeMedias = new ArrayList<Media>();

    //************************METHODES D'INSTANCE************************//
    /**
     * Objectif : ajouter un média à la liste
     *
     * @param : objet Media
     */
    public void ajouterMedia(Media media){
        listeMedias.add(media);
    }

    //************************METHODES D'INSTANCE************************//
    /**
     * Objectif : afficher la description de tous les médias
     *
     */
    public void afficherLesMedias(){
      for(Media media : listeMedias){
          System.out.println(media.toString());
        }
    }

    /**
     * Objectif : afficher les auteurs et le numéro de tous les médias
     */
    //TODO : utilisation pour les médias possédant un auteur uniquement ?
    public void afficherLesAuteurs(){
        for(Media media : listeMedias){
            System.out.println("Media : numero " + media.getNumEnr());

            if(media instanceof Livre){
                System.out.println("Auteur : " + ((Livre) media).getAuteur());
            }
            if(media instanceof CDAudio){
                System.out.println("Auteur : " + ((CDAudio) media).getAuteur());
            }
            if(media instanceof DVDVideo) {
                System.out.println("Pas d'auteur specifie");
            }
        }
    }

    /**
     * Objectif : afficher les langues et le numéro de tous les médias
     */
    //TODO : coder la méthode
    public void afficherLesLangues(){
        //return "test";
    }

}
