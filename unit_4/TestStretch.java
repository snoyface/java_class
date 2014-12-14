//TestStretch.java
/*
* Takes an array, doubles the size, and splits the orignal array
* so each int is not the halved amounts
*	@author Jonathan MacLeod
*	@last_modified dec 7 2014
*/

import java.util.*;

class TestStretch{
	
	public static void main(String[] args)
	{
		int[] list = {18, 7, 4, 14, 11};
		int[] list2 = stretch(list);
		System.out.println("The original array");
		System.out.println (Arrays.toString(list));
			// the above prints [18, 7, 4, 24, 11]
		System.out.println("The devided array");
		System.out.println (Arrays.toString(list2));
			// the above prints [9, 9, 4, 3, 2, 2, 7, 7, 6, 5]
	}

	static int[] stretch(int [] list)
	{
		int[] listR = new int [list.length * 2];
		for (int i = 0; i < list.length; i++)
		{
			int temp = list[i]; //where are we in the list array?
			listR[2*i] = list [i] % 2 + list[i] / 2; 
			listR[2*i+1] = list [i] / 2; 	
		}
	return listR;
	}
}