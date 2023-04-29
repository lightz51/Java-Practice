
/**
       File: BookCruise.java
	   Author: Abdul Wahid Pathan
Description: This is the tester program to drive the "CruiseShip" java program. It will pass values to the first program
						 using objects, it will also make use of getter methods to display all the ship details and setter methods
						 to modify the values of a particular ship.
 */
public class BookCruise
{

	public static void main(String[] args)
	{
		// Creating three objects for the CruiseShip Class.
		CruiseShip cruiseOne = new CruiseShip();
		CruiseShip cruiseTwo = new CruiseShip("Norwegian Dawn", "Norwegian Dawn");
		CruiseShip cruiseThree = new CruiseShip("Royal Carribean", "Navigator of the Seas", 2750);
		
		// Print statements to display the outputs and using getter methods
		System.out.println("----------------------------------");
		System.out.println("The first ship: ");
		System.out.println("Cruiseline: " + cruiseOne.getCruiseLine());
		System.out.println("Name: " + cruiseOne.getName());
		System.out.println("Capacity: " + cruiseOne.getCapacity());
		
		System.out.println("----------------------------------");
		System.out.println("The second ship before changes: ");
		System.out.println("Cruiseline: " + cruiseTwo.getCruiseLine());
		System.out.println("Name: " + cruiseTwo.getName());
		System.out.println("Capacity: " + cruiseTwo.getCapacity());
		
		// Using the setter methods to change the value of the second ship
		cruiseTwo.setCruiseLine("Costa");
		cruiseTwo.setName("Jewel");
		cruiseTwo.setCapacity(2565);
		
		System.out.println("\nThe second ship after changes: ");
		System.out.println("Cruiseline: " + cruiseTwo.getCruiseLine());
		System.out.println("Name: " + cruiseTwo.getName());
		System.out.println("Capacity: " + cruiseTwo.getCapacity());
		
		System.out.println("----------------------------------");
		System.out.println("The third ship: ");
		System.out.println("Cruiseline: " + cruiseThree.getCruiseLine());
		System.out.println("Name: " + cruiseThree.getName());
		System.out.println("Capacity: " + cruiseThree.getCapacity());
		System.out.println("----------------------------------");
	}

}
