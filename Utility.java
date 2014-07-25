import java.util.Random;


public class Utility {
	
	public static int random(int minimum, int maximum){
		Random rand = new Random();
		int randomNum = rand.nextInt((maximum - minimum) + 1) + minimum;

	    return randomNum;
	}
	
	
}
