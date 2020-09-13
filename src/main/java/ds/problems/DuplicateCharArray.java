package ds.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
Problem  : Find duplicate element in a character array
Author 	 : BK
Version	 : 1.1
Revision : Update 1.1 - Revisiting solution 2
*/

/*  Pseudocode : Find duplicate element in a character array
 
Solution 1:
 
Step 1: Construct a 'input' character array 
Step 2: Initialize a 'output' character HashSet
Step 3: Compare all the characters inside the 'input' array 
Step 4: Store the duplicate characters in the 'output' character HashSet
Step 5: Print the 'output' character HashSet

Solution 2:

Step 1: Construct a 'input' character array 
Step 2: Initialize a 'unique' character HashMap
Step 3: Through Loop, Compare 'input' character array with contents of 'unique' HashMap
Step 4  If not present, Add the characters into the 'unique' HashMap
Step 5: If already present, Print the duplicated characters in the array

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
				if(input[i]==input[j])                                              // After Character comparison, All duplicated values are stored in HashSet
				{
					output.add(input[i]);                       				  
				}
			}
		}
		System.out.println("Duplicated characters are "+output);
	}
	
	public void duplicateChar_solution2()
	{
		char[] input = {'b','c','d','k','c','m','n','k','n'};
		int count=0;
		Map<Character, Integer> unique = new HashMap<>();
		System.out.print("Duplicated Characters: ");			
		for(char i:input)
		{
			if(unique.containsKey(i))                                              // Comparing input character array with Non-Duplicate HashMap
			{				
				System.out.print(i+" ");				
			}
			else
			{
				unique.put(i,count);											  
				count++;
			}		
		}      
	}
	
	public static void main(String[] args) {
			
		DuplicateCharArray object = new DuplicateCharArray();
		//object.duplicateChar_solution1();
		object.duplicateChar_solution2();

	}

}
