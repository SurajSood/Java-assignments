import java.util.Random;

public class Stats extends Main
{
	int sampleSize;
	double count;
	double ave;
	double sum;
	int min;
	int max;
	int mode;
	int evenCount;
	int oddCount;
	int countMatching;
	int counter;
	int match;
	
	//Method: return the sample set's max value
	public int getMax(int sampleSize, int[] data)
	{
		max = data[0];
		for(int i = 1; i < sampleSize; i++)
		{
			if (data[i] > max)
				max = data[i];
		}
		return max;
	}
	//Method: return the min value
	public int getMin(int sampleSize, int[] data)
	{
		min = data[0];
		for(int i = 1; i < sampleSize; i++)
		{
			if (data[i] < min)
				min = data[i];
		}
		return min;
	}
	//Method: return the average value
	public double getAve(int sampleSize, int[] data)
	{
		count = sampleSize;
		sum = 0;
		for(int i = 0; i < sampleSize; i++)
		{
			sum = sum + data[i];
		}
		ave = sum / count;
		return ave;
	}
	//Method: return the mode; in case of a tie, choose the smallest value
	public int getMode(int sampleSize, int[] data)
	{
		int popularity1 = 0;
		int popularity2 = 0;
		int array_item;
		for(int i = 0; i < sampleSize; i++)
		{
			 array_item = data[i];
			 for(int j = 0; j < sampleSize; j++)
			 {
				if(array_item == data[j])
					 popularity1++;
			 }
			    if(popularity1 >= popularity2)
			      {
			      mode = array_item;
			      popularity2 = popularity1;
			      }
		}
		return mode;
	}
	//Method: return the count of even numbers
	public int getEven(int sampleSize, int[] data)
	{
		int evenCount = 0;
		for (int i = 0; i < sampleSize; i++)
		{
			if (data[i] % 2 == 0)
				evenCount++;
		}
		return evenCount;
	}
	//Method: return the count of odd numbers
	public int getOdd(int sampleSize, int[] data)
	{
		int oddCount = 0;
		for (int i = 0; i < sampleSize; i++)
		{
			if (data[i] % 2 != 0)
				oddCount++;
		}
		return oddCount;
	}
	//Display all numbers, formatted in columns (hint: pg. 158)
	public void displaySampleSet(int sampleSize, int[] data)
	{
		int counter = 0;
		for(int i = 0; i < sampleSize; i++)
		{
			System.out.print(" ");
			System.out.print(data[i]);
			counter++;
			if (counter % 20 == 0)
				System.out.println();
		}
	}
	//Return the count of numbers in the sample set that match the input parameter
	public int countMatching(int match, int sampleSize, int []data)
	{
		for(int i = 0; i < sampleSize; i++)
		{
		if (match == data[i])
		counter++;
		}
		return counter;
	}
	//Create a list of private variable(s) that belong to the Stats class
	private int[] data;
	
}
