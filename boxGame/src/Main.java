public class Main {
    public static void main(String[] args) {

        Boxer b1 = new Boxer("Axe", 10, 120, 100, 70);
        Boxer b2 = new Boxer("Barbarian", 20, 85, 85, 40);

        Game match = new Game(b1, b2, 85, 100);
        match.execute();
    }


}