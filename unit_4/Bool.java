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

	public static void fullOfBool(boolean [] test)
	//Prints out first, last, and how many true 
	//values are in a row
	{
		int count = 0; //counts the # of true
		int first = -1; //to assign the first true
		int last = -1; //assigns to the last true]
		boolean firstT = false; //first True
		boolean lastT = false;

		for (int i = 0; i < test.length; i++)
		{
			if (test[i]) {
                if (first < 0 || i < first) first = i;
                if (first < 0 || i > last) last = i;
            
                count++;	
			}
		}

		//prints out results for each test
		System.out.println("The first True statement is # " + first + " in the array");
		System.out.println("The last true statement is # " + last + " in the array");
		System.out.println("The amount of True statements is " + count + ".\n");
	}
}