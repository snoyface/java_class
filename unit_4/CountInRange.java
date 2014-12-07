//CountInRange.java

/* 
* Takes in an array of ints, and a max and min value
* counts and returns # of values in btw.
*
* @author Jonathan MacLeod
* @version last_modified Dec 6, 2014
*
*/

import java.util.*;

class CountInRange
{
	public static void main (String [] args)
	{
		int[] count = {14, 1, 7, 22, 17, 36, 7, -43, 5, 6, 7, 8};
		int min = 5;
		int max = 17;

		System.out.println("the amount of ints between " + min + " and " 
			+ max + " is " + countInRange(count, min, max));

	}

	public static int countInRange (int [] list, int min, int max)  
	//goes through array and counts # btw min and max, returns
	{
		int count = 0;					//amount to return to main

		for (int i = 0; i < list.length; i++)
		{
			int temp = list[i];			//where are we in the array?

			for (int a = min; a <= max; a++)
			{
				if (a == temp) count = count + 1;
			}
		}	

		return count;

	}
}