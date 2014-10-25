import java.util.Scanner;

class Grad{

	public static void main(String [] args){
	System.out.println("Enter GPA, Credits, and # of honor credits");
	double gpa = 3.2;
	int credits = 200;
	int honor = 20;


	String grad = studentsGrad(gpa, credits, honor);
	System.out.println("that student is " + grad );
	}

	static String studentsGrad(double gpa, int credits, int honor){
		if (credits < 180){
			return "Not a grad";
		}
		else if (credits > 180){
			return "Graduating";
		}
		else if (honor < 15 && gpa >= 3.6 && gpa <= 3.8){
			return "cum laude";
		}
		else if (honor < 15 && gpa >= 3.8){
			return "magna cum laude";
		}
		else if (honor >= 15 && gpa >= 3.6 && gpa <= 3.8){
			return "magna cum laude";
		}
		else if (honor >= 15 && gpa >= 3.8){
			return "summa cum laude";
		}
		else {
			throw new IllegalArgumentException("not a valid grade!");
		}
	
	}

}