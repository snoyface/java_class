import java.util.Scanner;


class squares {

Public static void main (String [] args)
{
	Scanner keyboard  = new Scanner (System.in);
	System.out.print ("How large is the outer edge");
	int outerLength = keyboard.Int();

		for (int row = 1; row <= outerLength; row++)
		{
			for (int col = 1; col <= outerLength; col++)
			{
				int distance;
				distance = row - 1
				if (distance > outerLength - row)
					distance = outerLength -row;
					if (distance > column - 1)
						distance = column - 1;
						if (distance > outerLength - column)
							distance = outerLength - column;
							if (distance % 2 == 0)
								System.out.print("*");
								else System.out.print(".");
			}
		System.out.println();
		}

}
}