class Prob3_31{
	
	
	public static void main (String [] args){
		int i = 1;
		int j = 1;

		// do {

		// i++;
		// ++j;
		// System.out.println( i * j );
		// System.out.println ("I " + i +" J " + j);
		// }
		// while ((i < 10)  && (j*j != 25));
	

	  	while ((i < 10)  && (j*j != 25))
	   {
			i++;
			System.out.println (i*j);
			j++;
	   }

	}
}