import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Pokemon> pokemons = chargerPokemonsDepuisCSV("TP_base/pokedex_gen1.csv");

        // مثال: قتال بين البوكيمون الأول والثاني
        if (pokemons.size() >= 2) {
            Pokemon p1 = pokemons.get(0);
            Pokemon p2 = pokemons.get(1);

            Combat.lancerCombat(p1, p2);
        } else {
            System.out.println("⛔ Pas assez de pokémons pour le combat.");
        }
    }

    public static List<Pokemon> chargerPokemonsDepuisCSV(String fichierCSV) {
        List<Pokemon> liste = new ArrayList<>();
        Map<String, Type> types = Type.initialiserTypes(); // حسب محتوى Type.java
        try (BufferedReader reader = new BufferedReader(new FileReader(fichierCSV))) {
            String ligne;
            reader.readLine(); // sauter l’en-tête

            while ((ligne = reader.readLine()) != null) {
                String[] champs = ligne.split(",");

                int numero = Integer.parseInt(champs[0]);
                String espece = champs[1];
                String typeNom1 = champs[2];
                String typeNom2 = champs[3].isEmpty() ? null : champs[3];
                int pv = Integer.parseInt(champs[4]);
                int att = Integer.parseInt(champs[5]);
                int def = Integer.parseInt(champs[6]);
                int vit = Integer.parseInt(champs[7]);

                Type type1 = types.get(typeNom1.toLowerCase());
                Type type2 = typeNom2 != null ? types.get(typeNom2.toLowerCase()) : null;

                Pokemon p = new Pokemon(numero, espece, espece, type1, type2, pv, att, def, vit);
                liste.add(p);
            }
        } catch (IOException e) {
            System.out.println("Erreur lors de la lecture du fichier : " + e.getMessage());
        }

        return liste;
    }
}
