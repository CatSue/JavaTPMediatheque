/**
 * CDAudio : classe définisant un CD audio
 * Classe fille de Media
 * Accès aux données uniquement en lecture donc pas de set()
 *
 * @author Marie PÉTROD
 * @version 1.0
 */

public class CDAudio extends Media {

    //Auteur
    private String auteur;

    //Compositeur
    private String compositeur;

    //Nonbre de piste
    private int nbPistes;

    //********************CONSTRUCTEUR********************//
    public CDAudio(String pTitre, String pAuteur, String pCompositeur, int pNbPistes) {
        super(pTitre);
        auteur = pAuteur;
        compositeur = pCompositeur;
        nbPistes = pNbPistes;
    }

    //********************GETTEURS********************//
    public String getAuteur() {
        return auteur;
    }

    public String getCompositeur() {
        return compositeur;
    }

    public int getNbPistes() {
        return nbPistes;
    }

    //************************METHODES D'INSTANCE************************//
    @Override
    public String toString() {
        return super.toString() + ", Auteur : " + auteur + ", Compositeur : " + compositeur + ", Nombre de pistes : " + nbPistes ;
    }
}
