/*
* Deterimines if a person (based on years and time as citzen in US) can 
* be elected for either the Senate or as a Representative
* @author Jonathan MacLeod
* @version Nov 4, 2014
*/

import java.util.*;

class Congress {

	public static void main ( String [] args ) {
		int age;		//age of person
		int lengthOfCitzenship;	//years at citzen
		boolean rep;	//can they be a rep?
		boolean senate;	//can they be a senator?

		System.out.println("Enter age of candidate: " );  //input age
		Scanner ageIn = new Scanner (System.in);
		age = ageIn.nextInt();

		System.out.println("Enter years as U.S. citizenship: ");  //input yrs at citzen
		Scanner usCitIn = new Scanner (System.in);
		lengthOfCitzenship = usCitIn.nextInt();
	
		senate = eligibleForSenate(age, lengthOfCitzenship);
		rep = eligibleForHouse(age, lengthOfCitzenship);

		if (senate && rep) {
			System.out.print("The candidate is eligible for election");
			System.out.print(" to both the House of Representatives and the Senate.\n");
		} else if (rep && !senate) {	
			System.out.print("The candidate is eligible for election");
			System.out.print(" to the House of Representatives but is");
			System.out.print(" NOT eligible for election to the Senate.\n");
		} else if (!rep && !senate) {	
			System.out.print("The candidate is NOT eligible for election");
			System.out.print(" to both the House of Representatives ");
			System.out.print(" and the Senate.\n");
		} else {
			throw new IllegalArgumentException();
		}
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