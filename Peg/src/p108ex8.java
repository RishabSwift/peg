import java.util.Scanner;


/**
 * Direction
 */
public class p108ex8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt();
        for (int i = 0; i < total; i++) {
            int degree = scan.nextInt();
            String direction = "";
            if (degree <= 45) {
                direction = "N";
            } else if (degree > 45 && degree < 135) {
                direction = "E";
            } else if (degree >= 135 && degree < 225) {
                direction = "S";
            } else if (degree >= 225 && degree < 315)  {
                direction = "W";
            } else if (degree >= 315) {
                direction="N";
            }

            System.out.println(direction);
        }
    }
}
