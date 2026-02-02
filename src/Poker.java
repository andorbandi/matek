import java.util.Random;

public class Poker {
    public static void play() {
        machineThrow();
        humanThrow();
        // System.out.println("Kocka dobások: " + szam1 + " " + szam2 + " " + szam3 + " " + szam4 + " " + szam5);
    }

    public static void machineThrow() {
        Random random = new Random();
        int szam1 = random.nextInt(6) + 1;
        int szam2 = random.nextInt(6) + 1;
        int szam3 = random.nextInt(6) + 1;
        int szam4 = random.nextInt(6) + 1;
        int szam5 = random.nextInt(6) + 1;
        System.out.printf(
            "%6s: %d %d %d %d %d\n",
            "Gép",
            szam1, szam2, szam3, szam4, szam5
        );
    }

    public static void humanThrow() {
        Random random = new Random();
        int szam1 = random.nextInt(6) + 1;
        int szam2 = random.nextInt(6) + 1;
        int szam3 = random.nextInt(6) + 1;
        int szam4 = random.nextInt(6) + 1;
        int szam5 = random.nextInt(6) + 1;
        System.out.printf(
            "%6s: %d %d %d %d %d\n",
            "Ember", 
            szam1, szam2, szam3, szam4, szam5
        );
    }
}
