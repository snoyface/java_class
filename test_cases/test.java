class test
{ 
	public static void main (String[] args)
	{
	printLetters("Rabbit");
}
	public static void printLetters(String text)
	{
		int right = text.length() - 1;

		for (int i = 0; i < text.length(); i++)
		{
			if (i != right){
			 System.out.print (text.charAt (i) + "-");
			 } else {
			 	System.out.print(text.charAt (i));
			 	break; 
			 }
		}
		System.out.println(); // to end the line of output
	}
}
