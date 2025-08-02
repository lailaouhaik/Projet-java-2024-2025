// Case.java
public class Case {
    private Pokemon pokemon;
    private int joueur; // 0: vide, 1 ou 2 pour les joueurs

    public Case() {
        this.pokemon = null;
        this.joueur = 0;
    }

    public boolean estVide() {
        return pokemon == null;
    }

    public void placerPokemon(Pokemon p, int joueur) {
        this.pokemon = p;
        this.joueur = joueur;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public int getJoueur() {
        return joueur;
    }

    public void vider() {
        this.pokemon = null;
        this.joueur = 0;
    }
}
