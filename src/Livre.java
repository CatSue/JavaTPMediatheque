/**
 * Livre : classe définisant un livre
 * Classe fille de Media
 * Accès aux données uniquement en lecture donc pas de set()
 *
 * @author Marie PÉTROD
 * @version 1.0
 */

public class Livre extends Media {

    //Auteur
    private String auteur;

    //Nonbre de pages
    private int nbPages;

    //********************CONSTRUCTEUR********************//
    public Livre(String pTitre, String pAuteur, int pNbPages) {
        super(pTitre);
        auteur = pAuteur;
        nbPages = pNbPages;
    }

    //********************GETTEURS********************//
    public String getAuteur() {
        return auteur;
    }

    public int getNbPages() {
        return nbPages;
    }

    //************************METHODES D'INSTANCE************************//
    @Override
    public String toString() {
        return super.toString() + ", Auteur : " + auteur + ", Nombre de pages : " + nbPages;
    }
}
