// RepeatedDigits.java
/*
* 	Takes an input int value, and returns how many times
*   ints 1-9 are in the input value
*	@author Jonathan MacLeod
* 	@last_modified dec 8, 2014
*/

import java.util.*;

class RepeatedDigits
{
	public static void main(String[]args)
	{
		//ask user to input numbers
		System.out.println("Let's count the numbers!");
		System.out.println("Please enter an integer: ");
		
		//assign user input to an int
		Scanner keyboard = new Scanner (System.in);
		int integer = keyboard.nextInt();

		//is the integer negative? fix that first!
		if (integer < 0)
		{
			integer = integer * -1;
		}

		//create array for 0-9
		int[] array = new int[10];

		//send to countInt for each number.
		for (int i = 0; i < 10; i++)
		{
			array[i] = countInt( i , integer);
		}

		//create string for digits, print
		String digits = "Digits:       0 1 2 3 4 5 6 7 8 9";
		System.out.println(digits);

		//create string for occurrences, pring
		String countdigits = "Occurrences: ";
		for (int i = 0; i < array.length; i++)
		{
			countdigits += " " + array[i];
		}
		System.out.println(countdigits);
	}

	public static int countInt(int i, int integer)
	//takes the int and deducts 10 to see if any part is the current
	//int to look for. If yes, then add to count. return
	{
		int count = 0;
		while (integer > 0)
		{
			if (integer % 10 == i)
			{
				count++;
			}
			integer /= 10;
		}
		return count;
	}
}