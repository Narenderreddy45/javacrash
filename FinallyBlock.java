package Assignment1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FinallyBlock {
public static void main(String[] args)
{
	BufferedReader bufferedreader = null;
	try {
		FileReader fileReader =new FileReader("input.txt");
		bufferedreader =new BufferedReader(fileReader);
		String line =bufferedreader.readLine();
		if (line ==null) {
			System.out.println("Error : The file is empty");
			return;
		}
		String[]numbers=line.split("\\s+");
		if (numbers.length<2) {
			System.out.println("Error :Insuffiecient data in the file.");
			return;
		}
int num1 =Integer.parseInt(numbers[0]);
int num2 =Integer.parseInt(numbers[1]);
try {
	int result=divideNumbers(num1,num2);
	System.out.println("Result of division:"+result);
	}catch(ArithmeticException e) {
		System.out.println("Error division by zero is not allowed.");
}		
	}catch(FileNotFoundException e) {
		System.out.println("Error:File'input.txt' not found");
	}
	catch(IOException e) {
		System.out.println("Error reading from file :"+e.getMessage());
	}finally {
		try {
			if (bufferedreader !=null) {
				bufferedreader.close();
			}
		} catch(IOException e) {
			System.out.println("Error closing file:"+e.getMessage());
		}
		System.out.println("Program has Ended.");
		
		
		
	
	}
	
	
}

public  static int divideNumbers(int num1, int num2) {
	// TODO Auto-generated method stub
	return 0;
}

}
