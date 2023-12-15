
public class Functions {

	//Functions have signatures.
	// A function signature is defined by the combination of function name and parameters.
	//Functions have access specifiers
	// Access Specifiers
	// 1. public - accessible from anywhere
	// 2. private - only accessible within the declaring class
	// 3. protected - accessible within class, subclass and same package but not outside of class
	// 4. default accessible within the same package but not outside.
	//A static function belongs to a class rather than an instance of the class.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//int result = total(3, 5); //calling the function
		//System.out.println(result);
		//String test = "Hello there";
		//int index = test.indexOf("o");
		//System.out.println(index);
		//System.out.println(total("test"));
		//System.out.println(total(1,2));
		//System.out.println(total(1,2,3));
		MyCalculator calculator = new MyCalculator();
		calculator.addNumbers(3, 5);
		calculator.subtractNumbers(5, 3);
		
		int sum = calculator.multipleNumbers(3, 5);
		System.out.println(sum);
		calculator.decrementNumber(sum);
		//calculator.showNumbers(7, 9);
		
		MyCalculator.showNumbers(7, 9);
		
	}
	//camel case naming convention
	private void showTime() {
		System.out.println("The time is 9:12P");
	}
	public static int total(int a, int b) {
		return a + b;
	}
	//Function overloading. Reuse the name but change the parameters
	public static int total(int a, int b, int c) {
		return a + b + c;
	}
	//overloaded
	public static String total(String b) {
		return "Hi";
	}

}
