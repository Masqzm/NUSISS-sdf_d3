package game;

public class Godzilla extends Monster {
    public Godzilla() {
        setName("Godzilla");
        setHp(1000);
    }

    @Override
    public void dmg(int dmg) {
        setHp(getHp() - dmg + 1);   // additional +1 defense
    }
}
