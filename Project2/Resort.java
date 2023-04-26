
/**
       File: Resort.java
	   Author: Abdul Wahid Pathan
Description: This is the "Resort" class which is the child class of "Travel". DescribeTrip(), showAccomodations(), listActivities() methods are overridden here.
 */
public class Resort extends Travel
{
	
	// Declaring private variables
	private String resortName;
	private int unitNumber;
	private String unitType;
	
//Calling the constructor and passing values to super class.
	Resort(String destination, int duration, String resortName, int unit, String uType, String[] activities)
	{
		super(destination, "Resort", duration, activities);
		this.resortName = resortName;
		this.unitNumber = unit;
		this.unitType = uType;
	}
	
//Calling the constructor and passing values to super class.
	Resort(String destination, int duration, String resortName, String resortType, int unit, String uType, String[] activities)
	{
		super(destination, resortType, duration, activities);
		this.resortName = resortName;
		this.unitNumber = unit;
		this.unitType = uType;
	}
	
	// The Accessor methods
	public String getResortName()
	{
		return this.resortName;
	}
	
	public int getUnitNumber()
	{
		return this.unitNumber;
	}
	
	public String getUnitType()
	{
		return this.unitType;
	}
	
	// The Mutator methods
	public void setResortName(String resortName)
	{
		this.resortName = resortName;
	}
	
	public void setUnitNumber(int unitNumber)
	{
		this.unitNumber = unitNumber;
	}
	
	public void setUnitType(String unitType)
	{
		this.unitType = unitType;
	}
	
	/* Method Name: describeTrip
	 * Purpose: To provide description for the trip
	 * Accepts: N/A
	 * Returns: String
	 */
	@Override
	public String describeTrip()
	{
		return "\nThis is a " + this.getType() + " vacation.\nYou will be staying at the " + this.getResortName() + " resort which is located in " + this.getDestination() + " and will be provided with " + this.getDuration() + " days of relaxation.";
	}
	
	
	/* Method Name: showAcommodation
	 * Purpose: To provide description for the accommodation
	 * Accepts: N/A
	 * Returns: String
	 */
	@Override
	public String showAccommodation()
	{
		return "\nYou have been assigned to a(n) " + this.getUnitType() + " suite identified by Unit #" + this.getUnitNumber();
	}
	
	
	/* Method Name: listActivities
	 * Purpose: To print all the activities from the activity array
	 * Accepts: N/A
	 * Returns: N/A
	 */
	@Override
	public void listActivities()
	{
		System.out.println("");
		for(String i : super.getActivities())
		{
			System.out.println("\t" + i);
		}
	}
	
	
}
