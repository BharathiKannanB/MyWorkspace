package ds.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/*
Problem  : Find duplicate element in a character array
Author 	 : BK
Version	 : 1.0
Revision : 
*/

/*  Pseudocode : Find duplicate element in a character array
 
Solution 1:
 
Step 1: Construct a 'input' character array 
Step 2: Initalize a 'output' character Hashset
Step 3: Compare all the characters inside the 'input' array through for loop 
Step 4: Duplicate characters will be stored in the 'output' character HashSet
Step 5: Print the 'output' character hashset

Solution 2:

Step 1: Construct a 'input' array with both +ve and -ve integer values
Step 2: Initialize 'input' and 'temp' integer list with empty values
Step 3: Store all non-zero values into 'input' integer list and store all zero values into 'temp' integer list
Step 4  Add all values of 'temp' integer list into 'input' integer list
Step 5: Print the final output

*/
public class DuplicateCharArray {
	
	public void duplicateChar_solution1()
	{
		char[] input = {'b','c','d','k','c','m','n','k'};
		Set<Character> output = new HashSet<Character>();
		for(int i = 0;i<input.length-1;i++)
		{
			for(int j = i+1;j<input.length;j++)	
			{
				if(input[i]==input[j])
				{
					output.add(input[i]);                       				    // Set variable stores only unique values 
				}
			}
		}
		System.out.println("Duplicated characters are "+output);
	}
	
	public void duplicateChar_solution2()
	{
		char[] input = {'b','c','d','k','c','m','n','k'};
		int size = input.length;
		int count[] = new int[size]; 
        int i; 
  
        System.out.println("Repeated elements are : "); 
        for (i = 0; i < size; i++)  
        { 
            if (count[input[i]] == 1) 
                System.out.print(input[i] + " "); 
            else
                count[input[i]]++; 
        } 
	}
	
	public static void main(String[] args) {
			
		DuplicateCharArray object = new DuplicateCharArray();
		//object.duplicateChar_solution1();
		object.duplicateChar_solution2();

	}

}
