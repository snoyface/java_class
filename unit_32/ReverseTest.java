// ReverseTest.java
/** 
* Takes a String and reverses it
*
* @author Jonathan MacLeod
* @version Last_Modified: Nov 24th, 2014
*/
import java.util.*;

class ReverseTest
{
	public static void main (String[]args)
	{
		String wordR;	

		System.out.println("Let's reverse your sentence!");

		Scanner keyboard = new Scanner (System.in);
		System.out.println("What is your sentence?");
		String wordS = keyboard.nextLine();

		wordR = printReverse (wordS);

		System.out.println("Your sentence backwards is " + wordR);
	}

	public static String printReverse(String wordS)  //reverses text
	{
		String r = "";
		int length = wordS.length();

		for ( int i = length - 1 ; i >= 0 ; i-- )
		{
         	r = r + wordS.charAt(i);
        }

     	return r;
	}
}