import java.util.Scanner;

public class Taskk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long k = sc.nextLong();

        if (k == 1 || k == 2 || k == 4 || k == 7) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}