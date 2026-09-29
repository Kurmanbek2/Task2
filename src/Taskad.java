import java.util.Scanner;

public class Taskad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        if ((a == 1) == (b == 1)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}