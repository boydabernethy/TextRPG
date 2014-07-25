import java.util.Scanner;


public class TextRPG {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s;		
		Scanner in = new Scanner(System.in);
		
		Character c = new Character("Boyd", 50, 0, 1);
		
		
		s="";
		
		
		while(s.compareTo("x")!=0){
			switch(s){
			case "s" : 
				System.out.println(c);
				break;
			case "h" :
				displayHelp();
				break;
			case "help" :
				displayHelp();
				break;
			default :
				break;
			case "i" :
				displayInventory();
				break;
			}
			System.out.println("Enter command : ");
			s = in.nextLine();
		}
		
	}

	private static void displayInventory() {
		System.out.println("Inventory");
		
	}

	public static void displayHelp(){
		System.out.println("Help Menu");
		System.out.println("Controls");
		System.out.println("s = open character stats");
		System.out.println("i = inventory");
		System.out.println("x = exit");
	}

}
