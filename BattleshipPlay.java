/* Naina Purushothaman 
 * 4/9/21 
 * BattleshipPlay.java  
 * Has methods which allow the user to play the game 
 */ 

import java.util.Scanner; 
public class BattleshipPlay 
{
	//tells the user the rules of the game 
	public void showRules()
	{
    System.out.println("WELCOME TO BATTLESHIP"); 
		System.out.println(); 
		System.out.println("RULES:");  
		System.out.println(); 
		System.out.println("Ships have already been set on another board for you to guess."); 
		System.out.println("When prompted, enter a row and column number to guess a spot."); 
		System.out.println("A 0 indicates a spot that you haven't guess yet."); 
		System.out.println("A 1 indicates that you have hit a ship."); 
		System.out.println("A 2 indicates that you have missed."); 
		System.out.println("When you sink a ship, the spaces where the ship was will all become 3.");
		System.out.println("If you guess a space more than once, you will be prompted to pick again."); 
		System.out.println(); 
	} //end showRules() 

	//method that returns an int array of the user's guess (row and column) 
	public int[] guessUser()
	{
		Scanner input = new Scanner(System.in); 

		//gets row guess from the user 
		System.out.print("Enter a row number: "); 
		int rowGuess = input.nextInt(); 

    //gets column guess from the user 
		System.out.print("Enter column number: "); 
		int columnGuess = input.nextInt(); 

		//creates and returns an int array with the user's row and column guess 
		int[] userGuesses = {rowGuess, columnGuess}; 
		return userGuesses; 
	} //end guessUser() 

	//method which checks the user's guesses (hit or miss) and returns the changed guess board  
	public void checkUser(int arr[], int guess[][], int play[][])
	{
    //gets the row and column guess the user made and assigns the values to separate variables 
		int row = arr[0]; 
		int column = arr[1];   

    
		if(play[row][column] == 0) 
		{
      //if that position on the arry is 0, the user missed 
			System.out.println("Miss!");

      //changes both the guess and play arrays to indicate that this spot has now been guessed  
			guess[row][column] = 2; 
			play[row][column] = 1; 
		} //end if
		else if(play[row][column] == 1)
		{
      //if that position is 1, the user has already guessed the spot and needs to guess again 
			System.out.println("You have guessed this spot already. Guess again."); 
		} //end else if
		else if(play[row][column] == 4) 
		{
      //if that position is 4, the user has hit a ship and the spot changes to indicate that it has been guessed already 
			System.out.println("Hit!");
			guess[row][column] = 1; 
			play[row][column] = 1; 
		} //end else if
	} //end checkUser()

	//method which checks if you have sunk a ship after a guess
	//passes the play array which was just changed by the checkUser method 
	public int checkSink(int arr[][], int checkOver)  
	{
		int check1 = 0;  

		if(arr[2][2] == 1 && arr[2][3] == 1 && arr[2][4] == 1)
		{
			check1 = 1;  
		} //end if
		else if(arr[4][4] == 1 && arr[5][4] == 1)
		{
			check1 = 2; 
		} //end else if
		else if(arr[0][1] == 1 && arr[0][2] == 1 && arr[0][3] == 1 && arr[0][4] == 1)
		{
			check1 = 3; 
		} //end else if

    //if-statements to check if any of the ships have been sunk 
		if(check1 == 1)
		{
			System.out.println("SUNK!");
			arr[2][2] = 3;
			arr[2][3] = 3;
			arr[2][4] = 3;
			checkOver++; 
			return checkOver; 
		} //end if
		else if(check1 == 2) 
		{
			System.out.println("SUNK!"); 
			arr[4][4] = 3;
			arr[5][4] = 3;
			checkOver++; 
			return checkOver; 
		} //end else if
		else if(check1 == 3) 
		{
			System.out.println("SUNK!"); 
			arr[0][1] = 3;
			arr[0][2] = 3;
			arr[0][3] = 3;
			arr[0][4] = 3;
			checkOver++; 
			return checkOver; 
		} //end else if
		return checkOver; 
	} //end checkSink() 
} //end class 
