package homework4;

import java.util.Scanner;

public class MultiplicationTableGen {

	public static void main(String[] args) {
		
		{
				 Scanner in = new Scanner(System.in); 
				System.out.println(" multiplication table for 3:");
				for(int i=1;i<=10;i++)
				{
					System.out.println("3*"+i+"="+(3*i));
			      for (int j=1;j<=3;j++)
			      {
			    	  System.out.println(" ");
			      }
				//not able to print  for three times
				
			}
		}
	}

}
