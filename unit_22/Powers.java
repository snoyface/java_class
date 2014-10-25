import java.util.Scanner;

class Powers
{

	public static void main (String [] args){
	
		System.out.println("How many powers should you go up to?");
		Scanner keyboard = new Scanner (System.in);
			int num = keyboard.nextInt();
		System.out.println("You would like to go up to the power of " + num + " of 2 \n");
		printPowersof2(num);

	}
	public static void printPowersof2(int timesTwo){


		int powersNumnext = 1;

		for(int i = 0; i <= timesTwo; i++){
			
			System.out.println(powersNumnext);

			powersNumnext = powersNumnext * 2;
		}
	}
}