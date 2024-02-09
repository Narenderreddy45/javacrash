package homework5;

import java.util.Scanner;

public class GuessingGame {
 private static final int g = 0;
public static void main(String[ ] args)
 {
	int i =(1+(int) (Math.random() *99));
	
	while (true)
	{
		//System.out.println("Guess a Number:");
		  Scanner in = new Scanner(System.in); 
		  System.out.println("Guess a Number:");
		  int g =in.nextInt();
		  System.out.println("your number is "+g);
		  System.out.println("Random number"+i);
		 
	 if (g == i) {
         System.out.print("Guess is correct");
       } else if (g >i) {
          System.out.print("Too High");}
	}    
    	

	
 }
	

{
}
}

 
			 
 
	        	
		
			
		



	
		 
	 	 
		 
	 
		 
             
		 
	 


