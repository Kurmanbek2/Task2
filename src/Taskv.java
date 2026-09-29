import java.util.Scanner;

public class Taskv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int last = n % 10;
        int lastTwo = n % 100;

        String word;
        if (lastTwo >= 11 && lastTwo <= 14) {
            word = "korov";
        } else if (last == 1) {
            word = "korova";
        } else if (last >= 2 && last <= 4) {
            word = "korovy";
        } else {
            word = "korov";
        }

        System.out.println(n + " " + word);
    }
}