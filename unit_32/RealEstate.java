//RealEstate.java
/**
*Asks for a sentence to take out vowels for. 
*
*@author Jonathan MacLeod
*@version Last_Modified: Nov 22nd, 2014
*/

import java.util.*;

class RealEstate
{
	public static void main (String[]args) //grabs input, sends out string to get fixed
	{

		System.out.println(" This programs will remove all your vowels ");

		Scanner keyboard = new Scanner (System.in);
		System.out.println("Enter your ad sentence");
		String adline = keyboard.nextLine();	//grabs sentence to fix
	
		String lineFixed = lineFixer(adline);	//send to lineFixer method

		System.out.println ("\r" + lineFixed);
	}

	static String lineFixer(String line) //takes out vowels, returns fixed string
	{
		String lineOutput = "";			//final returned vowelless output

		for (int z = 0; z < line.length(); z++)
		{

			if (!notVowel(line.charAt(z)))  
			{
				char a = line.charAt(z);      //get the char at the # char we looking at
				lineOutput += line.charAt(z);  //update the new string, not including vowel
			}
		}
		return lineOutput;
	}

	static boolean notVowel (char c)  //check out the char, is it a vowel listed? 
									  //if so, return true
	{
		String vowel = "aeiouAEIOU";   //the vowels not to use
     for (int i=0; i<10; i++)
     {
       if (c == vowel.charAt(i))
         return true;
     }
     return false;
   }
}