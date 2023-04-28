
/**
       File: Automobile.java
	   Author: Abdul Wahid Pathan
       Date: Apr 17, 2023 12:04:20 p.m.
Description: This is the automobile class, It is a child class of Vehicle. All the methods are being
						 overridden here and properties specific to automobile are created here as well.
 */
public class Automobile extends Vehicle
{
	// Declaring variables
	private String engine;
	private int horsepower;
	
	// one-arg constructor
	public Automobile(String engine, int hPower)
	{
		super("Automobile");
		this.engine = engine;
		this.horsepower = hPower;
	}
	
	// four-args constructor
	public Automobile(String engine, int hPower, String make, String model)
	{
		super("Automobile", make, model);
		this.engine = engine;
		this.horsepower = hPower;
	}
	
	// All getters
	public String getEngine()
	{
		return this.engine;
	}
	
	public int getHP()
	{
		return this.horsepower;
	}
	
	// All setters
	public void setEngine(String engine)
	{
		this.engine = engine;
	}
	
	public void setHP(int hPower)
	{
		this.horsepower = hPower;
	}
	
	/* Method Name: describeVehicle
	 * Purpose: To provide description for the Automobile
	 * Accepts: N/A
	 * Returns: String
	 */
	@Override
	public String describeVehicle()
	{
		return "This vehicle is a(n) " + this.getMake() + " make and " + this.getModel() + 
				   " model which is powered by a " +this.horsepower+ " horsepower, " + this.getEngine() + " engine.";

	}

	/* Method Name: rateQuality
	 * Purpose: To rate the quality of the Automobile
	 * Accepts: N/A
	 * Returns: String
	 */
	@Override
	public String rateQuality()
	{
		if(this.horsepower >= 250)
		{
			return "This quality of this " + this.getMake() + ", " + this.getModel() + " is considered great.";
		}
		else if(this.horsepower >= 200)
		{
			return "This quality of this " + this.getMake() + ", " + this.getModel() + " is considered good.";
		}
		else if(this.horsepower >= 150 )
		{
			return "This quality of this " + this.getMake() + ", " + this.getModel() + " is considered standard.";
		}
		else
		{
			return "This quality of this " + this.getMake() + ", " + this.getModel() + " is considered sub-standard.";
		}
	}
	
	
	/* Method Name: toString
	 * Purpose: To provide a print statement that gives details for the Automobile
	 * Accepts: N/A
	 * Returns: String
	 */
	@Override
	public String toString()
	{
		return super.toString() + "\nThis " + this.getClass().getName().toLowerCase() + " has a(n) " + this.engine + " engine with " + this.horsepower + " horsepower.";
	}
}
