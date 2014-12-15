// Sum.java
/*
* take 2 arrays and merges them into 1, with the results
* being the combination of the 2 arrays. Each arrays
* digits are added together if they are in the same 
* position
*  @author Jonathan MacLeod
*  @version dec 12, 2014
*
* NOTE TO JAIME: this was my extra credit question. I ran into some
* issues when it got to the arrays that were diffent sizes (I attempted 
* to address this, but ran out of time). I don't expect
* credit for this since it only works correctly for the first
* array, but wanted to point out I did it, and if you have time, 
* perhaps some guidance. Of course I understand you have many 
* other homeworks to go over, so if I do not hear back, I will
* not be offended and just go to Stackoverflow. Thanks for all your
* hard work! 
*
*/
import java.util.*;

class Sum
{
	public static void main(String[]args)
	{
		double[] a1 = {4.5, 2.8, 3.4, 0.8};
		double[] a2 = {1.4, 8.9, -1.0, 2.3};

		double[] ax = {2.4, 3.8};
		double[] ay = {0.2, 9.2, 4.3, 2.8, 1.4};

		double[] aa = {1.0, 2.0, 3.0};
		double[] ab = {4.0, 5.0};

		double[] ai = {};
		double[] aj = {42.0};

		System.out.println ( Arrays.toString (arraySum(a1, a2)));
		System.out.println ( Arrays.toString (arraySum(ax, ay)));
		System.out.println ( Arrays.toString (arraySum(aa, ab)));
		System.out.println ( Arrays.toString (arraySum(ai, aj)));
	}

	static double[] arraySum(double [] a1, double [] a2)
	/* takes the arrays and adds them together
	* creates a new array, which uses the longer of the 
	* 2 arrays length
	*/
	{
		double [] ary0 = a1;   //array 1
		double [] ary1 = a2;   //array 2
		double [] result;
		double [] temp;
		boolean test = true;
		boolean ary0T = true;

		if (ary0.length < ary1.length){ 
			result = new double [ary1.length];
			temp = new double [ary1.length];
			for (int a = 0; a < ary1.length-1; a++)
			{
				if (a >= ary0.length) test = !test;
				if (!test) temp[a] = 0;
				else temp[a] = ary0[a];
			}
		}else{  
			temp = new double [ary0.length];
			result = new double [ary0.length];
			for (int a = 0; a < ary0.length-1; a++)
			{
				ary0T = !ary0T;
				result = new double [ary0.length];
				if (a >= ary1.length) test = !test;
				if (!test) temp[a] = 0;
				else temp[a] = ary1[a];
			}			
		}

		for (int i = 0; i < result.length; i++)
		{
			if (!ary0T){
			result[i] = ary0[i] + temp[i];
			}else result[i] = ary1[i] + temp[i];
		}

	return result;
	}

}