import java.util.*;

public class Main 
{
	public static void main(String[] args) 
	{
		int input;
		int stats;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to the Stats Program!");
		System.out.println();
		System.out.println("Enter sample size: ");
		int sampleSize = keyboard.nextInt();
		System.out.println("What is the sample set's minimum? ");
		int min = keyboard.nextInt();
		System.out.println("What is the sample set's maximum? ");
		int max = keyboard.nextInt();
		
		Stats g = new Stats();
		System.out.println("Main Menu");
		System.out.println();
		System.out.println("1) Get max value");
		System.out.println("2) Get min value");
		System.out.println("3) Get the mean");
		System.out.println("4) Get the mode");
		System.out.println("5) Get the count of even numbers");
		System.out.println("6) Get the count of odd numbers");
		System.out.println("7) Display the sample set");
		System.out.println("8) Return the count of numbers in the sample set that match the input parameter");
		System.out.println("9) Exit");
		System.out.println();
		stats = keyboard.nextInt();
		
		//Constructor: use an RNG to generate sampleSize integers between minValue and maxValue. Store the numbers in an array named 'data'.
		Random rand = new Random();
		int[] data = new int[sampleSize];
		for (int i = 0; i < sampleSize; i++)
			data[i] = rand.nextInt((max - min + 1) + min);
		
		while (stats != 9)
		{
			if (stats == 1)
			{
				g.getMax(sampleSize, data);
				System.out.println("Max is: " + g.getMax(sampleSize, data));
				System.out.println();
			}
			else if (stats == 2)
			{
				g.getMin(sampleSize, data);
				System.out.println("Min is: " + g.getMin(sampleSize, data));
				System.out.println();
			}
			else if (stats == 3)
			{
				g.getAve(sampleSize, data);
				System.out.println("Mean is: " + g.getAve(sampleSize, data));
				System.out.println();
			}
			else if (stats == 4)
			{
				g.getMode(sampleSize, data);
				System.out.println("Mode is: " + g.getMode(sampleSize, data));
				System.out.println();
			}
			else if (stats == 5)
			{
				g.getEven(sampleSize, data);
				System.out.println("Even count is: " + g.getEven(sampleSize, data));
				System.out.println();
			}
			else if (stats == 6)
			{
				g.getOdd(sampleSize, data);
				System.out.println("Odd count is: " + g.getOdd(sampleSize, data));
				System.out.println();
			}
			else if (stats == 7)
			{
				g.displaySampleSet(sampleSize, data);
				System.out.println();
			}
			else if (stats == 8)
			{
				System.out.println("What number are you looking for? ");
				int match = keyboard.nextInt();
				System.out.println("There are " + g.countMatching(match, sampleSize, data) + " of that number");
				System.out.println();
			}
			
		System.out.println("");
		System.out.println("View other stats?");
		System.out.println("");
		System.out.println("1) Max 2) Min 3) Mean 4) Mode 5) Count of evens 6) Count of odds 7) Sample set numbers 8) Count of numbers that match input parameter 9) Exit");
		stats = keyboard.nextInt();
		}
		System.out.println("Thank you for using the Stats Program. See you next time!");
	}

}
