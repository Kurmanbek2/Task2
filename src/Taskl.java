import java.util.Scanner;

public class Taskl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long k = sc.nextLong();
        long m = sc.nextLong();
        long n = sc.nextLong();

        long result;
        if (n == 0) {
            result = 0;
        } else if (n < k) {
            result = 2 * m;
        } else {
            result = ((2 * n + k - 1) / k) * m;
        }

        System.out.println(result);
    }
}