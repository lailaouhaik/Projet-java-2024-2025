// Plateau.java
public class Plateau {
    private final int TAILLE = 9;
    private Case[][] grille;

    public Plateau() {
        grille = new Case[TAILLE][TAILLE];
        for (int i = 0; i < TAILLE; i++) {
            for (int j = 0; j < TAILLE; j++) {
                grille[i][j] = new Case();
            }
        }
    }

    public Case getCase(int x, int y) {
        return grille[x][y];
    }

    public void placerTest() {
        Pokemon p1 = new Pokemon(150, "Mewtwo", "Mewtwo", new Type("Psy"), null, 100, 90, 90, 100);
        Pokemon p2 = new Pokemon(150, "Mewtwo", "Mewtwo", new Type("Psy"), null, 100, 90, 90, 100);
        grille[0][4].placerPokemon(p1, 1);
        grille[8][4].placerPokemon(p2, 2);
    }
}
