/* 
 * Naina Purushothaman 
 * 3/30/21 
 * TicTacToePlay.java 
 * Shows rules and has method that facilitate turns and then 
 * checks for a 3 in a row by each player after each turn 
 *
 */

import java.util.Scanner; 

public class TicTacToePlay
{
  //tells the player the rules
  public void showRules()
  {
    System.out.println("WELCOME TO TIC TAC TOE"); 
    System.out.println(); 
    System.out.println("RULES: "); 
    System.out.println(); 
    System.out.println("This is a two player game. Each player (Player 1 (X) and Player 2 (O)) will be prompted to input a row and column number to put in their letter. First one to get three in a row wins."); 
    System.out.println("If that spot is already taken, you will be prompted to choose another. Empty spots are marked with an E."); 

    System.out.println();
  }

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
	}

  //method which checks Player 1's (X) guesses and returns the changed guess board  
  //the input is the array of guesses and the board 
	public int checkUser1(int guess[], String play[][])
	{
		int row = guess[0]; 
		int column = guess[1];   

		if(play[row][column] == "E") 
		{
			play[row][column] = "X";  
      return 1; 
		} 
		else if(play[row][column] == "X") 
		{
			System.out.println("This spot is taken. Pick another spot.");
      return 0;  
		}
		else if(play[row][column] == "O") 
		{
			System.out.println("This spot is taken. Pick another spot.");
      return 0; 
		} 
    return 0; 
	}

  //method which checks Player 2's (O) guesses and returns the changed guess board  
  //the input is the array of guesses and the board 
  public int checkUser2(int guess[], String play[][])
	{
		int row = guess[0]; 
		int column = guess[1];   

		if(play[row][column].equals("E")) 
		{
			play[row][column]= "O"; 
      return 1;  
		} 
		else if(play[row][column].equals("O")) 
		{
			System.out.println("This spot is taken. Pick another spot."); 
      return 0; 
		}
		else if(play[row][column].equals("X")) 
		{
			System.out.println("This spot is taken. Pick another spot.");
      return 0; 
		} 
    return 0; 
	}

  //method which checks for a three in a row for Player 1(X) 
	//passes the board String[][] arary  
  //returns true if there is three in a row, false if not 
	public boolean checkThree1(String arr[][])  
	{
		 //checks all eight possible ways to get three in a row for each player
     if(arr[0][0].equals("X") && arr[0][1].equals("X") && arr[0][2].equals("X"))
     {
       return true; 
     }
     else if(arr[1][0].equals("X") && arr[1][1].equals("X") && arr[1][2].equals("X"))
     {
       return true; 
     }
     else if(arr[2][0].equals("X") && arr[2][1].equals("X") && arr[2][2].equals("X"))
     {
       return true; 
     }
     else if(arr[0][0].equals("X") && arr[1][0].equals("X") && arr[2][0].equals("X"))
     {
       return true; 
     }
     else if(arr[0][1].equals("X") && arr[1][1].equals("X") && arr[2][1].equals("X"))
     {
       return true; 
     }
     else if(arr[0][2].equals("X") && arr[1][2].equals("X") && arr[2][2].equals("X"))
     {
       return true; 
     }
    
     //checks diagonals 
     else if(arr[0][0].equals("X") && arr[1][1].equals("X") && arr[2][2].equals("X"))
     {
       return true; 
     }
     else if(arr[0][2].equals("X") && arr[1][1].equals("X") && arr[2][0].equals("X"))
     {
       return true; 
     }
	return false; 
  }//end method 

//method which checks for a three in a row for Player 2(O) 
	//passes the board String[][] arary  
  //returns true if there is three in a row, false if not 
	public boolean checkThree2(String arr[][])  
	{
		 //checks all eight possible ways to get three in a row for each player
     if(arr[0][0].equals("O") && arr[0][1].equals("O") && arr[0][2].equals("O"))
     {
       return true; 
     }
     else if(arr[1][0].equals("O") && arr[1][1].equals("O") && arr[1][2].equals("O"))
     {
       return true; 
     }
     else if(arr[2][0].equals("O") && arr[2][1].equals("O") && arr[2][2].equals("O"))
     {
       return true; 
     }
     else if(arr[0][0].equals("O") && arr[1][0].equals("O") && arr[2][0].equals("O"))
     {
       return true; 
     }
     else if(arr[0][1].equals("O") && arr[1][1].equals("O") && arr[2][1].equals("O"))
     {
       return true; 
     }
     else if(arr[0][2].equals("O") && arr[1][2].equals("O") && arr[2][2].equals("O"))
     {
       return true; 
     }
    
     //checks diagonals 
     else if(arr[0][0].equals("O") && arr[1][1].equals("O") && arr[2][2].equals("O"))
     {
       return true; 
     }
     else if(arr[0][2].equals("O") && arr[1][1].equals("O") && arr[2][0].equals("O"))
     {
       return true; 
     }
	return false; 
  }//end method 

  //method that checks if the players tie 
  public boolean checkTie(String arr[][])
  {
    int flag = 0; 
      //goes through 2D array to check if all the spaces are filled 
      for(int i = 0; i < arr.length; i++)
      {
        for(int j = 0; j < arr[0].length; j++)
        {
          if(arr[i][j].equals("E"))
          {
            flag++; 
          }
        }
      }
      if(flag != 0)
      {
        return false; 
      }
      return true; 
  }

}//end class


