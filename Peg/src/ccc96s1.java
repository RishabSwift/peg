import java.util.Scanner;

public class ccc96s1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int totalNum = scan.nextInt();

        for (int i = 0; i < totalNum; i++) {

            int in = scan.nextInt();
            int total = 0;

            for (int j = 1; j < in; j++) {
                if (in % j == 0) {
                    total += j;
                }

            }
            if (total == in) {
                System.out.println(in + " is a perfect number.");
            } else if (total > in) {
                System.out.println(in + " is an abundant number.");
            } else if (total < in) {
                System.out.println(in + " is a deficient number.");
            }

        }
    }
}
