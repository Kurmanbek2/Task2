import java.util.Scanner;

public class Taskz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int last = n % 10;
        int lastTwo = n % 100;

        String word;
        if (lastTwo >= 11 && lastTwo <= 14) {
            word = "bochek";
        } else if (last == 1) {
            word = "bochka";
        } else if (last >= 2 && last <= 4) {
            word = "bochki";
        } else {
            word = "bochek";
        }

        System.out.println(n + " " + word);
    }
}