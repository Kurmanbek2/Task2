import java.util.Scanner;

public class Taskaa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int even = 0;
        if (a % 2 == 0) even++;
        if (b % 2 == 0) even++;
        if (c % 2 == 0) even++;

        if (even >= 1 && even <= 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}