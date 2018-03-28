package Seleniumtutorial;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) 
	{
/*		System.out.print("Enter digit of number is :");
		Scanner s=new Scanner(System.in);
		
		int inputNumber=s.nextInt();
		
		int n=inputNumber;
		// reverse number
		int reverseNumber=0;
		int reminder;
		
		while (inputNumber>0)
		{
			reminder=inputNumber%10;
			//int quotient = inputNumber/10;
			reverseNumber=reverseNumber*10 + reminder;
			inputNumber=inputNumber/10;
		}
		if(reverseNumber==n){
		
		
	         System.out.println(n+" is a Palindrome Number!"); 
		}
	         
	         else{
		
	         System.out.println(n+" is not a Palindrome Number!"); 
	         }

*/	
System.out.println("Enter a string:");
Scanner sc=new Scanner(System.in);
String value=sc.next();

String str="mom";

String n=value;
char reverse="";
String original="";

int length=str.length();

for(int i=length-1;i>=0;i--){
	char reverse1=(char) (reverse1 + original.charAt(i));
	
	if(str.equals(reverse1)){
		System.out.println("Entered string is palindrome:");
	}
	else
	{
		System.out.println("Entered string is not a palindrome:");

	}
}

		
	}
}

		


