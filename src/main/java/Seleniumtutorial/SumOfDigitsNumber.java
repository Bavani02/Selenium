package Seleniumtutorial;

import java.util.Scanner;

public class SumOfDigitsNumber {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter digit of number is:");
		int number=s.nextInt();
		int n=number;
		
		int sum=0,reverseNumber;
		
		//while(number>9) 
		while (number != 0)

		{
		     sum = sum + number % 10;
		     number = number / 10;
		    }
	    System.out.println(sum);

}
		

	}


