import java.util.Scanner;

public class Taskr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        if (a == b && b == c) {
            System.out.println(3);
        } else if (a == b || a == c || b == c) {
            System.out.println(2);
        } else {
            System.out.println(0);
        }
    }
}