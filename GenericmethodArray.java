package homework2;

public class GenericmethodArray {
public static <T> T getFirstElement(T[]array) {
	if (array ==null || array.length ==0);{
		return null;
	}
		
}
public static void main (String[]args)
{
	Integer[]intArray = {1,2,3,4,5};
	Integer firstInt =getFirstElement(intArray);
	System.out.println("First element of the integer array:" +firstInt);
	
	String[]strArray = {"apple,banana,orange"};
	String firstStr =getFirstElement(strArray);
	System.out.println("First element of the string array:"+firstStr);
	
	Double[]emptyArray = {};
	Double firstDouble =getFirstElement(emptyArray);
	System.out.println("Firts element of the empty array:"+firstDouble);
}
}
