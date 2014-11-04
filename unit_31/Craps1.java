/*
* Prints the rolls to a Craps game, rolls till the number is 4,5,6,7,8,9,10. 
* that is the players "point". Then continues to roll till either they 
* roll a 7 (lose), or they roll their "point" (win).
* @author Jonathan MacLeod
* @version Oct 31, 2014
* 
*/

import java.math.*;

class Craps1
{                         
	public static void main (String [] args)
	{
		
		int total = 0;
		int point = 0; 				 		//the players point
		boolean totalWin = false; 		//win value
		boolean totalLose = false;		//lose value

		do 
		{
			rollNum();

			if (total >= 4 && total != 7 && total < 10)
			{
				point = total;
				System.out.println("Your Point is " + point);
			}
			
			}while (point != 0);

		do
		{
			rollNum();

			if (total == point)
			{
				totalWin = true;
			}else if (total == 7)
			{
				totalLose = true;
			}else System.out.println("not lucky yet! Rerolling.... ");
			
				
		}while (totalWin == false || totalLose == false);

		if(totalWin)
		{
			System.out.println("You Win! Congrats!");
		}else System.out.println("you Lose! sorry ");

	}

	static int rint (int a, int b)
	{
	return a + (int) ( (b-a+1) * Math.random() );
	}
	
	static int rollNum()
	{ 

		int one =   rint(1,6);   	   	//first die
		int two =   rint(1,6);   		 //second die
		int total = one + two;           //total of both dice added together

		return one;
		return two;
		return total;

		compReturn(one,two,total);
	}

	static String compReturn (int one, int two, int total)
	{
		System.out.print ("Computer rolls a " + one + " and a " + two );
		System.out.print (" , for a total of " + total + "\n");
	}
}