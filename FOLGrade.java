
/**
       File: FOLGrade.java
	   Author: Abdul Wahid Pathan
Description:
 */
//Grades in FOL are rounded up .5 when transferred to Webadvisor.
import java.util.Scanner;
public class FOLGrade
{

	public static void main(String[] args)
	{
		System.out.println("Please enter your percentage: ");
		
		Scanner input = new Scanner(System.in);
		double percentage = input.nextDouble();
		String grade ="";
		String midtermGrade;
		
		if(percentage < 0 || percentage > 100)
		{
			System.out.println("Invalid entry, please try again!");
			System.exit(0);
		}
		else if(percentage >= 89.5)
		{
			grade = "A+";
		}
		else if(percentage >= 79.5)
		{
			grade = "A";
		}
		else if(percentage >= 74.5)
		{
			grade = "B+";
		}
		else if(percentage >= 69.5)
		{
			grade = "B";
		}
		else if(percentage >= 64.5)
		{
			grade = "C+";
		}
		else if(percentage >= 59.5)
		{
			grade = "C";
		}
		else if(percentage >= 54.5)
		{
			grade = "D+";
		}
		else if(percentage >= 49.5)
		{
			grade = "D";
		}
		else
		{
			grade = "F";
		}
		
		
		if(percentage >= 59.5 && percentage < 101) //Using 59.5 instead of 60, because it will be rounded up .5 when it goes into Webadvisor.
		{
			midtermGrade = "S";
			System.out.println("+===========================================================+");
			System.out.println("Your grade is: " + grade);
			System.out.println("Congratulation, you are passing the course, your MidTerm Grade is: " + midtermGrade);
			System.out.println("+===========================================================+");
		}
		else if(percentage >=49.5) //Use flag instead
		{
			midtermGrade = "U";
			System.out.println("+===========================================================+");
			System.out.println("Warning, you are close to borderline, meet with the professor. \nyour MidTerm Grade is: " + midtermGrade);
			System.out.println("+===========================================================+");
		}
		else
		{
			midtermGrade = "U";
			System.out.println("+===========================================================+");
			System.out.println("Your grade is: " + grade);
			System.out.println("Warning, you are failing the course, meet with your professor. \nyour MidTerm Grade is: " + midtermGrade);
			System.out.println("+===========================================================+");
		}
		input.close();

	}

}
