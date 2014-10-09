import java.util.Arrays;


public class Main 
{
	
	public static void main(String[] args) {
		System.out.println(" Welcome to the Lawn Game Olympics!");	
	
	
		System.out.println(args.length);	
		System.out.println(args[0]);
		if (args.length < 1)
		System.out.println( "Please use valid input!");
		else if (args[0].equals("Events") || args[0].equals("e")) {
			printEvents();
		}
		else if (args[0].equals("Olympians") || args[0].equals("o")) {
			printOlympians();
		}
		else if (args[0].equals("help") || args[0].equals("h"))	{
			System.out.println( displayHelpInfo());
		}
	
}
	
	public static String displayHelpInfo(){
		return "Welcome to the Help Page!\n "
				+ "Enter the letter H or Help, E or Events, O or Olympians!\n"
				+ "We apologize for the inconvenience";
	}
	

		
		
	public static void printEvents(){
	EventManager EventManager = new EventManager();
	EventManager.printEvents();
	
	}
	
	public static void printOlympians(){
	OlympianManager OlympianManager = new OlympianManager();
	OlympianManager.printOlympians();
	} 
}

