
/**
     File: AllInclusive.java
     Author: Abdul Wahid Pathan
Description: This is the "AllInclusive" class which is the child class of "Resort". DescribeTrip() method is overridden here.


 */
public class AllInclusive extends Resort
{

	// Declaring private variables
	private int drinkLimit;
	private int diningFacilities;
	
	// Calling the constructor and passing values to super class.
	AllInclusive (String destination, int duration, String resortName, int unit, String unitType, int limit, int facilities, String[] activity)
	{
		super(destination, duration, resortName, "AllInclusive", unit, unitType, activity);
		this.drinkLimit = limit;
		this.diningFacilities = facilities;
		
	}
	
	// The Accessor methods
	public int getDrinkLimit ()
	{
		return this.drinkLimit;
	}
	
	public int getDiningFacilities ()
	{
		return this.diningFacilities;
	}
	
	// The Mutator methods
	public void setDrinkLimit(int drinkLimit) 
	{
	this.drinkLimit = drinkLimit;
	}
	
	public void setDiningFacilities(int diningFacilities) 
	{
	this.diningFacilities = diningFacilities;
	}
	
	
	/* Method Name: describeTrip
	 * Purpose: To provide description for the trip
	 * Accepts: N/A
	 * Returns: String
	 */
	@Override
	public String describeTrip()
	{
		return "\nThis is an " + this.getType() + " " + this.getClass().getSuperclass().getName() + " vacation.\nYou will be staying at the " + this.getResortName() + " resort which is located in " + this.getDestination() + " and will be provided with " + this.getDuration() + " days of relaxation." + 
					 "\nYour purchase provides for " + this.getDrinkLimit() + " alcoholic drinks per day and a choice of\n" + this.getDiningFacilities() + " fabulous dining facilities  with something for every palate.";
	}

}