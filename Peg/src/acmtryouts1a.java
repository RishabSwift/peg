import java.util.Scanner;

public class acmtryouts1a {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean gameOver = false;
        int n = scan.nextInt();
        for (int i = 0; i <= n; i++) {
            String option = scan.nextLine();

            if (!gameOver) {
                switch (option) {
                    case "Scissors":
                        System.out.println("Rock");
                        break;
                    case "Fox":
                        System.out.println("Foxen");
                        break;
                    case "Rock":
                        System.out.println("Paper");
                        break;
                    case "Foxen":
                        gameOver = true;
                        break;
                    case "Paper":
                        System.out.println("Scissors");
                        break;
                }
            } else {
                break;
            }
        }
    }

}
