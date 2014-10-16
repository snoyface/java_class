import java.util.Scanner;

class Easter{
	
	public static void main (String [] args){

	Scanner keyboard = new Scanner (System.in);

	System.out.println("Enter the Year you want to compute");
	int year = keyboard.nextInt();
	String date = computeEaster(year);
	System.out.println("That would be " + date);

	}

	static String computeEaster (int year){

		if (year == 0){
			throw new NumberFormatException ("That is not an acceptable year");
		}

		int y = year;
		int a = y % 19;
		int b = y / 100;
		int c = y % 100;
		int d = b / 4;
		int e = b % 4;
		int g = (8 * b +13) / 25;
		int h = (19 * a + b - d - g + 15) % 30;
		int j = c / 4;
		int k = c % 4;
		int m = (a + 11 * h) / 319;
		int r = (2 * e + 2 * j - k - h + m + 32) % 7;
		int n = (h - m + r + 90) / 25;
		int p = (h - m + r + n + 19) % 32;

		String month = GetMonth(n);
		String day = GetDay(p);

		return " " + month + " " + day + ", " + year; 	

		
	}

	static String GetMonth (int i){
		if (i == 1){
			return "January"; 
		} 
		else if (i == 2){
			return "February";
		}
		else if (i == 3){
			return "March";
		}
		else if (i == 4){
			return "April";
		}
		else if (i == 5){
			return "May";
		}
		else if (i == 6){
			return "June";
		}
		else if (i == 7){
			return "July";
		}
		else if (i == 8){
			return "August";
		}
		else if (i == 9){
			return "September";
		}
		else if (i == 10){
			return "October";
		}
		else if (i == 11){
			return "November";
		}
		else if (i == 12){
			return "December";
		}
		else {
			throw new IllegalArgumentException("Not a valid Month");
		}
	}

	static String GetDay(int i){
		if (i == 1|| i == 21|| i == 31){
			return i + "st";
		}
		else if (i == 2|| i == 22){
			return i + "nd";
		}
		else if (i == 3|| i == 23){
			return i + "rd";
		}
		else {
			return i + "th";
		}
	}
}