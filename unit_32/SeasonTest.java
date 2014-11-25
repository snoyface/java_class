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

		System.out.println("Let's figure out the Seasons! ");

		Scanner keyboard = new Scanner (System.in);						//input the month
		System.out.println("Please enter the month (listed 1-12): ");
		int m = keyboard.nextInt();
					
		System.out.println("Please enter the day (listed 1-31): ");		//inputs the day
		int d = keyboard.nextInt();

		theSeason = season(m, d);

		System.out.println("The season is: " + theSeason);
	}

	public static String season(int m, int d) //takes month and day and figures out season
	{
		int month = m;
		int day = d;

		if (month < 3)	//is it only winter? stop here
		{
			return "Winter";
		}else if (month < 4)	//is it winter? or spring?
			{
				switch (day)
				{
					case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10: 
					case 11: case 12: case 13: case 14: case 15: 
						return "Winter";
					case 16: case 17: case 18: case 19: case 20: case 21: case 22: case 23: case 24: 
					case 25: case 26: case 27: case 28: case 29: case 30: case 31:
						return "Spring";
					default: throw new RuntimeException("unreachable");
				}
			}else if (month < 6) //is it only spring?
				{
					return "Spring";
				}else if (month < 7) //is it spring, or summer?
					{
						switch (day)
						{
							case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10: 
							case 11: case 12: case 13: case 14: case 15: 
								return "Spring";
							case 16: case 17: case 18: case 19: case 20: case 21: case 22: case 23: case 24: 
							case 25: case 26: case 27: case 28: case 29: case 30: case 31:
								return "Summer";
							default: throw new RuntimeException("unreachable");
						}
					}else if (month < 9) //is it just summer?
						{
							return "Summer";
						}else if (month < 10) //is it summer or fall?
							{
								switch (day)
								{
								case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10: 
								case 11: case 12: case 13: case 14: case 15: 
									return "Summer";
								case 16: case 17: case 18: case 19: case 20: case 21: case 22: case 23: case 24: 
								case 25: case 26: case 27: case 28: case 29: case 30: case 31:
									return "Fall";
								default: throw new RuntimeException("unreachable");
								} 
							}else if (month < 13)
								{
									return "Fall";
								}else 
									{
										return "please retry, not a valid Month!";
									}
	}
}
