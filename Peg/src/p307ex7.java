import java.util.Scanner;

public class p307ex7 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int numberOfStudents = Integer.parseInt(scan.nextLine());
		

		for (int i = 0; i <= numberOfStudents; i++) {
	
			
			int grade = Integer.parseInt(scan.nextLine());
			
			String message = "";
			
			if (grade >= 80 && grade <= 100) {
				message = "A";
			} else if (grade >= 70 && grade <= 79) {
				message = "B";
			} else if (grade >= 60 && grade <=69) {
				message = "C";
			} else if(grade >= 50 && grade <=59) {
				message = "D";
			} else if (grade >= 0 && grade <=49) {
				message = "F";
			} else {
				message = "X";
			}
			
			System.out.println(message);
			
			
		}
		
		
		

//		System.out.println(grades);

	}

}
