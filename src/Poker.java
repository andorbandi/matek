import java.util.Random;

public class Poker {
    public static void play() {
        throwDice("Gép");
        throwDice("Ember");
    }

    private static void throwDice(String role) {
        Random random = new Random();
        int szam1 = random.nextInt(6) + 1;
        int szam2 = random.nextInt(6) + 1;
        int szam3 = random.nextInt(6) + 1;
        int szam4 = random.nextInt(6) + 1;
        int szam5 = random.nextInt(6) + 1;
        System.out.printf(
            "%6s: %d %d %d %d %d\n",
            role,
            szam1, szam2, szam3, szam4, szam5
        );
    }
}
