import java.util.Scanner;

public class Taskq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        if (a < b + c && b < a + c && c < a + b) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}