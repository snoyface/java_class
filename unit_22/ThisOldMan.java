/*
Prints out the lyrics for the song "This Old Man"
@Author Jonathan MacLeod
@version 10/15/2014
*/

class ThisOldMan{
	
	//how many verses 

	public final static int VERSES = 10;

	public static void main (String [] args){
		for (int i = 1; i <= VERSES; i++){
			String object = whatLine (i);
			String verse = getVerse (i, object);
			System.out.println (verse);

		}
	}

	//set up verse to be printed, bring in VERSES #

	static String getVerse (int playNum, String object){

		String verse;
		verse = "This old man, he played " + playNum + "\n";
		verse += "He played nick nack " + object + "\n" ;
		verse += "With a nick-nack paddy-whack, give the dog a bone, \n";
		verse += "This old man came running home. \n";
		return verse;
	}

	static String whatLine(int playNum){
		if(playNum == 1 ){
			return "on my drum";
		}else if(playNum == 2){
			return "on my shoe";
		}else if(playNum == 3){
			return "on my tree";
		}else if(playNum == 4){
			return "on my hive";
		}else if(playNum == 5){
			return "up in heaven";
		}else if(playNum == 6){
			return "on my spine";
		}else if(playNum == 7){
			return "on my door";
		}else if(playNum == 8){
			return "on my sticks";
		}else if(playNum == 9){
			return "on my gate";
		}else if(playNum == 10){
			return "on my hen";
		}else{
			throw new IllegalArgumentException();
		}

	}

}