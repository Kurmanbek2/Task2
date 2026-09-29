import java.util.Scanner;

public class Taskae {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        if (a > b) {
            long t = a; a = b; b = t;
        }
        if (a > c) {
            long t = a; a = c; c = t;
        }
        if (b > c) {
            long t = b; b = c; c = t;
        }

        System.out.println(a + " " + b + " " + c);
    }
}