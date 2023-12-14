
public class Example {
	public static void main(String[] args) {
		System.out.println("Hello world!");
		
		//Unary Operators -- (decrement operator),++ (increment operator), ! (negation operator), ~ (bitwise inverse operator)
		//int x = 10;
		//System.out.println(x);
		//System.out.println(++x);
		//System.out.println(x);
		
		//System.out.println(x--);
		//System.out.println(x);
		
		//boolean y = false;
		//System.out.println(y);
		//System.out.println(!y);
		
		//int a = 10;  // 0000 0110  2^3 + 2^1 = 1-
		//System.out.println(~a); // 1111 1001
		
		//0000 1110 = 2^3 + 2^2 + 2^1 = 12
		
		//Arithmetic Operator
		
		/*int a = 10;
		int b = 5;
		System.out.println(a+b); //addition operator
		System.out.println(a-b);// subtraction operator
		System.out.println(a*b); //multiplication operator
		System.out.println(a/b); //division operator
		System.out.println(a%b);//modulus operator (the remainder of the division)
		
		System.out.println(9*9/4+2-1*4/2);
		*/
		
		//Left Shift Operator <<
		//System.out.println(8<<2); // 8*2^2 = 32
		//Right Shift Operator >>
		//System.out.println(8>>2); // 8/2^2 = 2
		//Java Shift Operator 
		//System.out.println(20>>2); //0001 0010 0000 1001
		
		//32<<4 32/4^2
		
		//AND Operator &&
		//int a = 9;
		//int b = 4;
		//int c = 19;
		//System.out.println(a>b && a>c);
		
		//OR Operator ||
		//System.out.println(a<b || a>c || 3>1);
		
		//conditional statements
		//If statement
		/*
		int x = 13;
		int y = 12;
		int z = 10;
		if(x < y) {
			System.out.println("The statement is true");
		}
		else if(z > y) {
			System.out.println("execution else if");
		}
		else {//If else statement
			System.out.println("execution of default");
			if(z == 10) {
				System.out.println("execution of z = 15");
			}
		}
		
		System.out.println("execution ended");
		*/
		/*
		int x = 800;
		//switch statement/
		switch(x){
		case 100: //if x is 100 run this code
			System.out.println(x);
			break;
		case 200: //if x is 200 run this code
			System.out.println(x);
			break;
		case 300: //if x is 300 run this code
			System.out.println(x);
			break;
		default:
			System.out.println("default");
			break;
		}
		*/
		System.out.println("execution ended");
		
		//Loops
		//  1. Intialization
		//  2. condition
		//  3. Increment or decrement
		//  4. Body
		
		//For loop
		//for(int i=1; i<=10; i++) {
		//	System.out.println(i);
		//}
		
		//While loops
		
		//int i = 1;
		//Infinite loop.
		//while(i <= 10) {
		//	System.out.println(i);
		//	i++;
		//}
		
		//Do_While loop
		// ******1 iteration will always execute
		int i = 1;
		do {
			System.out.println(i);
			i++;
		}while(i <= 10);
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
