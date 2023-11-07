package visitor.tehtava13;

/**
 *
 * @author tristan
 */
public class Pokemon {
    //Nimi nyt on toistaiseksi aina charmander....
    private String name = "Charmander";

    public static int stage = 1;
    private PokemonTrainer state;
    private int hp;
    private int xp;

    public Pokemon() {
        this.hp = 20;
        this.xp = 0;
        state = Charmander.getInstance();
    }

    public PokemonTrainer getState() {
        return state;
    }

    protected void setState(PokemonTrainer state) {
        this.state = state;
        stage++;
    }

    public void attack() {
        state.attack();
    }

    public void train() {
        state.train(this);
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getXp() {
        return xp;
    }

    public void setName(String name) {
        this.name = name;
    }
    

    public void setXp(int xp) {
        this.xp += xp;
    }

    protected void resetXp() {
        this.xp = 0;
    }

    public void accept(PokemonStateVisitor visitor) {
        visitor.visit(Pokemon.this);
    }

    @Override
    public String toString() {
        return this.name;
    }

}
