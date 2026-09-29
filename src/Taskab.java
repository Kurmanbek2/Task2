import java.util.Scanner;

public class Taskab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int[] values = {100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            while (x >= values[i]) {
                sb.append(symbols[i]);
                x -= values[i];
            }
        }

        System.out.println(sb);
    }
}