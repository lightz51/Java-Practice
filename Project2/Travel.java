
/**
     File: Travel.java
     Author: Abdul Wahid Pathan
Description: This is the "Travel" class which is the direct parent class of "Cruise" and "Resort"
						 and indirect parent class of "RiverCruise" and "AllInclusive" classes.
						 DescribeTrip() method is overridden here. 
*/


public abstract class Travel
{
	
	// Declaring private variables and an array.
	private String destination;
	private String type;
	private int duration;
	private String [] activities;
	
	//Calling the constructor and catching values in parameter.
	Travel(String destination, String type, int duration, String [] activities)
	{
		this.destination = destination;
		this.type = type;
		this.duration = duration;
		this.activities = activities;
	}
	
	// The Accessor methods
	public String getDestination ()
	{
		return this.destination;
	}
	
	public String getType()
	{
		return this.type;
	}
	
	public int getDuration()
	{
		return this.duration;
	}
	
	public String [] getActivities()
	{
		return this.activities;
	}

	// The Mutator methods
	public void setDestination(String destination) 
	{
		this.destination = destination;
	}
		
	public void setType(String type) 
	{
		this.type = type;
	}
	
	public void setDuration(int duration ) 
	{
		this.duration = duration;
	}
	
	/* Method Name: addActivity
	 * Purpose: To add an activity to the activity array.
	 * Accepts: String
	 * Returns: N/A
	 */
	public void addActivity (String activity)
	{
			String [] holdArray = new String[activities.length + 1];
			
			for(int index = 0; index < activities.length; index++)
			{
				holdArray[index] = activities[index];
			}
			
			holdArray[holdArray.length - 1] = activity;
			
			this.activities= holdArray;
	}
		
	/* Method Name: removeActivity
	 * Purpose: To remove an activity from the activity array.
	 * Accepts: String
	 * Returns: N/A
	 */
	public void removeActivity(String activity)
	{
			boolean flag = false;
			
			for(int index = 0; index < activities.length; index++)
			{
				if(activities[index].equalsIgnoreCase(activity))
				{
					flag = true;
					break;
				}
			}
			
			if(flag == true)
			{
				String [] holdArray = new String[activities.length - 1];
				int counter = 0;
				
				for(int index = 0; index < activities.length; index++)
				{
					if(!this.activities[index].equalsIgnoreCase(activity))
					{
						holdArray[counter] = activities[index];
						
						counter++;
					}
				}
				
				this.activities = holdArray;
			}
			else
			{
				System.out.println("Sorry, you do not have a activity called " + activity  +
						               " in your activity list.");		
			}
		
	}

	/* Method Name: describeTrip
	 * Purpose: To provide description for the trip
	 * Accepts: N/A
	 * Returns: String
	 */
	public abstract String describeTrip ();
	
	
	/* Method Name: showAccommodation
	 * Purpose: To provide description for the accommodation
	 * Accepts: N/A
	 * Returns: String
	 */
	public abstract String showAccommodation();
	
	
	/* Method Name: listActivities
	 * Purpose: To print out all the activities in the activity array
	 * Accepts: N/A
	 * Returns: N/A
	 */
	public abstract void listActivities();
	
}