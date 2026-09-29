import java.util.Scanner;

public class Taskw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        long bestCost = Long.MAX_VALUE;
        long bestA = 0, bestB = 0, bestC = 0;

        for (long a = 0; a <= 9; a++) {
            for (long b = 0; b <= 6; b++) {
                long rest = n - a - 10 * b;
                long c = rest > 0 ? (rest + 59) / 60 : 0;
                long cost = 15 * a + 125 * b + 440 * c;
                if (cost < bestCost) {
                    bestCost = cost;
                    bestA = a;
                    bestB = b;
                    bestC = c;
                }
            }
        }

        System.out.println(bestA + " " + bestB + " " + bestC);
    }
}