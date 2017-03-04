/**
 * Media : classe définisant un média
 * Accès aux données uniquement en lecture donc pas de set()
 *
 * @author Marie PÉTROD
 * @version 1.0
 */

public class Media {

    //titre du média
    protected String titre;

    //variable de classe : n° enr
    protected static int numEnr = 0;


    //********************CONSTRUCTEUR********************//
    public Media(String pTitre) {
        numEnr++;
        titre = pTitre;
    }

    //********************GETTEURS********************//
    public  int  getNumEnr() {
        return numEnr;
    }

    public String getTitre() {
        return titre;
    }

    //************************METHODES D'INSTANCE************************//
    @Override
    public String toString() {
        return  "Media : numero " + numEnr + ", Titre : " + titre;
    }
}
