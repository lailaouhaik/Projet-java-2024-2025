import MG2D.geometrie.*;
import java.awt.Color;

public class AffichagePlateau extends Dessin {
    private Plateau plateau;

    public AffichagePlateau(Plateau p) {
        this.plateau = p;
        this.setPreferredSize(new java.awt.Dimension(FenetreJeu.TAILLE_FENETRE, FenetreJeu.TAILLE_FENETRE));
        repaint();
    }

    public void paintComponent(java.awt.Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                Point coin = new Point(i * FenetreJeu.TAILLE_CASE, j * FenetreJeu.TAILLE_CASE);
                Rectangle r = new Rectangle(coin, FenetreJeu.TAILLE_CASE, FenetreJeu.TAILLE_CASE);
                r.setRemplissage(true);
                r.setCouleur((i + j) % 2 == 0 ? new Couleur(200, 200, 200) : new Couleur(100, 100, 100));
                r.dessiner(g);

                Case c = plateau.getCase(i, j);
                if (!c.estVide()) {
                    g.setColor(c.getJoueur() == 1 ? Color.RED : Color.BLUE);
                    g.drawString(c.getPokemon().getNom().substring(0, 1), i * FenetreJeu.TAILLE_CASE + 24, j * FenetreJeu.TAILLE_CASE + 40);
                }
            }
        }
    }
}
