import java.util.Scanner;

public class ccc15j2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();

        int happyCount;
        int sadCount;

        happyCount = (message.length() - message.replaceAll(":-\\)", "").length()) / 3;
        sadCount = (message.length() - message.replaceAll(":-\\(", "").length()) / 3;

        if (happyCount == 0 && sadCount == 0) {
            System.out.println("none");
        } else if (happyCount > sadCount) {
            System.out.println("happy");
        } else if (sadCount > happyCount) {
            System.out.println("sad");
        } else if (happyCount == sadCount) {
            System.out.println("unsure");
        }
    }
}
