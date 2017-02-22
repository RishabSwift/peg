import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class ccc14s3 {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

        int testCases = Integer.parseInt(scan.readLine());

        for (int i = 0; i < testCases; i++) {

            int ingredients  = Integer.parseInt(scan.readLine());

            Stack<Integer> mountain = new Stack<Integer>();
            Stack<Integer> branch = new Stack<Integer>();

            boolean pathFound = false;

            for (int j = 0; j < ingredients; j++) {
                mountain.push(Integer.parseInt(scan.readLine()));
            }

            int currentNum = 1;

            while (true) {

                if (mountain.empty() && branch.empty()) {
                    pathFound = true;
                    break;
                }
                if (!mountain.empty() && mountain.peek() == currentNum) {
                    mountain.pop();
                    currentNum++;
                } else if (!branch.empty() && branch.peek() == currentNum) {
                    branch.pop();
                    currentNum++;
                } else {
                    if (mountain.empty())  break;

                    branch.push(mountain.pop());
                }
            }
            System.out.println(pathFound ? "Y" : "N");
        }


    }
}