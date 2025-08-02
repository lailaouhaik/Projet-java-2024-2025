import java.util.HashMap;
import java.util.Map;

public class Type {
    /*************** 1G *******************/

    // Noms des espèces des pokemons dans le même ordre que le pokedex
    public static final String[] espece = { "Bulbizarre", "Herbizarre", "Florizarre", "Salamèche", "Reptincel", "Dracaufeu",
            "Carapuce", "Carabaffe", "Tortank", "Chenipan", "Chrysacier", "Papilusion", "Aspicot", "Coconfort", "Dardargnan",
            "Roucool", "Roucoups", "Roucarnage", "Rattata", "Rattatac", "Piafabec", "Rapasdepic", "Abo", "Arbok", "Pikachu",
            "Raichu", "Sabelette", "Sablaireau", "Nidoran♀", "Nidorina", "Nidoqueen", "Nidoran♂", "Nidorino", "Nidoking",
            "Mélofée", "Mélodelfe", "Goupix", "Feunard", "Rondoudou", "Grodoudou", "Nosferapti", "Nosferalto", "Mystherbe",
            "Ortide", "Rafflesia", "Paras", "Parasect", "Mimitoss", "Aéromite", "Taupiqueur", "Triopikeur", "Miaouss", "Persian",
            "Psykokwak", "Akwakwak", "Férosinge", "Colossinge", "Caninos", "Arcanin", "Ptitard", "Têtarte", "Tartard", "Abra",
            "Kadabra", "Alakazam", "Machoc", "Machopeur", "Mackogneur", "Chétiflor", "Boustiflor", "Empiflor", "Tentacool",
            "Tentacruel", "Racaillou", "Gravalanch", "Grolem", "Ponyta", "Galopa", "Ramoloss", "Flagadoss", "Magnéti",
            "Magnéton", "Canarticho", "Doduo", "Dodrio", "Otaria", "Lamantine", "Tadmorv", "Grotadmorv", "Kokiyas", "Crustabri",
            "Fantominus", "Spectrum", "Ectoplasma", "Onix", "Soporifik", "Hypnomade", "Krabby", "Krabboss", "Voltorbe",
            "Électrode", "Noeunoeuf", "Noadkoko", "Osselait", "Ossatueur", "Kicklee", "Tygnon", "Excelangue", "Smogo",
            "Smogogo", "Rhinocorne", "Rhinoféros", "Leveinard", "Saquedeneu", "Kangourex", "Hypotrempe", "Hypocéan", "Poissirène",
            "Poissoroy", "Stari", "Staross", "M. Mime", "Insécateur", "Lippoutou", "Élektek", "Magmar", "Scarabrute", "Tauros",
            "Magicarpe", "Léviator", "Lokhlass", "Métamorph", "Évoli", "Aquali", "Voltali", "Pyroli", "Porygon", "Amonita",
            "Amonistar", "Kabuto", "Kabutops", "Ptéra", "Ronflex", "Artikodin", "Électhor", "Sulfura", "Minidraco", "Draco",
            "Dracolosse", "Mewtwo", "Mew" };

    public static final String[] nomsType = { "NORMAL", "FEU", "EAU", "PLANTE", "ELECTRIK", "GLACE", "COMBAT", "POISON", "SOL",
            "VOL", "PSY", "INSECTE", "ROCHE", "SPECTRE", "DRAGON", "SANS" };

    public static final int NORMAL = 0, FEU = 1, EAU = 2, PLANTE = 3, ELECTRIK = 4, GLACE = 5,
            COMBAT = 6, POISON = 7, SOL = 8, VOL = 9, PSY = 10, INSECTE = 11, ROCHE = 12,
            SPECTRE = 13, DRAGON = 14, SANS = 15;

    public static final double NEUTRE = 1.0, INEFFICACE = 0.0, PAS_EFFICACE = 0.5, SUPER_EFFICACE = 2.0;

    private static final double[][] efficacite = {
            { NEUTRE, NEUTRE, NEUTRE, NEUTRE, NEUTRE, NEUTRE, NEUTRE, NEUTRE, NEUTRE, NEUTRE, NEUTRE, NEUTRE, PAS_EFFICACE, INEFFICACE, NEUTRE },
            { NEUTRE, PAS_EFFICACE, PAS_EFFICACE, SUPER_EFFICACE, NEUTRE, SUPER_EFFICACE, NEUTRE, NEUTRE, NEUTRE, NEUTRE, NEUTRE, SUPER_EFFICACE, PAS_EFFICACE, NEUTRE, PAS_EFFICACE },
            { NEUTRE, SUPER_EFFICACE, PAS_EFFICACE, PAS_EFFICACE, NEUTRE, NEUTRE, NEUTRE, NEUTRE, SUPER_EFFICACE, NEUTRE, NEUTRE, NEUTRE, SUPER_EFFICACE, NEUTRE, PAS_EFFICACE },
            { NEUTRE, PAS_EFFICACE, SUPER_EFFICACE, PAS_EFFICACE, NEUTRE, NEUTRE, NEUTRE, PAS_EFFICACE, SUPER_EFFICACE, PAS_EFFICACE, NEUTRE, PAS_EFFICACE, SUPER_EFFICACE, NEUTRE, PAS_EFFICACE },
            { NEUTRE, NEUTRE, SUPER_EFFICACE, PAS_EFFICACE, PAS_EFFICACE, NEUTRE, NEUTRE, NEUTRE, INEFFICACE, SUPER_EFFICACE, NEUTRE, NEUTRE, NEUTRE, NEUTRE, PAS_EFFICACE },
            { NEUTRE, NEUTRE, PAS_EFFICACE, SUPER_EFFICACE, NEUTRE, PAS_EFFICACE, NEUTRE, NEUTRE, SUPER_EFFICACE, SUPER_EFFICACE, NEUTRE, NEUTRE, NEUTRE, NEUTRE, SUPER_EFFICACE },
            { SUPER_EFFICACE, NEUTRE, NEUTRE, NEUTRE, NEUTRE, SUPER_EFFICACE, NEUTRE, PAS_EFFICACE, NEUTRE, PAS_EFFICACE, PAS_EFFICACE, PAS_EFFICACE, SUPER_EFFICACE, INEFFICACE, NEUTRE },
            { NEUTRE, NEUTRE, NEUTRE, SUPER_EFFICACE, NEUTRE, NEUTRE, NEUTRE, PAS_EFFICACE, PAS_EFFICACE, NEUTRE, NEUTRE, SUPER_EFFICACE, PAS_EFFICACE, PAS_EFFICACE, NEUTRE },
            { NEUTRE, SUPER_EFFICACE, NEUTRE, PAS_EFFICACE, SUPER_EFFICACE, NEUTRE, NEUTRE, SUPER_EFFICACE, NEUTRE, INEFFICACE, NEUTRE, PAS_EFFICACE, SUPER_EFFICACE, NEUTRE, NEUTRE },
            { NEUTRE, NEUTRE, NEUTRE, SUPER_EFFICACE, PAS_EFFICACE, NEUTRE, SUPER_EFFICACE, NEUTRE, NEUTRE, NEUTRE, NEUTRE, SUPER_EFFICACE, PAS_EFFICACE, NEUTRE, NEUTRE },
            { NEUTRE, NEUTRE, NEUTRE, NEUTRE, NEUTRE, NEUTRE, SUPER_EFFICACE, SUPER_EFFICACE, NEUTRE, NEUTRE, PAS_EFFICACE, NEUTRE, NEUTRE, NEUTRE, NEUTRE },
            { NEUTRE, PAS_EFFICACE, NEUTRE, SUPER_EFFICACE, NEUTRE, NEUTRE, PAS_EFFICACE, SUPER_EFFICACE, NEUTRE, PAS_EFFICACE, SUPER_EFFICACE, NEUTRE, NEUTRE, PAS_EFFICACE, NEUTRE },
            { NEUTRE, SUPER_EFFICACE, NEUTRE, NEUTRE, NEUTRE, SUPER_EFFICACE, PAS_EFFICACE, NEUTRE, PAS_EFFICACE, SUPER_EFFICACE, NEUTRE, SUPER_EFFICACE, NEUTRE, NEUTRE, NEUTRE },
            { INEFFICACE, NEUTRE, NEUTRE, NEUTRE, NEUTRE, NEUTRE, NEUTRE, NEUTRE, NEUTRE, NEUTRE, INEFFICACE, NEUTRE, NEUTRE, SUPER_EFFICACE, NEUTRE },
            { NEUTRE, NEUTRE, NEUTRE, NEUTRE, NEUTRE, NEUTRE, NEUTRE, NEUTRE, NEUTRE, NEUTRE, NEUTRE, NEUTRE, NEUTRE, NEUTRE, SUPER_EFFICACE }
    };

    private String nom;

    public Type(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public static String getEspece(int numPokedex) {
        if (numPokedex >= 1 && numPokedex <= espece.length) {
            return espece[numPokedex - 1];
        } else {
            return "Inconnu";
        }
    }

    public static String getNomType(int type) {
        if (type >= 0 && type < nomsType.length) {
            return nomsType[type].toLowerCase();
        } else {
            return "sans";
        }
    }

    public static double getEfficacite(int typeAtt, int typeDef) {
        if (typeAtt < efficacite.length && typeDef < efficacite[typeAtt].length) {
            return efficacite[typeAtt][typeDef];
        } else {
            return NEUTRE;
        }
    }

    public static int getIndiceType(String type) {
        for (int i = 0; i < nomsType.length; i++) {
            if (nomsType[i].equalsIgnoreCase(type)) {
                return i;
            }
        }
        return SANS;
    }

    public static Map<String, Type> initialiserTypes() {
        Map<String, Type> types = new HashMap<>();
        for (String nom : nomsType) {
            types.put(nom.toLowerCase(), new Type(nom));
        }
        return types;
    }

    @Override
    public String toString() {
        return nom;
    }
}
