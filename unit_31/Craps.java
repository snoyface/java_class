/*
* Prints the rolls to a Craps game, rolls till the number is 4,5,6,7,8,9,10. 
* that is the players "point". Then continues to roll till either they 
* roll a 7 (lose), or they roll their "point" (win).
* @author Jonathan MacLeod
* @version Oct 31, 2014
* 
*/

import java.math.*;

class Craps
{
	public static void main (String [] args)
	{
		int one =   rint(1,6);   //first die
		int two =   rint(1,6);   //second die
		int total;               //total of both dice added together
		int point; 				 //the players point
		//if()
		System.out.print ("Computer rolls a " + one + " and a " + two);

		System.out.print (" , for a total of " + (one + two) + "\n");
	}

	static int rint (int a, int b)
	{
	return a + (int) ( (b-a+1) * Math.random() );
	}

}