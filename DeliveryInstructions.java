import java.util.Scanner;
public class DeliveryInstructions
{

	

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your User id: ");
		final int USER_ID = input.nextInt();
		
		if(USER_ID == 99)
		{
			System.out.println("Please enter weight of package in kg: ");
			int weight = input.nextInt();
			
			System.out.println("Please enter length of package in cm: ");
			int length = input.nextInt();
			
			System.out.println("Please enter width of package in cm: ");
			int width = input.nextInt();
			
			System.out.println("Please enter height of package in cm: ");
			int height = input.nextInt();
			
			int volume = length * weight * height;
			System.out.println(volume);
			
			double volumeInMeters =(double)volume/1000000;
			System.out.println(volumeInMeters);
			
			volumeInMeters *= 100;
			int value = (int)volumeInMeters;
			System.out.println(value);
			
			value /= 100;
			volumeInMeters = (double)value;
			System.out.println(value);
		}
		else
		{
			System.out.println("Sorry, you are not authorized.");
		}

	}

}
