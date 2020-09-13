package ds.problems;

import java.util.Arrays;
import java.util.Scanner;

/*
Problem  : Find the maximum product of two integers in an array
Author 	 : BK
Version	 : 1.1
Revision : Update 1.1 - Added Solution 2
*/

/*  Pseudocode : Find the maximum product of two integers in an array
 
Solution 1:
 
Step 1: Construct a 'input' array with more than two integers
Step 2: Initialize 'max' and 'temp' Integer
Step 3: Begin Loop 1 with variable 'i' to go through all 'input' values
		Begin Loop 2 with variable 'j' to go through all 'input' values
			Multiply input[i] and input[j] 
			Store the product to temp
			if temp > max
				Store temp to max
			End if
		End Loop 2
		End Loop 1		
Step 4: Print the max value

Solution 2:

Step 1: Construct a 'input' array with more than two integers
Step 2: Sort the input array in ascending order
Step 3: Multiply the last two values in the array and store the output
Step 4: Print the product output

*/
public class MaxProductArray {
	
	public void maxProduct_solution1()
	{
		int max=0, temp, arraysize;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of input values");
		arraysize = input.nextInt();
		int[] iparray = new int[arraysize];
		System.out.println("Enter the input values");
		for(int i=0; i<arraysize; i++)
		{
			iparray[i] = input.nextInt();
		}
		for(int j:iparray)
		{
			for(int k=0;k<arraysize-1;k++)	
			{
				temp = j*iparray[k];                     				 		 	// All product combinations in an array
				if(temp>max)							 				 			 // Comparing all product combinations and finding the maximum value
				{
					max=temp;
				}
			}
		}
		System.out.println("Maxium product value of an input array "+max);
	}
	
	public void maxProduct_solution2()
	{
		int output, arraysize;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of input values");
		arraysize = input.nextInt();
		int[] iparray = new int[arraysize];
		System.out.println("Enter the input values");
		for(int i=0; i<arraysize; i++)
		{
			iparray[i] = input.nextInt();
		}
		Arrays.sort(iparray);														//Sorting the array values in ascending order
		output = iparray[arraysize-1]*iparray[arraysize-2];							// Product of highest two values in the i/p array
		System.out.println("Maxium product value of an input array "+output);
	}
	
	public static void main(String[] args) {
			
		MaxProductArray object = new MaxProductArray();
		object.maxProduct_solution1();
		object.maxProduct_solution2();
	}

}
