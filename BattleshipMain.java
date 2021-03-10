/* Naina Purushothaman 
 * 9/29/20 
 * Battleship 
 * Main method, calls methods from Board and Play classes to allow the user 
 * to play the game   
 */

public class BattleshipMain 
{
	public void play() 
	{
		BattleshipBoard b1 = new BattleshipBoard(); //a constructor 
		
		System.out.println("Welcome to the game. Here is your board: ");  

		//gets the guess and play board created in Board class 
		int[][] guess1 = b1.getGuess(); 
		int[][] play1 = b1.getPlay(); 
 
		//statically sets the ships on the play board for the user to guess 
		b1.setShips(play1); 
	
		//b1.printArray(play1); 

		System.out.println(); 

		//prints the board for the user  
		b1.printArray(guess1); 

		//plays the game 
		BattleshipPlay g1 = new BattleshipPlay(); //a constructor 
		g1.showRules(); 
		int check = 0; 
		do
		{ 
			int[] guesses = g1.guessUser();   
			System.out.println(); 
			g1.checkUser(guesses, guess1, play1); 
			check = g1.checkSink(guess1, check); 
			b1.printArray(guess1);
			System.out.println(); 
		}
		while(check != 3);

		System.out.println("Congratulations! You won the game! Here is your final board: ");
		System.out.println(); 
		b1.printArray(guess1); 
 
	}  //close main

 
} //close class 
