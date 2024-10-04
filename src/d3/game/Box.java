package d3.game;

public class Box implements Damageable {
    private int integrity = 5;

    public int getIntegrity() { return integrity; }
    public void setIntegrity(int integrity) { this.integrity = integrity; }

    public int getHp() { return integrity; }
    public void dmg(int dmg) { 
        this.integrity -= dmg; 
    }

    @Override
    public String toString() {
        return "Box(HP: %d)".formatted(this.integrity);
    }
}
