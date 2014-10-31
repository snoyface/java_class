//GPAlone.java
/**
* Prints out if the GPA ever went down and avg GPA
*
* @author Jonathan MacLeod
* @version created Oct 29, 2014
*/

import java.util.*;

class GPAclone
{
	public static int GPANUM; //number of semesters

	public static void main(String [] args)
	{
		double oldGpa;					//the last GPA
		double gpa = 0.0;				//most recent GPA, 0 since we don't have anything yet
		double sum = 0.0;				//sum of all the GPA's initiated
		boolean increasing = true;		//True if GPA is increasing
										//assume true till NOT

		System.out.println(" how many days?");
		Scanner keyboard = new Scanner (System.in);
		GPANUM = keyboard.nextInt();

		System.out.print ("\n Type a double value that that represents");
		System.out.print ("your grade point avg \n");
		Scanner keyboard1 = new Scanner (System.in);
		
		for (int semester = 0; semester < GPANUM; semester++)
		{
			oldGpa = gpa;  //save yesterday's GPA first
			System.out.print ("At the end of the semester # " + semester + ": ");
			gpa = keyboard1.nextDouble();	//Read todays GPA
			sum += gpa;						//update the sum
			if (gpa <= oldGpa) increasing = false;
		}
		System.out.print ("Average GPA was ... ");
		System.out.println (sum / GPANUM);

		if (increasing)
			System.out.print ("GPA did Increase every semester\n");
		else System.out.print ("GPA did NOT increase every semester\n");
	}
}