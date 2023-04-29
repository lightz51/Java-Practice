
/**
       File: CruiseShip.java
	   Author: Abdul Wahid Pathan
Description: A java program to set the cruiseline, name and capacity for different instances of ships. Constructors,
						 getter methods and setter methods are declared here.
 */
public class CruiseShip
{
	// Declaring all the variables.
	private String cruiseLine;
	private String name;
	private int capacity;
	
	// Creating a no-argument constructor.
	public CruiseShip()
	{
		this.cruiseLine = "Carnival";
		this.name = "Miracle";
		this.capacity = 2200;
	}
	
	// Creating a two-arguments constructor.
	public CruiseShip(String cruiseLine, String name)
	{
		this.cruiseLine = cruiseLine;
		this.name = name;
		this.capacity = defaultCapacity();
	}
	
	// Creating a three-arguments constructor.
	public CruiseShip(String cruiseLine, String name, int capacity)
	{
		this.cruiseLine = cruiseLine;
		this.name = name;
		this.capacity = capacity;
	}
	
	// Creating all the getter methods.
	public String getCruiseLine()
	{
		return this.cruiseLine;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public int getCapacity()
	{
		return this.capacity;
	}
	
	// Creating all the setter methods.
	public void setCruiseLine(String cruiseLine)
	{
		this.cruiseLine = cruiseLine;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setCapacity(int size)
	{
		this.capacity = size;
	}
	
	/* Method Name: defaultCapacity
	 * Purpose: Method to get a random capacity, within the range of 900-2800 for the ships.
	 * Accepts: N/A
	 * Returns: randomInt
	 */
	private int defaultCapacity()
	{
		int randomInt = (int)(Math.random() * (2800 - 900 +1) + 900);
		return randomInt;
	}
	
	

}
