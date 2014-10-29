/*
Prints out the largest int
@Author Jonathan MacLeod
@version 10/27/2014
// EXTRA CREDIT QUESTION
//Doesn't seem to work, I do not know how to input something beyond an Int
//(like 2*5-5) into the program with Scanner. But the question states a call of 
// "A call oflargerAbsValue (11, 2*3-5)", but that does not return correctly. 
//I attempted to fix this in the largerAbsValue method, but it does not 
//return correctly, but a regular Int does. 
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