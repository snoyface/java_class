/*
Prints out the largest int
@Author Jonathan MacLeod
@version 10/27/2014
*/

import java.util.Scanner;

class Abs{
	
	public static void main(String [] args){

		Scanner keyboard = new Scanner (System.in);
		System.out.println("please provide integer 1");
			int num1 = keyboard.nextInt();
		System.out.println("please provide integer 2");
			int num2 = keyboard.nextInt();
		

		int largestNum = largerAbsValue(num1, num2);
		System.out.println("the larger of the 2 numbers is: " + largestNum );
	}

	public static int largerAbsValue(int num1, int num2){
		int numA;
		int numB;

		if (num1 < 0){
			numA = (num1) * -1;
		}else{
			numA = (num1);
		}
		if (num2 < 0){
			numB = (num2) * -1;
		}else{
			numB = (num2);
		}

		if (numA > numB){
			return numA;
		}else {
			return numB;
		}
	}
}