import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();

        if (Math.abs(a1 - a2) <= 1 && Math.abs(b1 - b2) <= 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}