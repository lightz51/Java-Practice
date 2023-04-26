
/**
       File: TripDetails.java
	   Author: Abdul Wahid Pathan
Description: This is the main tester method for this travel agency program. All objects required are created and intantiated here and all the
						 output is formatted here in this class.
 */
public class TripDetails
{

	public static void main(String[] args)
	{
	
		// Creating activities array.
		String [] cruiseActivitiesArray = {"3 Pools", "Mini golf", "4 hot tubs", "Basketball court", "4 shuffle board play areas", "Library", "Fitness centre", "Spa", "3 waterslides", "Arcade", "Theatre", "Bingo"};
		String [] riverCruiseActivitiesArray = {"Pool", "2 hot tubs", "Library", "Spa", "Bingo", "Comedy club"};
		String [] resortActivitiesArray = {"5 Pools", "Golf course", "6 hot tubs", "Tennis court", "Shuffle board", "Horse shoes", "Fitness centre", "Archery", "Water sports"};
		String [] allInclusiveActivitiesArray = {"2 Pools", "Mini golf", "Gold course", "Hot tub", "Basketball court", "Fitness centre", "Spa", "Waterslides", "Movie theatre", "Bingo", "Water sports", "Island tours"};
		
		// Instantiating all Objects
		Cruise cruiseObject = new Cruise("Carribean", 9, "Carnival", "Magic", 7078, "Balcony", cruiseActivitiesArray);
		RiverCruise riverObject = new RiverCruise("Europe", 14, "Avalon", "Envision", 3014, "River view", "Rhine", riverCruiseActivitiesArray);
		Resort resortObject = new Resort("Dominican Republic", 7, "Swindles", 14, "Junior", resortActivitiesArray);
		AllInclusive inclusiveObject = new AllInclusive("Tahiti", 14, "SunDrench", 35, "Family", 14, 10, allInclusiveActivitiesArray);
		
		// Accessing each Accessor method for each class
		System.out.println("\t\t\t\tWelcome to the Fanshawe Travel Agency");
		System.out.println("\t\t\t\t*************************************");
		System.out.println("\nWe have researched four fabulous vacation getaways for you and now offer them to you for your perusal.");
		System.out.println("\n=======================================================================");
		System.out.println("\nHere are the details for your " + cruiseObject.getType() + " selection:");
		System.out.println("\nDestination: " + cruiseObject.getDestination());
		System.out.println("CruiseLine: " + cruiseObject.getCruiseLine());
		System.out.println("Ship Name: " + cruiseObject.getShipName());
		System.out.println("Cruise duration: " + cruiseObject.getDuration() + " days");
		System.out.println("Accomodation Type: " + cruiseObject.getAccommodationType());
		System.out.println("Your Room number: " + cruiseObject.getRoomNumber());
		System.out.println("\nHere is the list of activities for your selection: ");
		for(String i : cruiseObject.getActivities())
		{
			System.out.println("\t" + i);
		}
		
		System.out.println("\n=======================================================================");
		System.out.println("\nHere are the details for your " + riverObject.getType() + " selection:");
		System.out.println("\nDestination: " + riverObject.getDestination());
		System.out.println("River: " + riverObject.getRiver());
		System.out.println("CruiseLine: " + riverObject.getCruiseLine());
		System.out.println("Ship Name: " + riverObject.getShipName());
		System.out.println("Cruise duration: " + riverObject.getDuration() + " days");
		System.out.println("Accomodation Type: " + riverObject.getAccommodationType());
		System.out.println("Your Room number: " + riverObject.getRoomNumber());
		System.out.println("\nHere is the list of activities for your selection: ");
		for(String i : riverObject.getActivities())
		{
			System.out.println("\t" + i);
		}
		
		System.out.println("\n=======================================================================");
		System.out.println("\nHere are the details for your " + resortObject.getType() + " selection:");
		System.out.println("\nDestination: " + resortObject.getDestination());
		System.out.println("Resort Name: " + resortObject.getResortName());
		System.out.println("Unit Type: " + resortObject.getUnitType());
		System.out.println("Your Unit Number: " + resortObject.getUnitNumber());
		System.out.println("Vacation duration: " + resortObject.getDuration() + " days");
		System.out.println("\nHere is the list of activities for your selection: ");
		for(String i : resortObject.getActivities())
		{
			System.out.println("\t" + i);
		}
		
		System.out.println("\n=======================================================================");
		System.out.println("\nHere are the details for your " + inclusiveObject.getType() + " resort selection:");
		System.out.println("\nDestination: " + inclusiveObject.getDestination());
		System.out.println("Resort Name: " + inclusiveObject.getResortName());
		System.out.println("Unit Type: " + inclusiveObject.getUnitType());
		System.out.println("Your Unit Number: " + inclusiveObject.getUnitNumber());
		System.out.println("Vacation duration: " + inclusiveObject.getDuration() + " days");
		System.out.println("Dining Facilities: " + inclusiveObject.getDiningFacilities());
		System.out.println("Drink Limit: " + inclusiveObject.getDrinkLimit());
		System.out.println("\nHere is the list of activities for your selection: ");
		for(String i : inclusiveObject.getActivities())
		{
			System.out.println("\t" + i);
		}
		
		// Changing the resort object using setter methods
		resortObject.setDestination("Jamaica");
		resortObject.setDuration(21);
		resortObject.setResortName("Sandals");
		resortObject.setUnitNumber(42);
		resortObject.setUnitType("Studio");
		
		// Displaying the change by recalling the accessor objects
		System.out.println("\n=======================================================================");
		System.out.println("\nWe have updated " + resortObject.getType() + " vacation and present it for your consideration:");
		System.out.println("We hope you like the changes we made:");
		System.out.println("\nDestination: " + resortObject.getDestination());
		System.out.println("Resort Name: " + resortObject.getResortName());
		System.out.println("Unit Type: " + resortObject.getUnitType());
		System.out.println("Your Unit Number: " + resortObject.getUnitNumber());
		System.out.println("Vacation duration: " + resortObject.getDuration() + " days");
		System.out.println("\n=======================================================================");
		
		// Creating Travel array and objects and displaying polymorphic behaviour.
		Travel [] vacations = new Travel[4];
		vacations[0] = cruiseObject;
		vacations[1] = riverObject;
		vacations[2] = resortObject;
		vacations[3] = inclusiveObject;
		for(int i = 0; i < vacations.length;i++)
		{
			System.out.println(vacations[i].describeTrip());
			System.out.println(vacations[i].showAccommodation());
			
			if(vacations[i] instanceof AllInclusive)
			{
				System.out.println("\nHere are the activities available on the " + inclusiveObject.getResortName() + " resort in " + inclusiveObject.getDestination());
			}
			else if(vacations[i] instanceof Resort)
			{
				System.out.println("\nHere are the activities available on the " + resortObject.getResortName() + " resort in " + resortObject.getDestination());
			}
			else if(vacations[i] instanceof RiverCruise)
			{
				System.out.println("\nHere are the activities on board the " + riverObject.getCruiseLine() + " " + riverObject.getShipName());
			}
			else
			{
				System.out.println("\nHere are the activities on board the " + cruiseObject.getCruiseLine() + " " + cruiseObject.getShipName());
			}
			vacations[i].listActivities();
			System.out.println("\n=======================================================================");;
		}
		
		// Adding an activity to the Rivercruise Object. Also proving the addition.
		riverObject.addActivity("Games room");
		System.out.println("Please be advised that the " + riverObject.getClass().getName() + " vacation has added an additional activity:");
		System.out.println("Please note the addition in the following list of activities available to you:");
		System.out.println("\nHere are the activities available on board the " + riverObject.getCruiseLine() + " " + riverObject.getShipName() + ":");
		riverObject.listActivities();
		
		// Removing an activity frim the inclusive Object. Also proving the deletion.
		System.out.println("\n=======================================================================");
		inclusiveObject.removeActivity("hot tub");
		System.out.println("Please be advised that the " + inclusiveObject.getClass().getName() + " " + inclusiveObject.getClass().getSuperclass().getName() + " vacation has removed one of its activities:");
		System.out.println("Please note the reduced number of activities available to you:");
		System.out.println("\nHere are the activities available to you at the " + inclusiveObject.getResortName() + " resort in " + inclusiveObject.getDestination() + ":");
		inclusiveObject.listActivities();
		
		// End statements
		System.out.println("\nThank you for contacting Fanshawe Travel Agency.");
		System.out.println("We believe we have put together some amazing vacations for your enjoyment.");
		System.out.println("Please Contact us if you would like to book one of these exciting opportunities.");
		System.out.println("\n******************************End of Program******************************");

	}

}
