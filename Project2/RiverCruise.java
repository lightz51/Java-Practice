
/**
     File: RiverCruise.java
     Author: Abdul Wahid Pathan
Description: This is the "RiverCruise" class which is the child class of "Cruise". DescribeTrip() method is overridden here.
*/
public class RiverCruise extends Cruise
{
	// Declaring a private variable
	private String river; 

//Calling the constructor and passing values to super class.
	RiverCruise(String destination, int duration, String cruiseLine, String shipName, int roomNumber, String accommodationType, String river, String[] activity)
	{
		super(destination, "River cruise", duration, cruiseLine, shipName, roomNumber, accommodationType, activity);
		this.river = river;

	}

	// The Accessor method
	public String getRiver()
	{
		return this.river;
	}

	// The mutator method    
	public void setRiver(String river)
	{
		this.river = river;
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
}