package marathon;

import java.util.Scanner;

public class Marathon 
{

	public static void main(String args[])
	{
		String name;
		float distance;
		int hours;
		int minutes;
		int seconds;
		float pace;
		int paceMinutes;
		int paceSeconds;
		double marathontime;
		int marathonHours;
		int marathonMinutes;
		int marathonSeconds;
		double tenKtime;
		int tenKHours;
		int tenKMinutes;
		int tenKSeconds;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("What is your first name?");
		name = in.nextLine();
		
		System.out.println("How many miles did you run today?");
		distance = in.nextFloat();
		
		System.out.println("How many hours did it take?");
		hours = in.nextInt();
		System.out.println("Minutes?");
		minutes = in.nextInt();
		System.out.println("Seconds?");
		seconds = in.nextInt();
		
		pace = ((hours* 60) + minutes + seconds/60) / distance;
		paceMinutes = (int)pace;
		paceSeconds = (int)((pace-paceMinutes)*60);
		
		
		marathontime = (26.2*((hours * 60 + minutes + seconds/60) / distance))/60;
		marathonHours = (int)(marathontime);
		marathonMinutes = (int)((marathontime-marathonHours)*60);
		marathonSeconds = (int)((((marathontime-marathonHours)*60)-(marathonMinutes))*60);
		
		tenKtime = (6.21*((hours * 60 + minutes + seconds/60) / distance))/60;
		tenKHours = (int)(tenKtime);
		tenKMinutes = (int)((tenKtime-tenKHours)*60);
		tenKSeconds = (int)((((tenKtime-tenKHours)*60)-(tenKMinutes))*60);
		
		System.out.println("Hi, " +name);
		System.out.println("Your pace is "+paceMinutes+":"+paceSeconds+"");
		System.out.println("At this rate, your marathon time would be "+marathonHours+":"+marathonMinutes+":"+marathonSeconds+"");
		System.out.println("and your 10K time would be "+tenKHours+":"+tenKMinutes+":"+tenKSeconds+"");
		System.out.println("Good luck with your training!");
 
	}	
}
