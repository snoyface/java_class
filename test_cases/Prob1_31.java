//Prob1_31.java
/**
* Prints out the test case if someone should marry you or not
* 
* @author Jonathan MacLeod
* @ created Oct 31, 2014
*/

import java.util.*;

class Prob1_31
{
	
	
	public static void main(String []args)
	{
		boolean isASmoker;
		boolean isMale;
		boolean isGoodLooking;
		boolean isAbleToRelocate;
		int age = 25;
		int height = 75;
		int weight = 150;
		int smoker;
		int male;
		int goodlooking;
		int torelocate;

		System.out.println ("are you a smoker? yes is 1, no is 2 ");
		Scanner smoke = new Scanner (System.in);
		smoker = smoke.nextInt();

		System.out.println ("are you a male? ");
		Scanner malee = new Scanner (System.in);
		male = malee.nextInt();

		System.out.println ("are you good looking? ");
		Scanner good = new Scanner (System.in);
		goodlooking = good.nextInt();

		System.out.println ("are you able to relocate? ");
		Scanner relocate = new Scanner (System.in);
		torelocate = relocate.nextInt();

		if (torelocate == 1) isAbleToRelocate = true;
			else isAbleToRelocate = false;

		if (smoker == 1) isASmoker = true;
			else isASmoker = false;

		if (male == 1) isMale = true;
			else isMale = false;

		if (goodlooking == 1) isGoodLooking = true;
			else isGoodLooking = false;

		String right = isRight(isASmoker, isMale, isGoodLooking, isAbleToRelocate, age, height, weight);

		System.out.println(right);

	}

	public static String isRight(boolean isASmoker, boolean isMale,
		boolean isGoodLooking, boolean isAbleToRelocate, int age, int height, int weight)
	{
		if (isASmoker == false && isMale == true && isGoodLooking == true && isAbleToRelocate == true
			&& age >= 22 && age <= 44 && height > 72 && weight < 160)
			return "Marry Me!";
		else return "Get Lost";
	}
}