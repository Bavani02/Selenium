package Seleniumtutorial;

import java.util.Scanner;

public class LearningFibonacciSeries {

	public static void main(String[] args)
	{
		System.out.print("Enter length :");
		//create object
		Scanner sc=new Scanner(System.in);
		int fibNumber=sc.nextInt();
		sc.close();
		
		//intialize the first number &  2nd number
		
		int first=0;
		int second=1;
		
		System.out.print("Fibonacci series is:");
		
		for(int i=0;i<fibNumber;i++)
		{
			System.out.println(first);
			int next=first+second;
			first=second;
			second=next;
			
		}
		
		}
		
}
		
		
		


	


