package d3.game;

public class Player {
    // public void hit(Monster m) {
    //     m.dmg(5);
    // }
    // public void hit(Box b) {
    //     b.dmg(5);
    // }
    public void hit(Damageable d) {
        d.dmg(5);
    }
}
