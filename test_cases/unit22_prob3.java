class Unit22_Prob3 {
	public static void main (String [] args){
		for (int outer = 2; outer <= 6; outer++){
			for (int inner = 1; inner <= 8; inner++){
				System.out.print ( outer * inner + " " );
			}
			System.out.println();
		}
	}	
}