/**
 * 
 * @author Drew Stagnaro
 * Dice Class
 * Pd 6
 *
 */
public class Dice 
{
	//Fields
	
	private int numRolls;
	
	//Constructors
	/**
	 * @param sets numRolls as 0
	 */
	public Dice()
	{
		numRolls = 0;
	}
	
	//Methods
	/**
	 * Rolls the dice and adds 1 to number of rolls each time the method is called
	 * @return roll 	returns what number the dice rolled
	 */
	public int roll()
	{
	 numRolls++;
	 int roll = (int)(Math.random()*6) + 1;
	 return roll;
	}
	/**
	 * resets the number of rolls
	 */
	public void reset()
	{
		numRolls = 0;
	}
	/**
	 * returns the number of times the dice was rolled
	 * @return number of rolls
	 */
	public int getNumRolls()
	{
		return numRolls;
	}
}
