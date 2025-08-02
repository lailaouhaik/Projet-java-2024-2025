// Jeu.java
public class Jeu {
    private Plateau plateau;
    private int joueurActuel;

    public Jeu() {
        plateau = new Plateau();
        joueurActuel = 1;
        plateau.placerTest();
    }

    public Plateau getPlateau() {
        return plateau;
    }

    public int getJoueurActuel() {
        return joueurActuel;
    }

    public void changerTour() {
        joueurActuel = (joueurActuel == 1) ? 2 : 1;
    }
}
