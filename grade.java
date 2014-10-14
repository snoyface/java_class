import java.util.Scanner;

class grade
{
	public static void main (String [] args)
	{
		Scanner keyboard = new Scanner (System.in);

		System.out.print("Please Input numerical exam score: ");
		int score = keyboard.nextInt();

		if (score >= 90) System.out.println ("A");
		else if  (score >= 80) System.out.println ("A-");
		else if (score >= 70) System.out.println ("B+");
		else System.out.println ("That does not compute");
	}
}