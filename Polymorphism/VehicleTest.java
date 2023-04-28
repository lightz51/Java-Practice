
/**
       File: VehicleTest.java
	   Author: Abdul Wahid Pathan
       Date: Apr 17, 2023 12:23:21 p.m.
Description: This is the tester class for all the rest of the classes, Information about the 
						 bicycles and automobiles are being displayed here. Polymorphism is also used.
 */
public class VehicleTest
{

	public static void main(String[] args)
	{
		Bicycle bicycleObject = new Bicycle("speedracer");
		Bicycle bicycleObject1 = new Bicycle("Mountain", "Schwinn", "Frontier", 9);
		
		Automobile automobileObject = new Automobile("slant 6", 140);
		Automobile automobileObject1 = new Automobile("V6", 180, "Toyota", "Rav4");
		
		System.out.println("\n======================================================================");
		System.out.println("Here are the details of the " + bicycleObject.getType() + "1.");
		System.out.println("Type: " + bicycleObject.getBicycleType());
		System.out.println("Make: " + bicycleObject.getMake());
		System.out.println("Model: " + bicycleObject.getModel());
		System.out.println("Rating: " + bicycleObject.getRating());
		
		System.out.println("\nHere are the details of the " + bicycleObject1.getType() + "2.");
		System.out.println("Type: " + bicycleObject1.getBicycleType());
		System.out.println("Make: " + bicycleObject1.getMake());
		System.out.println("Model: " + bicycleObject1.getModel());
		System.out.println("Rating: " + bicycleObject1.getRating());
		
		
		System.out.println("\nHere are the details of the " + automobileObject.getType() + "1.");
		System.out.println("Make: " + automobileObject.getMake());
		System.out.println("Model: " + automobileObject.getModel());
		System.out.println("Engine: " + automobileObject.getEngine());
		System.out.println("HP: " + automobileObject.getHP());
		
		System.out.println("\nHere are the details of the " + automobileObject1.getType() + "2.");
		System.out.println("Make: " + automobileObject1.getMake());
		System.out.println("Model: " + automobileObject1.getModel());
		System.out.println("Engine: " + automobileObject1.getEngine());
		System.out.println("HP: " + automobileObject1.getHP());
		
		System.out.println("\n======================================================================");
		System.out.println("Printing the toString method for each object:");
		System.out.println("\n" + bicycleObject.toString());
		System.out.println("\n" + bicycleObject1.toString());
		System.out.println("\n" + automobileObject.toString());
		System.out.println("\n" + automobileObject1.toString());
		
		bicycleObject.setMake("CCM");
		bicycleObject.setModel("Weston");
		bicycleObject.setBicycleType("Comfort");
		
		System.out.println("\n======================================================================");
		System.out.println("Refurbishing bicycle1:");
		System.out.println("\nBicycle 1:");
		System.out.println("Type: " + bicycleObject.getBicycleType());
		System.out.println("Make: " + bicycleObject.getMake());
		System.out.println("Model: " + bicycleObject.getModel());
		
		Vehicle [] vehicleArray = new Vehicle[4];
		vehicleArray[0] = bicycleObject;
		vehicleArray[1] = bicycleObject1;
		vehicleArray[2] = automobileObject;
		vehicleArray[3] = automobileObject1;
		
		System.out.println("\n======================================================================");
		System.out.println("Demonstrating Polymorphism:\n");
		for(int index = 0; index < vehicleArray.length; index++)
		{
			System.out.println(vehicleArray[index].describeVehicle());
			System.out.println(vehicleArray[index].rateQuality());
			System.out.println("");
		}
		System.out.println("********************end of the program********************");
		
		
	}

}
