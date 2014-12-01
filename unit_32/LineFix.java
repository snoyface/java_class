class LineFix
{
	String lineFixer(String line) //takes out vowels, returns fixed string
	{
		String lineOutput = "";			//will be the final vowelless output
		int i = line.length();			//get the string length in a number format

		for (int z = 0; z < i; z++)
		{	
			boolean isItVowel = notVowel(line.charAt(z));  //send to notVowel 

			if (!isItVowel)  
			{
				char a = line.charAt(z);      //get the char at the # char we looking at
				lineOutput = lineOutput + a;  //update the new string, not including vowel
			}
		}
		return lineOutput;
	}

	boolean notVowel (char c)  //check out the char, is it a vowel? 
									  //if so, return true
	{
		if (c == 'a') {
        return true;
    } else if (c == 'e') {
        return true;
    } else if (c == 'i') {
        return true;
    } else if (c == 'o') {
        return true;
    } else if (c == 'u') {
        return true;
    }else return false;
	}
}