package Seleniumtutorial;

import java.util.Scanner;

public class LearningLoop {

	public static void main(String[] args)
	{
	/*int y = 2;
	
    for(int y = 1; i <= 20; ++i)
    {
        System.out.printf("%d * %d = %d \n", y, i, y * i);
    }
	*/
        /*int y = 2, i = 1;
        
        while(i <= 20)
        {
            System.out.printf("%d * %d = %d \n", y, i, y * i);
            i++;
        }
*/
	System.out.print("Enter user input :");
	
	//using scanner ---->system get data from user
	Scanner sc=new Scanner(System.in);
	int userInput=sc.nextInt();
	sc.close();
	
	for(int i=0;i<=10;i++)
	{
		System.out.println(userInput+"*"+i+"*"+userInput*i);
	}
	}
	
		}

