import java.util.Scanner;

public class Taskt {
    static String fmt(double x) {
        if (x == 0) x = 0.0; // убирает -0.0
        if (x == Math.rint(x) && Math.abs(x) < 1e15) {
            return String.valueOf((long) x);
        }
        return String.valueOf(x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double d = b * b - 4 * a * c;

        if (d < 0) {
            return;
        } else if (d == 0) {
            System.out.println(fmt(-b / (2 * a)));
        } else {
            double s = Math.sqrt(d);
            System.out.println(fmt((-b + s) / (2 * a)));
            System.out.println(fmt((-b - s) / (2 * a)));
        }
    }
}