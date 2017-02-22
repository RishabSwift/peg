import java.util.Scanner;

public class ccc11s2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int totalQuestions = scan.nextInt();
        String studentAns[] = new String[totalQuestions];
        String correctAns[] = new String[totalQuestions];
        for (int i = 0; i < totalQuestions; i++) {
            studentAns[i] = scan.next();
        }

        for (int i = 0; i < totalQuestions; i++) {
            correctAns[i] = scan.next();
        }

        int counter =0;
        for (int i = 0; i < totalQuestions; i++) {
            if (studentAns[i].equals(correctAns[i])) {
                counter++;
            }
        }

        System.out.println(counter);
    }

}
