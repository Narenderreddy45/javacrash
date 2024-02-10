package homework3;

import java.util.Collection;

public class BoundedType {
//method to cal sum of numbers
	public static double calculateSum(Collection<? extends Number>numbers){
		double sum=0;
		for (Number number1:numbers) {	
		}
		return sum;	
	}
	public static void main(String[]args) {
		java.util.ArrayList<Integer>integers =new java.util.ArrayList<>();
		integers.add(1);
		integers.add(2);
		integers.add(3);
		System.out.println("Sum of Integers:"+calculateSum(integers));
		java.util.ArrayList<Double>doubles =new java.util.ArrayList<>();
		doubles.add(1.5);
		doubles.add(2.5);
		doubles.add(3.5);
		System.out.println("Sum of Doubles:"+calculateSum(doubles));
	}
}
