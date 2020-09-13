package ds.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
Problem  : Given an array of integers, move all zeros present in the array to the end
Author 	 : BK
Version	 : 1.0
Revision : 
*/

/*  Pseudocode : Given an array of integers, move all zeros present in the array to the end
 
Solution 1:
 
Step 1: Construct a 'input' array with only positive integers
Step 2: Sort the input array in ascending order order
Step 3: Convert the array into arraylist
Step 4: Reverse the sorted arraylist
Step 5: Print the sorted arraylist

Solution 2:

Step 1: Construct a 'input' array with both +ve and -ve integer values
Step 2: Initialize 'input' and 'temp' integer list with empty values
Step 3: Store all non-zero values into 'input' integer list and store all zero values into 'temp' integer list
Step 4  Add all values of 'temp' integer list into 'input' integer list
Step 5: Print the final output

*/
public class ZeroSortArray {
	
	public void zeroSort_solution1()
	{
		int arraysize;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of input values");
		arraysize = input.nextInt();
		int[] iparray = new int[arraysize];
		System.out.println("Enter the input values (Positive values only)");
		for(int i=0; i<arraysize; i++)
		{
			iparray[i] = input.nextInt();	
		} 
		Arrays.sort(iparray);                                                    //Array ascending sort
		System.out.println("Zero sorted Array");
		List<Integer> revlist =  new ArrayList<Integer>();
		for(int j:iparray)
		{
			revlist.add(j);
		}
		Collections.reverse(revlist);                                            //ArrayList reverse
		System.out.println(revlist);
	
	}
	
	public void zeroSort_solution2()
	{
		int[] iparray = {2,-1,0,-3,0,0,2,4};
		List<Integer> revlist =  new ArrayList<Integer>();
		List<Integer> zerolist =  new ArrayList<Integer>();
		for(int i:iparray)
		{
			if(i==0)
			{	
			zerolist.add(i);
			}
			else
			{
			revlist.add(i);
			}
		}
		revlist.addAll(zerolist);                                       			// List maintains insertion order
		System.out.println(revlist);
	}
	
	public static void main(String[] args) {
			
		ZeroSortArray object = new ZeroSortArray();
		//object.zeroSort_solution1();
		object.zeroSort_solution2();

	}

}
