package net.codejava;

public class Main 
{
	public static void main(String[] args) 
	{
		int[] bNumbers = {9,2,4,1,5,8,6};
		Sort.bubble(bNumbers);
		for(int i = 0; i < bNumbers.length; i++) 
		{
			System.out.print(bNumbers[i]);
		}
		
		System.out.println();
		System.out.println();

		
		int[] iNumbers = {9,2,4,1,5,8,6};
		Sort.insertion(iNumbers);
		for(int i = 0; i < iNumbers.length; i++) 
		{
			System.out.print(iNumbers[i]);
		}
		
		System.out.println();
		System.out.println();

		int[] sNumbers = {9,2,4,1,5,8,6};
		Sort.selection(sNumbers);
		for(int i = 0; i < sNumbers.length; i++) 
		{
			System.out.print(sNumbers[i]);
		}
		
		System.out.println();
		System.out.println();


		int[] ssNumbers = {9,2,4,1,5,8,6};
		int[] gapValues = {2,1};
		Sort.shell(ssNumbers, gapValues);
		for(int i = 0; i < ssNumbers.length; i++) 
		{
			System.out.print(ssNumbers[i]);
		}
	}
}