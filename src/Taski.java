import java.util.Scanner;

public class Taski {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();

        if (a == 0) {
            if (b == 0) {
                System.out.println("INF");
            } else {
                System.out.println("NO");
            }
        } else if (b % a != 0) {
            System.out.println("NO");
        } else {
            long x = -b / a;
            if (c * x + d == 0) {
                System.out.println("NO");
            } else {
                System.out.println(x);
            }
        }
    }
}