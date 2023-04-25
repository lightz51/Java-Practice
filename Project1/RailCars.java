
/**
       File: RailCars.java
	   Author: Abdul Wahid Pathan
Description: A program to that helps analyze how much of the total automobiles can be shipped through the available rail cars. It is flexible enough to work for different 
 						 companies, number of automobiles, rail cars, and with different sizes of rail cars. Also provides other data such as how many cars would be left behind,
						 how many extra spaces left in rail cars etc.
 */

import java.util.Scanner;
public class RailCars
{

	public static void main(String[] args)
	{
		System.out.println("Welcome to the Railway Capacity Analysis Program!");
		System.out.println("--------------------------------------------------\n");
		System.out.println("First some information is needed...");
		
		// Scanner object created
		Scanner input = new Scanner(System.in);
		
		// flag used for the while loop & All the variables declared and initialized.
		int flag = 0;
		String companyName = null;
		int totalRailCars = 0;
		int capacityRailCar = 0;
		int totalRailCarsCapacity = 0;
		int spaceLeftInRailCars = 0;
		int noOfRailCarsNeeded = 0;
		int totalCars = 0;
		int carsLeftBehind = 0;
		double carsLeftBehindPercentage = 0.0;
		
		System.out.print("\nEnter the name of the railway company: ");
		companyName = input.nextLine();
		
		System.out.print("Enter the number of automobiles waiting at the " + companyName + " rail yard: ");
		totalCars = input.nextInt();

		
		// While loop to keep the user in loop until valid input is given.
		while(flag == 0)
		{
			System.out.print("Enter the maximum number of automobiles per rail car: ");
			capacityRailCar = input.nextInt();
			if (capacityRailCar > 35 && capacityRailCar < 49)
			{
				flag = 1;
			}
			else if(capacityRailCar < 36)
			{
				System.out.println("Sorry, we have no railcars with that little capacity.");
			}
			else
			{
				System.out.println("Sorry, we have no railcars that can hold that many cars.");
			}
		}
		
			
		
		System.out.print("Enter the number of railcars that are available at the " + companyName + " rail yard: ");
		totalRailCars = input.nextInt();
		
		// All the required calculations performed.
		totalRailCarsCapacity = capacityRailCar * totalRailCars;
		spaceLeftInRailCars = totalRailCarsCapacity - totalCars;
		noOfRailCarsNeeded = (int) Math.ceil(totalCars / (capacityRailCar + 0.0));
		
		// Data validation to perform certain functions when there is space left in rail cars vs functions when there is none.
		if (noOfRailCarsNeeded < totalRailCars)
		{
			// Calling the function and passing the arguments.
			display(noOfRailCarsNeeded, totalCars, carsLeftBehind, carsLeftBehindPercentage);
			System.out.println("There would be room for an extra " + spaceLeftInRailCars + " automobiles on the rail cars.");
		}
		else if(noOfRailCarsNeeded == totalRailCars)
		{
			display(noOfRailCarsNeeded, totalCars, carsLeftBehind, carsLeftBehindPercentage);
		}
		else
		{
			display(noOfRailCarsNeeded, totalCars, carsLeftBehind, carsLeftBehindPercentage);
		}
		input.close();
	}
	
	// A function with argument created, for a block of code that was getting repeated.
	static void display(int noOfRailCarsNeeded, int totalCars, int carsLeftBehind, double carsLeftBehindPercentage)
	{
		System.out.println("\nHere are the results...\n");
		System.out.println("A minimum of " + noOfRailCarsNeeded + " rail cars are required to ship every automobile in the yard:");
		System.out.println((int)(totalCars - carsLeftBehind) + " automobiles (" + (100 - carsLeftBehindPercentage) + "%) would be shipped.");
		System.out.println((int)carsLeftBehind + " automobiles (" + carsLeftBehindPercentage + "%) would be left behind.");
	}
}

