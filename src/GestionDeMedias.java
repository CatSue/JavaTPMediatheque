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
    //TODO : utilisation de toString ?
    public void afficherLesAuteurs(){
        for(Media media : listeMedias){
            System.out.print("Media : numero " + media.getNumEnr());

            if(media instanceof Livre){
                System.out.println(", Auteur : " + ((Livre) media).getAuteur());
            }
            else if(media instanceof CDAudio){
                System.out.println(", Auteur : " + ((CDAudio) media).getAuteur());
            }
            else {
                System.out.println(", Pas d'auteur specifie");
            }
        }
    }

    /**
     * Objectif : afficher les langues et le numéro de tous les médias
     * pour les encyclopédies et les DVDVidéo
     */
    //TODO : utilisation de toString ?
    public void afficherLesLangues(){
        for(Media media : listeMedias) {
            System.out.print("Media : numero " + media.getNumEnr());

            if(media instanceof Encyclopedie){
                System.out.println(", Langue: " + ((Encyclopedie) media).getLangue());
            }
            else if(media instanceof DVDVideo){
                System.out.println(", Langue: " + ((DVDVideo) media).getLangue());
            }
            else {
                System.out.println(", Pas de langue specifiee");
            }
        }
    }

}
