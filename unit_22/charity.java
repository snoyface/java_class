import java.util.Scanner;
class Charity
{

	

	public static void donor (double dollarsGiven)

	{
	
		if (dollarsGiven >= 1000) System.out.println ("Benefactors");
			else if (dollarsGiven >= 500) System.out.println ("Patrons");
				else if (dollarsGiven >= 100) System.out.println ("Supporters");
					else if (dollarsGiven >= 15) System.out.println ("Friends");
						else if (dollarsGiven > 0) System.out.println ("Cheapskates");
							else System.out.println ("This is not a real amount");
								
	}

	public static void main (String [] args)
	{
		Scanner keyboard = new Scanner (System.in);

			System.out.print("Enter the amount of contribution: ");
				double x = keyboard.nextDouble();
					System.out.println();
					donor(x);
	}
}