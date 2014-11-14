import java.util.Scanner;

class Nov18b
{
	
	public static void main (String [] args)
	{
		Scanner keyboard = new Scanner (System.in);
		System.out.print("Please type a String");
		String s = keyboard.nextLine();

		int left = 0;
		int right = s.length() - 1;

		while(left < right)
		{
			if (s.charAt(left) != s.charAt(right))
			{
				System.out.println ("Not a Palindrome");
				return;
			}
		left++;
		right--;
		}
		System.out.println("yes you have one");
	}
}