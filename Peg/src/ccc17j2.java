import java.util.Scanner;

public class ccc17j2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String numberS = scan.nextLine();
        int realNumber = Integer.parseInt(numberS);
        int shift = scan.nextInt();
        
        int sum = Integer.parseInt(numberS);

        String totalNumString[] = new String[shift];

        String shiftTotalString = "";

        for (int i = 0; i < shift; i++) {

            shiftTotalString += "0";
            numberS += shiftTotalString;

            totalNumString[i] = sum+shiftTotalString;

        }

        int totalFinal = 0;
        for (String n : totalNumString) {

            totalFinal += Integer.parseInt(n);
        }

        System.out.println(totalFinal + realNumber);


    }
}
