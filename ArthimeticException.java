package Assignment1;

import java.util.Scanner;

public class ArthimeticException {
public static void main(String[] args)
{
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the First Number:");
	int num1 = scanner.nextInt();
	
	System.out.println("Enter the Second Number:");
	int num2= scanner.nextInt();
	try {
		int result =divideNumbers(num1,num2);
		System.out.println("Result of division:" +result);
	}catch(ArithmeticException e) {
		System.out.println("Error:Division by zero is not allowed.");
	}
	finally {
		System.out.println("Program has Ended.");
	
	
	
		
	}
	
			
}

public static int divideNumbers(int num1, int num2) {
	// TODO Auto-generated method stub
	return 0;
}
}
