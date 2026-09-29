import java.util.Scanner;

public class Taskx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        long bestCost = Long.MAX_VALUE;
        long bestTrips = -1;
        long[] best = new long[5];

        for (long a = 0; a <= 5; a++) {
            for (long b = 0; b <= 2; b++) {
                for (long c = 0; c <= 2; c++) {
                    for (long d = 0; d <= 3; d++) {
                        long rest = n - a - 5 * b - 10 * c - 20 * d;
                        long e = rest > 0 ? (rest + 59) / 60 : 0;
                        long cost = 15 * a + 70 * b + 125 * c + 230 * d + 440 * e;
                        long trips = a + 5 * b + 10 * c + 20 * d + 60 * e;
                        if (cost < bestCost || (cost == bestCost && trips > bestTrips)) {
                            bestCost = cost;
                            bestTrips = trips;
                            best[0] = a;
                            best[1] = b;
                            best[2] = c;
                            best[3] = d;
                            best[4] = e;
                        }
                    }
                }
            }
        }

        System.out.println(best[0] + " " + best[1] + " " + best[2] + " " + best[3] + " " + best[4]);
    }
}