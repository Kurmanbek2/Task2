import java.util.Scanner;

public class Taskp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        System.out.println(Math.max(a, Math.max(b, c)));
    }
}