/**
/**
 * 
 * @author Drew Stagnaro
 * Craps Game Class
 * pd 6
 *
 */
import java.util.Scanner;

public class Craps 
{
	public static void main(String[] args) 
	{
		/**
		 * Creates new Dice
		 */
		Dice die1 = new Dice();
		boolean playAgain = true;
		while (playAgain)
		{
		System.out.println("Welcome To The Craps Game");
		System.out.print("Please Press 'Enter' to Roll");
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		int point = die1.roll() + die1.roll();
		System.out.print(point);
		if (point == 7 || point == 11) 
		{
			System.out.print(" Congradulations! You have won the game!");
		} 
		else if (point == 2 || point == 12) 
		{
			System.out.print("Sorry, you lost.");
		}
		else 
		{
			System.out.print(" Please press 'enter' roll again.");
			scanner.nextLine();
			int rollValue = die1.roll() + die1.roll();
			while (rollValue != point && rollValue != 7)
			{
			System.out.println(rollValue);
			System.out.print("Please press 'enter' roll again.");
			scanner.nextLine();
			rollValue = die1.roll() + die1.roll();
			}
			System.out.println(rollValue);
			if(rollValue == point) {
				System.out.print(" Congradulations! You have won the game!");
			} 
			else {
				System.out.print("Sorry, you lost.");
			}
		}
		System.out.print("Would you like to play again?");
		scanner.nextLine();
		while ()
		{
			
		}
			
		}
		
		
	}
}
