import java.util.*;

class Temperature{

	public static void main(String [] args){
	
		Scanner keyboard = new Scanner (System.in);

		System.out.print("Alright, what is the temperature outside? ");
		int temp = keyboard.nextInt();
		System.out.println("It seems to be a good temperature for... ");
		goodTemp(temp);
	}

	public static void goodTemp(int temp){

		if (temp <= 10){
			System.out.println("Checkers");
		}
		if (temp > 10 && temp <= 32){
			System.out.println("Skiing");
		} 
		if (temp > 32 && temp <= 70){
			System.out.println("Soccer");
		}
		if (temp >60 && temp <= 85){
			System.out.println("Tennis");
		}
		if (temp >= 75){
			System.out.println("Swimming");
		}
	}
}
