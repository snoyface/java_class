class Test1{
	
	public static void main(String[]args)
	{

		int [] [] foobar = 
		{
     		{10, 12, 14, 16, 18},
      		{20, 40, 40, 49, 18},
      		{4,3,1}
    	};

		int sum = 0;	
   		int numrow = 0;
   		int total = 0;
   		int sumtotal = 0;
		for (int row = 0; row < foobar.length; row++)
		{
		for (int col = 0; col < foobar[row].length; col++)
		{
			sum++;
			System.out.println("sum is now " + sum);
		}
		numrow++;
		System.out.println("numrow is now " + numrow);
		sumtotal += sum;
		System.out.println("sumtotal is now " + sumtotal);
		sum = 0;
		System.out.println("sum is now " + sum);
		}
		total = sumtotal/numrow;

		System.out.println(total);

	}


	
}