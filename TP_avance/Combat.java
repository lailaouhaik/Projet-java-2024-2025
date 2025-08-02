public class Combat {

    public static void lancerCombat(Pokemon p1, Pokemon p2) {
        System.out.println("🔔 Début du combat entre " + p1.getNom() + " et " + p2.getNom());

        Pokemon attaquant, defenseur;

        if (p1.getVit() >= p2.getVit()) {
            attaquant = p1;
            defenseur = p2;
        } else {
            attaquant = p2;
            defenseur = p1;
        }

        while (p1.getPv() > 0 && p2.getPv() > 0) {
            int degats = Math.max(0, attaquant.getAtt() - defenseur.getDef());
            int pvRestants = defenseur.getPv() - degats;
            defenseur.setPv(Math.max(0, pvRestants));

            System.out.println(attaquant.getNom() + " attaque ! " +
                               defenseur.getNom() + " perd " + degats + " PV. " +
                               "PV restants : " + defenseur.getPv());

            // échange الأدوار
            Pokemon temp = attaquant;
            attaquant = defenseur;
            defenseur = temp;
        }

        Pokemon gagnant = (p1.getPv() > 0) ? p1 : p2;
        System.out.println("🏆 Le vainqueur est " + gagnant.getNom());
    }
}
