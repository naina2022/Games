/* Naina Purushothaman 
 * 4/7/21 
 * BattleshipMain.java  
 * Main method, calls methods from BattleshipBoard and BattleshipPlay classes to allow the user 
 * to play the game   
 */

public class BattleshipMain 
{
  //the method which will play the game
	public void play() 
	{
		BattleshipBoard b1 = new BattleshipBoard(); //a constructor 
		
		System.out.println("Welcome to the game. Here is your board: ");  

		//gets the guess and play board created in Board class 
		int[][] guess1 = b1.getGuess(); 
		int[][] play1 = b1.getPlay(); 
 
		//statically sets the ships on the play board for the user to guess 
		b1.setShips(play1); 

		System.out.println(); 

		//prints the board for the user (guesser)
		b1.printArray(guess1); 

		//plays the game 
		BattleshipPlay g1 = new BattleshipPlay(); //a constructor 

    //displays the rules of the game 
		g1.showRules(); 

		int check = 0;  //variable that will keep track of how many ships are sunk
		do
		{ 
			int[] guesses = g1.guessUser(); //gets the guess from the user   
			System.out.println(); 

      //checks if the guess is valid and hasn't been guessed before
			g1.checkUser(guesses, guess1, play1); 

      //checks if the user has sunk a ship 
			check = g1.checkSink(guess1, check); 

      //prints out the array for the user to see whether they have sunk a ship or missed 
			b1.printArray(guess1);
			System.out.println(); 
		} //end do while 
		while(check != 3);

    //end of game message 
		System.out.println("Congratulations! You won the game! Here is your final board: ");
		System.out.println(); 

    //prints the final array of guesses to show the guesser 
		b1.printArray(guess1); 
 
	}  //close main
} //close class 
