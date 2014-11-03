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
		
		int total;
		int point; 				 		//the players point
		boolean totalWin = false; 		//TorF for point value 
		boolean totalLose = false;		//

		do 
		{
			int one =   rint(1,6);   	   	//first die
			int two =   rint(1,6);   		 //second die
			total = one + two;           //total of both dice added together

			System.out.print ("Computer rolls a " + one + " and a " + two );
			System.out.print (" , for a total of " + total + "\n");

			if (total > 4 || total < 10)
			{
				point = total;
				System.out.println("Your Point is " + point);
			}
			
			}while (total < 4 || total > 10);

		do
		{
			int one =   rint(1,6);   	   	//first die
			int two =   rint(1,6);   		 //second die
			total = one + two;           //total of both dice added together

			System.out.print ("Computer rolls a " + one + " and a " + two );
			System.out.print (" , for a total of " + total + "\n");

			if (total = point)
			{
				totalWin = true;
			}
			if (total == 7)
			{
				totalLose = true;
			}
				
		}while (totalWin == false || totalLose == false);


		System.out.println("foo");
	}

	static int rint (int a, int b)
	{
	return a + (int) ( (b-a+1) * Math.random() );
	}

}