import java.util.Scanner;
public class LetsMakeADeal
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String doorNumber = "";
		String prize = "";
		
		System.out.println("Please enter a door number between one to five: ");
		doorNumber = input.nextLine().toLowerCase();
		
		if(doorNumber.equals("one") || doorNumber.equals("two") || doorNumber.equals("three") || doorNumber.equals("four") || doorNumber.equals("five")) //Comparison operator didn't worked with string since its an object.
		{
			switch(doorNumber)
			{
			case "one":prize = "a Car";
			break;
			
			case "two":prize = "a Spatula";
			break;
			
			case "three":prize = "a Laptop";
			break;
			
			case "four":prize = "a House";
			break;
			
			case "five":prize = "a Trashbin";
			break;
			
			//Can remove "if" if you want to add default.
			}
			System.out.println("+========================================+");
			System.out.println("Congratulations, you have won a " + prize);
			System.out.println("+========================================+");
		}
		else 
		{
			System.out.println("Please select the correct door!");
		}
		input.close();
	}

}