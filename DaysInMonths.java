import java.util.Scanner;
public class DaysInMonths
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		String [] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		int [] days = {31, 28, 30, 31, 30, 31, 30, 31, 30, 31, 30, 31};
		
		System.out.println("Type a month (Jan) to find out how many days it has: ");
		String selectedMonth = input.nextLine();
		boolean isTrue = false;
		
		for (int index = 0; index < months.length ; index++)
		{
			if (selectedMonth.equalsIgnoreCase(months[index]))
			{
				System.out.println("No. of days in "+ months[index] + " is: " + days[index]);
				isTrue = true;
			}
		}
		
		if (isTrue = false)
		{
			System.out.println("Please enter a valid month!");
		}
		input.close();

	}

}
