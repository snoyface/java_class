//Bool.java
/*
* Takes some arrays that have random amounts of True, returns
* location of first, last, and total number of trues
*	@author Jonathan MacLeod
* 	@last_modified dec 7, 2014
*/

class Bool
{
	public static void main (String [] args)
	{
	//arrays to use for fullofBool
	boolean [] test1 = {false, true, true, true};
	boolean [] test2 = {true};
	boolean [] test3 = {true, true, true, true, false};

	fullOfBool(test1);
	fullOfBool(test2);
	fullOfBool(test3);
	}

	public static boolean fullOfBool(boolean [] test)
	//Prints out first, last, and how many true 
	//values are in a row
	{
		int count = 0; //counts the # of true
		int first = 0; //to assign the first true
		int last = 0; //assigns to the last true]
		boolean firstT = false;
		boolean lastT = false;

		for (int i = 0; i < test.length; i++)
		{
			boolean temp = test[i];    //assigned to current boolean in the array

			if (count < 1 && temp)
			{
				count = count + 1;
				first = i + 1;
				firstT = true;
			}else if (temp && count > 0)
				{
					count = count + 1;
					firstT = true;
				}else if (!temp)

			if (first > 0 && !temp && firstT ) last = count - 1;		
		}

		System.out.println("The first True statement is # " + first + " in the array");
		System.out.println("The last true statement is # " + last + " in the array");
		System.out.println("The amount of True statements is " + count + ".\n");
	return true;
	}
}