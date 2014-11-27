//RealEstate.java
/**
*Thats a string and takes out all the vowels
*
*@author Jonathan MacLeod
*@version Last_Modified: Nov 22nd, 2014
*/

import java.util.*;

class RealEstate
{
	public static void main (String[]args)
	{

		System.out.println(" This programs will remove all your vowels ");

		Scanner keyboard = new Scanner (System.in);
		System.out.println("Enter your ad sentence");
		String adLine = keyboard.nextLine();

		String fixedLine = lineFixer(adLine);

		System.out.println("Your sentence backwards is " + fixedLine);
	}

	String lineFixer(String line)
	{

	}
}