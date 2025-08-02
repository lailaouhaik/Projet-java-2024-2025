public class Pokemon {
    private int numero;
    private String espece;
    private String nom;
    private Type type1;
    private Type type2;
    private int pv;
    private int att;
    private int def;
    private int vit;

    public Pokemon(int numero, String espece, String nom, Type type1, Type type2,
                   int pv, int att, int def, int vit) {
        this.numero = numero;
        this.espece = espece;
        this.nom = nom;
        this.type1 = type1;
        this.type2 = type2;
        this.pv = pv;
        this.att = att;
        this.def = def;
        this.vit = vit;
    }

    // Getters
    public int getNumero() { return numero; }
    public String getEspece() { return espece; }
    public String getNom() { return nom; }
    public Type getType1() { return type1; }
    public Type getType2() { return type2; }
    public int getPv() { return pv; }
    public int getAtt() { return att; }
    public int getDef() { return def; }
    public int getVit() { return vit; }

    // Setters
    public void setNom(String nom) { this.nom = nom; }
    public void setPv(int pv) { this.pv = pv; }

    @Override
    public String toString() {
        return "Pokemon #" + numero + " (" + espece + ")"
                + "\nNom: " + nom
                + "\nType 1: " + type1.getNom()
                + "\nType 2: " + (type2 != null ? type2.getNom() : "Aucun")
                + "\nPV: " + pv + ", Attaque: " + att + ", Défense: " + def + ", Vitesse: " + vit;
    }
}
