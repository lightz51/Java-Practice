
/**
       File: Arcade.java
	   Author: Abdul Wahid Pathan
Description:A particular pinball machine accepts any combination of toonies ($2 coins), loonies ($1 coins),
						and quarters ($0.25 coins). The machine will credit one game for each $1.25. You will write a program that
						will calculate the amount of money inserted into the machine, the number of games credited, and any
						extra change to be “swallowed” by the machine.
 */
import java.util.Scanner;
public class Arcade
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		final double PRICE_PER_GAME = 1.25;  // Declaring a constant variable for price
		double totalMoney;
		
		System.out.println("This pinball machine will accept $2 coins, $1 coins and quarters ($0.25 coins).\n"
				+ "Each game costs 1.25 cents.\n");

		// Taking input for the number of coins inserted.
		System.out.print("Enter the number of $2 coins inserted: ");
		double no_of_toonies = input.nextDouble();
		
		System.out.print("Enter the number of $1 coins inserted: ");
		double no_of_loonies = input.nextDouble();
		
		System.out.print("Enter the number of $0.25 coins inserted: ");
		double no_of_quarters = input.nextDouble();
		
		totalMoney = (2 * no_of_toonies) + no_of_loonies + (0.25 * no_of_quarters); // Calculating total money inserted
		System.out.println("\nYou inserted $" + totalMoney);
		
		double gameCredit = totalMoney / PRICE_PER_GAME; // Calculating how many game credit the user has
		double extraCredit = totalMoney % PRICE_PER_GAME; // Calculating how much extra money the user paid
		
		System.out.println("You've been credited with " + (int) gameCredit + " games"); // Printing game credit
		System.out.println("You inserted an extra $" + extraCredit);									// Printing extra credit.
		
		input.close();
	}

}
