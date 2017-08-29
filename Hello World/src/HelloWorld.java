import java.util.Scanner;

/*
 *  HelloWorld.java
 *  Hello World
 *  
 *  First program in CSC 201.
 *  
 *  @author: 	Lauren Rose
 *  @date: 		28 Aug 2017
 *  
 *  Inputs: User name, number guess between 1 and 100
 *  
 *  Outputs: Dynamic text, correct or incorrect game token
 *  
 */
public class HelloWorld {
	private static String name;
	/*
	 * @param args main arguments
	 */
	public static void main(String[] args) {
		
		System.out.println("Hello World!");
		
		/*
		 * 
		 */
		gameStart();
		
		System.out.println("Choose a number between 1 and 100.");
		int randNum = (int) Math.floor(Math.random() * 100);
		System.out.println(randNum);
		Scanner guessScan = new Scanner(System.in);
		String guess = guessScan.nextLine();
		int guessAsInt = Integer.parseInt(guess);
		
		if (randNum == guessAsInt) {
			System.out.println(name + ", you win!");
		} else {
			System.out.println("Come on, " + name + "! You can do better!");
		}
	}
	
	public static void gameStart() {
		Scanner nameScan = new Scanner(System.in);
		System.out.println("What is your name?");
		name = nameScan.nextLine();
		System.out.println("Hello " +name);
	}
}
