package game;

public class Main {
    public static void main(String[] args) {
        Player link = new Player();

        Monster m = new Monster();
        m.setHp(10);
        m.setName("Slime");

        System.out.println(m);
        link.hit(m);
        System.out.println(m);
        
        System.out.println("------------------");

        Godzilla g = new Godzilla();

        System.out.println(g);
        link.hit(g);
        System.out.println(g);
        
        System.out.println("------------------");

        Box b = new Box();

        System.out.println(b);
        link.hit(b);
        System.out.println(b);


    }
}
