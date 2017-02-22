import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class ccc17j4 {

	public static void main(String[] args) throws ParseException {

		Scanner scan = new Scanner(System.in);
		int addTime = scan.nextInt();
		
		Calendar cal = Calendar.getInstance();

		String myTime = "12:00";
		SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");
		Date date;

		int differencesFound = 0;
		for (int i = 0; i <= addTime; i++) {
			// Every minute, create a new calender instance so that we can keep track of time without doing hard work.
			date = dateFormat.parse(myTime);
			cal.setTime(date);
			cal.add(Calendar.MINUTE, i);

			// remove trailing zero from beginning of hour
			String timeWithoutZero = new SimpleDateFormat("h:mm").format(cal.getTime());

			// Remove columns
			String timeWithoutColon = timeWithoutZero.replaceAll(":", "");

			// Put each digit in an array
			int[] timeSingle = new int[timeWithoutColon.length()];

			for (int j = 0; j < timeSingle.length; j++) {
				timeSingle[j] = Integer.parseInt(timeWithoutColon.substring(j, j + 1));
			}

			// Check out first and second differences because there will be at least 2 differences
			int firstD, secondD, thirdD;
			secondD = timeSingle[2] - timeSingle[1];
			firstD = timeSingle[1] - timeSingle[0];

			// If there are 3 differences, check if all differences are equal 
			if (timeSingle.length == 4) {
				thirdD = timeSingle[3] - timeSingle[2];
				if (firstD == secondD && secondD == thirdD && thirdD == firstD) {
					differencesFound++;
				}
			} else {
				if (secondD == firstD) {
					differencesFound++;
				}
			}

		}
		
		System.out.println(differencesFound);
	}
}
