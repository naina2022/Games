import java.util.Scanner; 

public class ConnectFourPlay
{
  //tells the player the rules
  public void showRules()
  {
    System.out.println("WELCOME TO CONNECT FOUR"); 
    System.out.println(); 
    System.out.println("RULES: "); 
    System.out.println(); 
    System.out.println("This is a two player game. Each player (Player 1 (1) and Player 2 (2)) will be prompted to input a row and column number to put in their number. First one to get four in a row wins."); 
    System.out.println("If that spot is already taken, you will be prompted to choose another. Empty spots are marked with an 0."); 

    System.out.println();
  }//end showRules method 

  //method where the user guesses 
	public int[] guessUser()
	{
		Scanner input = new Scanner(System.in); 

		//gets row and column guess from user 
		System.out.print("Enter a row number: "); 
		int rowGuess = input.nextInt(); 
		System.out.print("Enter column number: "); 
		int columnGuess = input.nextInt(); 

		//creates and returns an int array with the user's row and column guess 
		int[] userGuesses = {rowGuess, columnGuess}; 
		return userGuesses; 
	}//end guessUser() 

  //method which checks Player 1's (1) guesses and returns the changed guess board  
  //the input is the array of guesses and the board 
	public int checkUser1(int guess[], int play[][])
	{
		int row = guess[0]; 
		int column = guess[1];   

		if(play[row][column] == 0) 
		{
			play[row][column] = 1;  
      return 1; 
		} 
		else if(play[row][column] == 1) 
		{
			System.out.println("This spot is taken. Pick another spot.");
      return 0;  
		}
		else if(play[row][column] == 2) 
		{
			System.out.println("This spot is taken. Pick another spot.");
      return 0; 
		} 
    return 0; 
	}//end checkUser1() 

  //method which checks Player 2's (2) guesses and returns the changed guess board  
  //the input is the array of guesses and the board 
  public int checkUser2(int guess[], int play[][])
	{
		int row = guess[0]; 
		int column = guess[1];   

		if(play[row][column] == 0) 
		{
			play[row][column]= 2; 
      return 1;  
		} 
		else if(play[row][column] == 1) 
		{
			System.out.println("This spot is taken. Pick another spot."); 
      return 0; 
		}
		else if(play[row][column] == 2) 
		{
			System.out.println("This spot is taken. Pick another spot.");
      return 0; 
		} 
    return 0; 
	}//end checkUser2() 

  //method to check for a four in a row for Player 1 with the board as input
  public boolean checkFour1(int[][] board)
  {
    int checker = 0; 
    //iterates through the board, checking for four in a row (horizontally)
    for(int i = 0; i < 6; i++)
    {
      for(int j = 0; j < 6; j++)
      {
        if(board[i][j] == 1)
        {
          checker++; 
        }
        else
        {
          checker = 0; 
        }
      }
      if(checker == 4)
      {
        return true; 
      }
    }//ends for loop 

    //checks for four in a row (vertically)
    for(int i = 0; i < 6; i++)
    {
      for(int j = 0; j < 6; j++)
      {
        if(board[j][i] == 1)
        {
          checker++; 
        }
        else
        {
          checker = 0; 
        }
      }
      if(checker == 4)
      {
        return true; 
      }
    }//ends for loop

    //NEED WAY TO CHECK DIAGONALS 
    return false; 
  } //end checkFour1() 

  //method to check for a four in a row for Player 2 with the board as input
  public boolean checkFour2(int[][] board)
  {
    int checker = 0; 
    //iterates through the board, checking for four in a row (horizontally)
    for(int i = 0; i < 6; i++)
    {
      for(int j = 0; j < 6; j++)
      {
        if(board[i][j] == 2)
        {
          checker++; 
        }
        else
        {
          checker = 0; 
        }
      }
      if(checker == 4)
      {
        return true; 
      }
    }//ends for loop 

    //checks for four in a row (vertically)
    for(int i = 0; i < 6; i++)
    {
      for(int j = 0; j < 6; j++)
      {
        if(board[j][i] == 2)
        {
          checker++; 
        }
        else
        {
          checker = 0; 
        }
      }
      if(checker == 4)
      {
        return true; 
      }
    }//ends for loop

    //NEED WAY TO CHECK DIAGONALS 
    return false; 
    
  } //end checkFour2() 

}//ends class 
