import java.util.Scanner;

public class ccc98s1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i <= n; i++) {
            String sentence = "";
            String string = scan.nextLine();
            String words[] = string.split(" ");
            for (String word : words) {
                if (word.length() == 4) {
                    word = "****";
                }
                sentence += word + " ";
            }

            System.out.println(sentence);

        }
    }
}
