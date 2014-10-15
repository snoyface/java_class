/*
Prints out the lyrics for the song "This Old Man"
@Author Jonathan MacLeod
@version 10/15/2014
*/

class ThisOldMan{
	
	//how many verses 

	public final static int VERSES = 9;

	public static void main (String [] args){
		for (int i = 0; i >= VERSES; i++){
			String object = new whatLine (i);
			String verse = getVerse (i + 1; object);
			System.out.println (verse);

		}
	}

	String 


}