return 2 boolenans for rep and house, both taking in age and num of years at a US citzen. 

rep needs to be above 25, and a citzen for 7 years

senate needs to be above 30 and a citzen for 9 years

main will take in the age and citizen years, and pass them to rep and senate methods, and return the answer based on their input. 

if senate is true and rep is true, print they can be both
	if rep is true and sentate is false, print only rep can
		if both are false, print you cannot be either

/*
* Deterimines if a person (based on years and time as citzen in US) can * be elected for either the Senate or as a Representative
* @author Jonathan MacLeod
* @version Nov 4, 2014
*/

import java.util.*;

class Congress {

	public static void main ( String [] args ) {
		int age;		//age of person
		int lengthOfCitzenship	//years at citzen
		boolean rep;	//can they be a rep?
		boolean senate;	//can they be a senator?

		System.out.println("Enter age of candidate: " );  //input age
		Scanner ageIn = new Scanner (System.in);
		age = ageIn.nextInt();

		System.out.println("Enter years as U.S. citizenship: ");  //input yrs at citzen
		Scanner usCitIn = new Scanner (System.in);
		citzenYrs = usCitIn.nextInt();
	
		senate = eligibleForSenate();
		rep = eligibleForHouse();

		if ( )
	}


	static boolean eligibleForSenate(int age, int lengthOfCitzenship ) {
		if (age >= 30 && lengthOfCitzenship >= 9) {
			return true;
		} else {
			return false;
		} 
	}

	static boolean eligibleForHouse (int age, int lengthOfCitzenship ) {
		if (age >= 25 && lengthOfCitzenship >= 7) {
			return true;
		} else { 
			return false;
		}
	}


}