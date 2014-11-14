// SeasonTest.java
/** 
* Takes two intergers representing month and year and returns
* a String as to what time of season it is
*
* @author Jonathan MacLeod
* @version Last_Modified: Nov 13th, 2014
*/
import java.util.*;

class SeasonTest
{
	public static void main (String [] args)
	{
		String theSeason;								//will be used to setup the season return

		System.out.println("Let's figure out the Seasons! ")

		Scanner keyboard = new Scanner (System.in);						//input the month
		System.out.println("Please enter the month (listed 1-12): ");
		int m = keyboard.nextInt();

		Scanner keyboard = new Scanner (System.in);						//inputs the month
		System.out.println("Please enter the day (listed 1-31): ");
		int d = keyboard.nextInt();

		theSeason = season(m, n);

		System.out.println("The season is " + theSeason);
	}

	public static season(int m, int d)
	{
		
	}
}