public class Player {

    public void play() {
        m.knockOver(10);
    }

    public int score() {
        return m.score();
    }
    Player(String nom){
        this.nom = nom;
    }

    public String nom() {
        return nom;
    }

    String nom;
    MolkkyGame m = new MolkkyGame();
}
