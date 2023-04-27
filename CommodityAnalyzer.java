
/**
       
Description: This is a price tracker program, the user have to enter the commodity, its price over multiple days, and the program will
						 output the highest, lowest, and average price of the commodity over several days, as well as the range of fluctuation.
						 
						 Pseudocode:
						 Create all needed variables at the top and initialize them.
						 Print the title of the program and the design.
						 Print the prompts for user input and take values of double type using scanner.
						 Make an array of double type to take price input, length of array must be specified by user.
						 Create function that takes the array input, finds the average price and returns it, all in double type.
						 Create function that takes the array input, finds the lowest price and returns it, all in double type.
						 Create function that takes the array input, finds the highest price and returns it, all in double type.
						 Create function that takes the array input, finds the price range and returns it, all in double type.
						 Call the functions and store them in variables along with truncating their values to two decimals.
						 Print all the prices that were found appropriately.
						 Print end design.
						 Close Scanner object.
						 *************************************End of Pseudocode*************************************************
 */
import java.util.Scanner;
public class CommodityAnalyzer
{

	public static void main(String[] args)
	{
		// All variables declared here.
		Scanner input = new Scanner(System.in);
		String commodity = null;
		String metric = null;
		int noOfDays = 0;
		double lowestPrice = 0.0;
		double highestPrice = 0.0;
		double avgPrice = 0.0;
		double range = 0.0;
		double tempValue = 0.0;
		
		// Design for the program.
		System.out.println("***************************************************************************************************");
		System.out.println("\n\t\t\tAbdul's Commodity Price Analyzer!");
		System.out.println("\t\t\t*********************************\n");
		
		System.out.print("Please enter the Commodity you will be tracking: ");
		commodity = input.nextLine();
		
		System.out.print("Please enter the number of days you will be recording Milk prices: ");
		noOfDays = input.nextInt();
		
		// Clearing buffer since nextInt has been used before using nextLine().
		input.nextLine();
		
		System.out.print("Please enter the metric to be used when tracking Milk: ");
		metric = input.nextLine();
		
		System.out.println("\nThis program will calculate statistics related to " + metric + " of " + commodity + " sold on the world market.\n");
		
		// Array declared here.
		double [] priceArray = new double[noOfDays];
		for(int index = 0; index < priceArray.length;index++)
		{
			System.out.print("Enter price " + (index + 1) + " and press enter: $");
			priceArray[index] = input.nextDouble();
		}
		
		// Calling methods and calculation to truncate output to two decimals.
		avgPrice = (avgPriceMethod(priceArray) + 0.005) * 100;
		tempValue = (int)avgPrice;
		avgPrice = tempValue/100;
		
		lowestPrice = lowestPriceMethod(priceArray);
		highestPrice = highestPriceMethod(priceArray);
		
		range = (rangePriceMethod(priceArray) + 0.005) * 100;
		tempValue = (int) range;
		range = tempValue/100;
		
		// Print Statements.
		System.out.println("\nHere are the statistics for the " + commodity + " prices.\n");
		System.out.println("The average price is $" + avgPrice);
		System.out.println("The lowest price is $" + lowestPrice);
		System.out.println("The highest price is $" + highestPrice);
		System.out.println("The range of the daily prices is $" + range);
		System.out.println("\n***************************************************************************************************\n");
		input.close();
		
	}
	
	
	// Method to calculate average price of the commodity. It is accepting "priceArray" array of type "double" and it returns the value of average price in type "double".
	static double avgPriceMethod(double [] priceArray)
	{
		double average = 0.0;
		double total = 0.0;
		for(int index = 0; index < priceArray.length;index++)
		{
			total += priceArray[index];
			average++;
		}
		return total/average;
	}
	
	
	// Method to calculate lowest price of the commodity. It is accepting "priceArray" array of type "double" and it returns the value of lowest price in type "double".
	static double lowestPriceMethod(double [] priceArray)
	{
		double lowest = priceArray[0];
		for(int index = 0; index < priceArray.length;index++)
		{
			if(lowest > priceArray[index])
			{
				lowest = priceArray[index];
			}
		}
		return lowest;
	}
	
	
	// Method to calculate highest price of the commodity. It is accepting "priceArray" array of type "double" and it returns the value of highest price in type "double".
	static double highestPriceMethod(double [] priceArray)
	{
		double highest = priceArray[0];
		for(int index = 0; index < priceArray.length;index++)
		{
			if(highest < priceArray[index])
			{
				highest = priceArray[index];
			}
		}
		return highest;
	}
	
	
	/* Method to calculate price range of the commodity, Passed array according to specifications
		 can also be done by passing lowest and highest price directly instead of passing array.
		 It is accepting "priceArray" array of type "double" and it returns the value of price range in type "double"*/
	static double rangePriceMethod(double [] priceArray)
	{
		double highest = priceArray[0];
		double lowest = priceArray[0];
		
		for(int index = 0; index < priceArray.length;index++)
		{
			if(highest < priceArray[index])
			{
				highest = priceArray[index];
			}
			if(lowest > priceArray[index])
			{
				lowest = priceArray[index];
			}
		}
		
		return highest - lowest;
	}

}
