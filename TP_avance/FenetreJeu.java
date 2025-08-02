import MG2D.*;

public class FenetreJeu {
    public static final int TAILLE_CASE = 64;
    public static final int NB_CASES = 9;
    public static final int TAILLE_FENETRE = TAILLE_CASE * NB_CASES;

    private Fenetre f;
    private Jeu jeu;

    public FenetreJeu() {
        f = new Fenetre("Jeu Pokémon - Échecs", TAILLE_FENETRE, TAILLE_FENETRE);
        jeu = new Jeu();

        AffichagePlateau affichage = new AffichagePlateau(jeu.getPlateau());
        f.ajouter(affichage);

        f.setVisible(true);
    }

    public static void main(String[] args) {
        new FenetreJeu();
    }
}
