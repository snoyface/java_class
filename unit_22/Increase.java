import java.util.Scanner;

class Increase{
	
   	public static final int DAYS = 10;

	public static void main (String [] args){


		Scanner keyboard = new Scanner (System.in);

		
		//prompt for 10 days worth of ints
		System.out.println("Enter " + DAYS + " days worth of prices, separated each by a return");

		int a = 0;
		int b = 0;
		int max = 0;
		int dif = 0;
		int v1 = 0;
		int v2 = 0;
		int count = 0;

		for (int i = 0; i < DAYS; i++) {

            if (i == 0) {
                a = keyboard.nextInt(); 
                continue;
            }

            b = keyboard.nextInt();
            dif = b - a;
            if (dif > max) {
                max = dif; 
                v1 = a;
                v2 = b;
                count = i;
            }
            a = b;
        }

        if (max > 0) {
            System.out.println("The largest increase of " + max);
            System.out.println("  from " + v1 + " all the way to " + v2);
            System.out.println("  occurred between day # " + count + " and day #" + (count + 1));
        } 
        else {
            System.out.println("There was no increase!");
        }
	}
}