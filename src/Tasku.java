import java.util.Scanner;

public class Tasku {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        if (!(a < b + c && b < a + c && c < a + b)) {
            System.out.println("impossible");
            return;
        }

        long m = Math.max(a, Math.max(b, c));
        long sumSq = a * a + b * b + c * c - m * m;

        if (m * m == sumSq) {
            System.out.println("right");
        } else if (m * m < sumSq) {
            System.out.println("acute");
        } else {
            System.out.println("obtuse");
        }
    }
}