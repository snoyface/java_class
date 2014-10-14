import java.util.Scanner;

class count
{
	
	public static void main (String [] args) 
	{
		printNumber (5, 9);
		printNumber (6,10);
		printNumber (3,5);

		Scanner keyboard = new Scanner (System.in);

			System.out.print("Please tell me what number to list: ");
				int whatNumber = keyboard.nextInt();

			System.out.print("Please tell me how many times to list");	
				int howMany = keyboard.nextInt();

		System.out.print("the following are your numbers ");
		System.out.println();	
		printNumber(whatNumber,howMany);
	}

	static void printNumber (int number, int count)
	{
		for (int i = 1; i <= count; i++)
		{
			System.out.print(number);
		}
		System.out.println();
	}

}