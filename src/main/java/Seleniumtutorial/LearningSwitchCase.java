package Seleniumtutorial;

import java.util.Scanner;

public class LearningSwitchCase {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Day :");
		String days=s.next();
		s.close();
		
		switch (days.toUpperCase())
		{
		case "sunday":
			System.out.print("end day of week");
		break;
		
		case "MONDAY":
			System.out.print("1st day of week");
		break;
		
		case "tuesday":
			System.out.print("2nd day of week");
		break;
		
		case "wednesday":
			System.out.print("4th day of week");
		break;
		
		case "thursday":
			System.out.print("5th day of week");
		break;
		
		case "FRIDAY":
			System.out.print("6th day of week");
		break;
		
		case "saturday":
			System.out.print("7th day of week");
		break;
			
		default:
			System.out.print("Invalid day");
			
		}

		}

	}


