/**
 * Main : classe principale.
 *
 * @author Marie PÉTROD
 * @version 1.0
 */

public class Main {

    public static void main(String[] args) {

        //création d'un livre
        //Livre livre = new Livre("Programmer en Java", "Claude Delannoy", 916);

        //Création d'une encycolpédie
        //Encyclopedie encyclopedie = new Encyclopedie("Encyclopedie universelle", "Laurousse", 250, "Français", 16);

        //Création d'un DVD
        //DVDVideo dvd = new DVDVideo("Le monde de Nemo", "Français", 96 );

        //Création d'un CD
        //CDAudio cd = new CDAudio("Rester vivant", "Johnny Hallyday", "Inconnu", 26 );

        //création d'un média
        //Media media = new Media("Media de test");
        //TODO : voir pour l'affichage du n° de média
        GestionDeMedias gestion = new GestionDeMedias();

        //ajout des médias à la liste
        //Livre livre = new Livre("Programmer en Java", "Claude Delannoy", 916);
        gestion.ajouterMedia(new Livre("Programmer en Java", "Claude Delannoy", 916));
        gestion.ajouterMedia(new Encyclopedie("Encyclopedie universelle", "Laurousse", 250, "Français", 16));
        //gestion.ajouterMedia(dvd);
        //gestion.ajouterMedia(cd);

        //affichage des médias
        //gestion.afficherLesMedias();

        //affichage des auteurs
        gestion.afficherLesAuteurs();

        //affichage des langues
        gestion.afficherLesLangues();
    }
}
