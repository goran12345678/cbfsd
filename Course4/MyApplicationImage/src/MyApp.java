
import java.util.Scanner;

public class MyApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice = -1;
		StringBuilder sb = new StringBuilder();
		boolean debug = Boolean.parseBoolean(System.getenv("debug"));
		
		while (true) {
			// TODO Auto-generated method stub
			int[] cashBacks = { 120, 200, 320, 500, 50, 90, 1000 };
			int luckyNumber = 0;

			System.out.println("Enter Your Lucky Number");
			try {
				luckyNumber = scanner.nextInt();//
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Sorry!! Input is not a number");
				sb.append(e.getMessage());			}

			System.out
					.println("For You Lucky Number " + luckyNumber + " CashBack Earned is: " + cashBacks[luckyNumber]);

			System.out.println("Enter 0 to quite");

			if (luckyNumber == 0) {	
				sb.append("Enterd zero");
				break;
			}
			
		}
		if(debug)
			System.out.println(sb.toString());
		
		scanner.close();

		System.out.println("Thank you for Playing Lucky Number CashBack");
	}

}
