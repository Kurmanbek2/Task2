import java.util.Scanner;

public class Tasky {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long m = sc.nextLong();
        long n = sc.nextLong();
        long x = sc.nextLong();
        long y = sc.nextLong();

        StringBuilder sb = new StringBuilder();

        if (y > 1) {
            sb.append(x).append(" ").append(y - 1).append("\n");
        }
        if (x > 1) {
            sb.append(x - 1).append(" ").append(y).append("\n");
        }
        if (y < n) {
            sb.append(x).append(" ").append(y + 1).append("\n");
        }
        if (x < m) {
            sb.append(x + 1).append(" ").append(y).append("\n");
        }

        System.out.print(sb);
    }
}