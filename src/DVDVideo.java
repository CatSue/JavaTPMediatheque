/**
 * DVDVideo : classe définisant un DVD
 * Classe fille de Media
 * Accès aux données uniquement en lecture donc pas de set()
 *
 * @author Marie PÉTROD
 * @version 1.0
 */

public class DVDVideo extends Media {

    //Langue
    private String langue;

    //Durée
    private int duree;

    //********************CONSTRUCTEUR********************//
    public DVDVideo(String pTitre, String pLangue, int pDuree) {
        super(pTitre);
        langue = pLangue;
        duree = pDuree;
    }

    //********************GETTEURS********************//
    public String getLangue() {
        return langue;
    }

    public int getDurée() {
        return duree;
    }

    //************************METHODES D'INSTANCE************************//
    @Override
    public String toString() {
        return super.toString() + ", Langue : " + langue + ", Duree : " + duree + " minutes";
    }
}


