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
	    //num walks to be taken

	public static void main (String [] args){
		final int numWalks = 10;
		int sumSteps = 0;
	
		for (int i = 0; i < numWalks; i++)
		{
			sumSteps += drunkWalk();
		}
		
		System.out.println(" Avg number of steps was " + sumSteps/numWalks);
	}

	static int drunkWalk(){
		int startPoint = 5;
		int jail = 10;
		int home = 0;
		int currentLocation = startPoint;
		int totalSteps = 0;
		
		System.out.println("Here we go again...time for a walk!");

		do{

		int rNum = rint(0,100);

		if(rNum >= 49)
		{
			currentLocation++;
		} else {
			currentLocation--;
		}

		totalSteps++;

		} while (currentLocation != home && currentLocation != jail);

		System.out.print("Took " + totalSteps + " steps");
		System.out.print(", and " );

		if (currentLocation == jail)
		{
			System.out.println("Landed at HOME");
		}else System.out.println("Landed at JAIL");

		return totalSteps;

		
		

	}

	static int rint (int a, int b)
	{
	return a + (int) ( (b-a+1) * Math.random() );
	}
}