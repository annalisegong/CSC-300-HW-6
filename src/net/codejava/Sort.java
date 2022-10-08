package net.codejava;

public class Sort 
{
	public static void bubble(int[] arr)
	{	
		int swaps = 0;
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr.length - i - 1 ; j++)
			{
				if(arr[j] > arr[j + 1])
				{
					swaps++;
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println("bubble swaps: " + swaps);
	}

	public static void insertion(int[] arr)
	{
		int swaps = 0;
		for(int i = 1; i < arr.length; i++)
		{
			int j = i;
			while(j > 0 && arr[j] < arr[j-1])
			{
				swaps++;
				int temp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = temp;
				j--;
			}
		}
		System.out.println("insertion swaps: " + swaps);
	}
	
	public static void selection(int[] arr)
	{
		int swaps = 0;
		for(int i = 0; i < arr.length -1; i++)
		{
			int smallestIndex = i;
			for(int j = i + 1; j < arr.length; j++)
			{
				if(arr[j] < arr[smallestIndex])
				{
					swaps++;
					smallestIndex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[smallestIndex];
			arr[smallestIndex] = temp;
		}
		System.out.println("selection swaps: " + swaps);
	}

	public static int insertInShell(int[] arr, int startIndex, int gap)
	{
		int swaps = 0;
		for(int i = startIndex + gap; i < arr.length; i = i + gap)
		{
			int j = i;
		
			while(j - gap >= startIndex && arr[j] < arr[j - gap])
			{
				swaps++;
				int temp = arr[j];
				arr[j] = arr[j - gap];
				arr[j-gap] = temp;
				j = j - gap;
			}
		}
		return swaps;
	}
	
	public static void shell(int[] arr, int[] gapValues)
	{
		int totalSwaps = 0;
		for(int g = 0; g < gapValues.length; g++)
		{
			int gapSwaps = 0;
			for(int i = 0; i < gapValues[g]; i++)
			{
				gapSwaps = gapSwaps + insertInShell(arr, i, gapValues[g]);
			}
			totalSwaps = totalSwaps + gapSwaps;
		}
		System.out.println("shell swaps: " + totalSwaps);
	}
}
