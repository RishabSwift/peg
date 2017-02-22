import java.util.Scanner;

public class a2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String message = "Ready";
        while (true) {
            System.out.println(message);
            String word = scan.nextLine();
            if (word.equals("qp")) {
               message = "Mirrored pair";
            } else if (word.equals("db")) {
               message = "Mirrored pair";
            } else if (word.equals("  ")) {
                break;
            } else {
               message = "Ordinary Pair";
            }

        }

    }

}
