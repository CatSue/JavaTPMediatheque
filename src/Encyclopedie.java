/**
 * Encyclopedie : classe définisant une encyclopédie
 * Classe fille de Livre
 * Accès aux données uniquement en lecture donc pas de set()
 *
 * @author Marie PÉTROD
 * @version 1.0
 */

public class Encyclopedie extends Livre{

    //Langue
    private String langue;

    //Nonbre de tomes
    private int nbTomes;

    //********************CONSTRUCTEUR********************//
    public Encyclopedie(String pTitre, String pAuteur, int pNbPages, String pLangue, int pNbTomes) {
        super(pTitre, pAuteur, pNbPages);
        langue = pLangue;
        nbTomes = pNbTomes;
    }

    //********************GETTEURS********************//
    public String getLangue() {
        return langue;
    }

    public int getNbTomes() {
        return nbTomes;
    }

    //************************METHODES D'INSTANCE************************//
    @Override
    public String toString() {
        return super.toString() + ", Langue : " + langue + ", Nombre de tomes : " + nbTomes;
    }
}
