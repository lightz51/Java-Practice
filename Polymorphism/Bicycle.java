
/**
       File: Bicycle.java
	   Author: Abdul Wahid Pathan
       Date: Apr 17, 2023 11:51:52 a.m.
Description: This is the bicycle class, It is a child class of Vehicle. All the methods are being
						 overridden here and properties specific to bicycle are created here as well.
 */
public class Bicycle extends Vehicle
{
	// Declaring variables
	private String bicycleType;
	private int rating;
	
	
	// one-arg constructor
	public Bicycle(String btype)
	{
		super("Bicycle");
		this.bicycleType = btype;
		this.rating = 1;
	}
	
	// four-args constructor
	public Bicycle(String btype, String make, String model, int rating)
	{
		super("Bicycle", make, model);
		this.bicycleType = btype;
		this.rating = rating;
	}
	
	// All getters
	public String getBicycleType()
	{
		return this.bicycleType;
	}
	
	public int getRating()
	{
		return this.rating;
	}
	
	// All setters
	public void setBicycleType(String bType)
	{
		this.bicycleType = bType;
	}
	
	public void setRating(int rating)
	{
		this.rating = rating;
	}
	
	/* Method Name: describeVehicle
	 * Purpose: To provide description for the Bicycle
	 * Accepts: N/A
	 * Returns: String
	 */
	@Override
	public String describeVehicle()
	{
		return "This vehicle is a(n) " + this.getMake() + " " + this.getModel() + " bicycle, They are great for the environment since bicycles requires no fuel.";
	}

	
	/* Method Name: rateQuality
	 * Purpose: To rate the quality of the Bicycle
	 * Accepts: N/A
	 * Returns: String
	 */
	@Override
	public String rateQuality()
	{
		if(this.rating > 8)
		{
			return "This bicycle has been determined to be of excellent quality.";
		}
		else if(this.rating >= 6)
		{
			return "This bicycle has been determined to be of good quality.";
		}
		else if(this.rating >= 3)
		{
			return "This bicycle has been determined to be of moderate quality.";
		}
		else
		{
			return "This bicycle has been determined to be of poor quality.";
		}
	}
	
	
	/* Method Name: toString
	 * Purpose: To provide a print statement that gives details for the Bicycle
	 * Accepts: N/A
	 * Returns: String
	 */
	@Override
	public String toString()
	{
		return super.toString() + "\nThis " + this.bicycleType + " " + this.getClass().getName().toLowerCase() + " has a rating of " + this.rating + ".";
	}
}
