package d3.game;

public class Monster implements Damageable {
    private String name;
    private int hp;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public int getHp() { return hp; }
    public void setHp(int hp) { this.hp = hp; }

    public void dmg(int dmg) {
        this.hp -= dmg;
    }

    @Override
    public String toString() {
        return "Monster(Name: %s, HP: %d)".formatted(this.name, this.hp);
    }
}
