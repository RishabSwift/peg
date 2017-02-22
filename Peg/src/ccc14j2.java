import java.util.Scanner;

public class ccc14j2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int totalVotes = scan.nextInt();
        String votes = scan.next();

        String totalA, totalB;
        totalA = votes.replaceAll("B", "");
        totalB = votes.replaceAll("A", "");

        if (totalA.length() > totalB.length()) {
            System.out.println("A");
        } else if (totalA.length() < totalB.length()) {
            System.out.println("B");
        } else {
            System.out.println("Tie");
        }
    }
}
