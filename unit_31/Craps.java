/*
* prints the rolls to a Craps game
* @author Jonathan MacLeod
* @version Oct 31, 2014
*/

import java.math.*;

class Craps
{
	public static void main (String [] args)
	{
		int one = rint(1,2);
		int two = rint(3,4);

		System.out.print ("Computer rolls a " + one + " and a " + two);
		System.out.print (" , for a total of " + (one + two) + "\n");
	}

	static int rint (int a, int b)
	{
	return a + (int) ( (b-a+1) * Math.random() );
	}

}