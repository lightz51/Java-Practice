import java.util.Scanner;
public class CoinToss
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of coin tosses you want: ");
		int numTosses = input.nextInt();
		
		int [] coinTosses = new int[numTosses];
		int noOfHeads = 0;
		int noOfTails = 0;
		 
		
		for(int index = 0;index < numTosses;index++)
		{
			coinTosses[index] = (int) (Math.random() * 2 + 1);
			
			
			if(coinTosses[index] == 1)
			{
				noOfHeads++;
			}
			else
			{
				noOfTails++;
			}
		}
		
		System.out.println("No. of times heads: " + noOfHeads);
		System.out.println("No. of times tails: " + noOfTails);
		
		input.close();
	}

}
