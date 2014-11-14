/*
* Take N and find out if they went to jail or home, after N is done, also tell the avg 
*steps walked.
* @author Jonathan MacLeod
* @version Now 3, 2014
* 
*/

import java.util.*;

class Drunk
{

	public static void main (String [] args){
		final int numWalks;													//how many steps int
		int sumSteps = 0;													//total steps taken
		int currentSteps = 0;												//steps per loop
		
		System.out.println(" How many times should they for a walk? ");		//ask for how many walks
		Scanner keyboard = new Scanner (System.in);
		numWalks = keyboard.nextInt();		
	
		for (int i = 0; i < numWalks; i++)				
		{
			System.out.println("Here we go again...time for a walk!");
			currentSteps = drunkWalk();		
										//return steps
			
			if (currentSteps < 0)											//is it home (- num)
			{	
				System.out.println("Landed at HOME");	
				currentSteps = currentSteps * -1;							//make positive again
			}else System.out.println("Landed at JAIL"); {
				
			}
						//return steps
			sumSteps += currentSteps;
			System.out.println(" took " + currentSteps + " steps");	
		}
		System.out.println ( " Avg number of steps was " + sumSteps/numWalks );	//ave steps

	}

	static int drunkWalk() {
		int startPoint = 5;							//Starting point for student
		int jail = 10;								//location of jail
		int home = 0;								//location of home
		
		int currentLocation = startPoint;			//starts us off at the startpoint
		int totalSteps = 0;

		do {

			int rNum = rint(0,100);					//randonize a num

			if( rNum >= 49 )			
			{
			currentLocation++;						//add to current location
				} else {
				currentLocation--;					//subtract to current location
			}

			totalSteps++;							//record the total steps used this time around

			} while (currentLocation != home && currentLocation != jail);

				if (currentLocation == home)
				{
					totalSteps = totalSteps * -1;	//makes the return minus to show its home in main
			}

			return totalSteps;						//return the total steps
		}

	static int rint (int a, int b)			
	{
	return a + (int) ( (b-a+1) * Math.random() );
	}
}