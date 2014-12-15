//ArrayIntersect.java
/*
*	Method Intersect will take two arrays of ints
*	and returns true if both contain the same int
*	@author Jonathan MacLeod
*	@last_modified Dec 8, 2014
*/

class ArrayIntersect
{
	public static void main (String[] args)
	{
		//create test arrays
		int [] test0 = {1,1,3,4,4,6,4,5};
		int [] test1 = {7,8,8,9,7,6};

		int [] test2 = {1,1,3,4,4,6,4,5};
		int [] test3 = {7,8,8,9,7,6};

		int [] test4 = {2,3,2,3,4,3,4};
		int [] test5 = {7,8,8,9,7,6};

		//should come back True
		System.out.println("test 1 is: " + intersect(test0, test1));
		//should come back True
		System.out.println("test 2 is: " + intersect(test2, test3));
		//should come back False
		System.out.println("test 3 is: " + intersect(test4, test5));
	}

	static boolean intersect(int[] test, int[] test1)
	/* This method tests to see if either array has the 
	* same numbers, returns true if it does 
	* @param equals: return value
	* @param temp: test for array 1
	* @param temp1: test for array 2
	*/
	{
		boolean equals = false;
		for(int i = 0; i < test.length; i++)
		{
			int temp = test[i];
			for (int a = 0; a < test1.length; a++)
			{
				int temp1 = test1[a];
				if (temp1 == temp)
				{
					equals = true;
				}
			}
		}
	return equals;
	}
}