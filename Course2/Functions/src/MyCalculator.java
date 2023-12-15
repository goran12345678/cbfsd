
public class MyCalculator {
	
	public static void showNumbers(int num1, int num2) {
		System.out.println(num1 + " " + num2);
	}
	//Method are blocks of code that perform a specific task
	public void addNumbers(int num1, int num2) {
		int sum = num1 + num2;
		sum = decrementNumber(sum);
		System.out.println(sum);
	}
	public void subtractNumbers(int num1, int num2) {
		int sum = num1 - num2;
		System.out.println(sum);
	}
	protected int decrementNumber(int num) {
		return num - 1;
	}
	public int multipleNumbers(int num1, int num2) {
		int sum = num1 * num2;
		return sum;
	}
}
