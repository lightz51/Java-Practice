
/**
       File: Vehicle.java
	   Author: Abdul Wahid Pathan
       Date: Apr 17, 2023 11:43:40 a.m.
Description: This is the parent class of the rest of the classes. It is abstract and all the method definitions
						 are here. All the child classes will inherit properties from here.
 */
public abstract class Vehicle
{
	// Declaring variables
	private String type;
	private String make;
	private String model;
	
	// One-arg constructor
	public Vehicle(String type)
	{
		this.type = type;
		this.make = "unknown";
		this.model = "unknown";
	}
	
	// Three-arg constructor
	public Vehicle(String type, String make, String model)
	{
		this.type = type;
		this.make = make;
		this.model = model;
	}
	
	// All the getter methods
	public String getType()
	{
		return this.type;
	}
	
	public String getMake()
	{
		return this.make;
	}
	
	public String getModel()
	{
		return this.model;
	}
	
	// All the setter methods
	public void setMake(String make)
	{
		this.make = make;
	}
	
	public void setModel(String model)
	{
		this.model = model;
	}
	
	/* Method Name: describeVehicle
	 * Purpose: To provide description for the Vehicle
	 * Accepts: N/A
	 * Returns: String
	 */
	public abstract String describeVehicle();
	
	
	/* Method Name: rateQuality
	 * Purpose: To rate the quality of the Vehicle
	 * Accepts: N/A
	 * Returns: String
	 */
	public abstract String rateQuality();
	
	
	/* Method Name: toString
	 * Purpose: To provide a print statement that gives details for the vehicle
	 * Accepts: N/A
	 * Returns: String
	 */
	public String toString()
	{
		return "This Vehicle is a " + this.type + ". Its make is " + this.make +
				   ", and it's model is " + this.model + ".";
	}
}
