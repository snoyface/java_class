/*
* Rolls 2 numbers and determines if you tie (same num), you lose (difference of 
*  1,3 or 5), or you win (difference of 2, 4, or 6)
* @author Jonathan MacLeod
* @version Nov 7, 2014
*/

import java.math.*;

class TwoRandom{

	public static void main ( String[] args){
		int a = rint (1,7);							//random number a
		int b = rint (1,7);							//random number b
		int diff = Math.abs (a-b);
		System.out.println("Number one is: " + a);
		System.out.println("Number two is: " + b);
		System.out.println ("The differnce is " + diff );

		if (diff == 0){
			System.out.println ("A Tie!");
		} else if (diff == 1 || diff == 3 || diff == 5){
			System.out.println ("You Lose!");
		} else {
			System.out.println ("You Win!");
		}


	}
	
	static int rint (int a, int b)					//inclusive random number
	{
	return a + (int) ( (b-a+1) * Math.random() );
	}
}