
/**
       File: Cruise.java
	   Author: Abdul Wahid Pathan
Description: This is the "Cruise" class which is the child class of "Travel". DescribeTrip(), showAccomodations(), listActivities() methods are overridden here.
 */
public class Cruise extends Travel
{
	
	// Declaring private variables
	private String cruiseLine;
	private String shipName;
	private int roomNumber;
	private String accommodationType;
	
	//Calling the constructor and passing values to super class.
	Cruise(String destination, int duration, String cruiseLine, String shipName, int roomNumber, String accommodationType, String [] activity)
	{
		super(destination, "Cruise", duration, activity);
		this.cruiseLine = cruiseLine;
		this.shipName = shipName;
		this.roomNumber = roomNumber;
		this.accommodationType = accommodationType;
	}
	
	//Calling the constructor and passing values to super class.
	Cruise(String destination, String cruiseType, int duration, String cruiseLine, String shipName, int roomNumber, String accommodationType, String [] activity)
	{
		
		super(destination, cruiseType , duration, activity);
		this.cruiseLine = cruiseLine;
		this.shipName = shipName;
		this.roomNumber = roomNumber;
		this.accommodationType = accommodationType;
	}
	
	// The Accessor Methods
	public String getCruiseLine()
	{
		return this.cruiseLine;
	}
	
	public String getShipName()
	{
		return this.shipName;
	}
	
	public int getRoomNumber()
	{
		return this.roomNumber;
	}
	
	public String getAccommodationType()
	{
		return this.accommodationType;
	}
	
	// The mutator methods
	public void setCruiseLine(String cruiseLine)
	{
		this.cruiseLine = cruiseLine;
	}
	
	public void setShipName(String shipName)
	{
		this.shipName = shipName;
	}
	
	public void setRoomNumber(int roomNumber)
	{
		this.roomNumber = roomNumber;
	}
	
	public void setAccommodationType(String accommodationType)
	{
		this.accommodationType = accommodationType;
	}
	
	/* Method Name: describeTrip
	 * Purpose: To provide description for the trip
	 * Accepts: N/A
	 * Returns: String
	 */
	@Override
	public String describeTrip()
	{
		return "\nThe " + this.getShipName() + " belongs to the " + this.getCruiseLine() + " cruise line.\nThis ship is headed to " + this.getDestination() + " and is " + this.getDuration() + " days in duration.";
	}
	
	
	/* Method Name: showAccommodation
	 * Purpose: To provide description for the accommodation
	 * Accepts: N/A
	 * Returns: String
	 */
	@Override
	public String showAccommodation()
	{
		return "\nYou are booked into room #" + this.getRoomNumber() + " which is a " + this.getAccommodationType();
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
