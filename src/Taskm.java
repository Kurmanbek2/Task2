import java.util.Scanner;

public class Taskm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        if (x1 * x2 > 0 && y1 * y2 > 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}