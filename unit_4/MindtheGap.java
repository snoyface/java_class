// MindtheGap.java
/*
* 	Takes an array and the method minigap returns the smallest
*   of the gaps between the numbers
*	@author Jonathan MacLeod
* 	@last_modified dec 7, 2014
*/

class MindtheGap
{
	public static void main (String [] args)
	{
		int [] test = {3,4,6,8,3,6,10};
		int [] test1 = {4,7};
		int [] test2 = {2,-8,14,5,3,2,9};
		int [] test3 = {9,2,4,6,3,6,7};
		int [] test4 = {9,19,29,39,-17};
		int [] test5 = {5,1,8,2,4,10};

		System.out.println("test minimum distance is " + miniGap(test));
		System.out.println("test1 minimum distance is " + miniGap(test1));
		System.out.println("test2 minimum distance is " + miniGap(test2));
		System.out.println("test3 minimum distance is " + miniGap(test3));
		System.out.println("test4 minimum distance is " + miniGap(test4));
		System.out.println("test5 minimum distance is " + miniGap(test5));
	}

	public static int miniGap(int [] list)
	{
		int diff = 0;
        int min = -1;

     	//go over list and see what the diff is

        for (int i = 0; i < list.length; i++) {
            if (i + 1 != list.length) {
                diff = Math.abs(list[i] - list[i + 1]);
                if (min == -1 || diff < min)
                {
                	min = diff;
                }else min = min;
            }
        }

        return min;    //returns the min distance
	}
}