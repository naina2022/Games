import java.util.Scanner; 

public class TicTacToePlay
{
  //tells the player the rules
  public void showRules()
  {
    System.out.println("This is a two player game. Each player (Player 1 (X) and Player 2 (O)) will be prompted to input a row and column number to put in their letter. First one to get three in a row wins."); 
    System.out.println("If that spot is already taken, you will be prompted to choose another."); 
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
	public void checkUser1(int guess[][], String play[][])
	{
		int row = arr[0]; 
		int column = arr[1];   

		if(play[row][column] == "") 
		{
			play[row][column] = "X";  
		} 
		else if(play[row][column] == "X") 
		{
			System.out.println("This spot is taken. Pick another spot."); 
		}
		else if(play[row][column] == "O") 
		{
			System.out.println("This spot is taken. Pick another spot.");
		} 
	}

  //method which checks Player 2's (O) guesses and returns the changed guess board  
  //the input is the array of guesses and the board 
  public void checkUser2(int guess[][], String play[][])
	{
		int row = arr[0]; 
		int column = arr[1];   

		if(play[row][column].equals("")) 
		{
			play[row][column]= "O";  
		} 
		else if(play[row][column].equals("O")) 
		{
			System.out.println("This spot is taken. Pick another spot."); 
		}
		else if(play[row][column].equals("X")) 
		{
			System.out.println("This spot is taken. Pick another spot.");
		} 
	}

  //method which checks for a three in a row for Player 1(X) 
	//passes the board String[][] arary  
  //returns true if there is three in a row, false if not 
	public boolean checkThree1(int arr[][])  
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
	public boolean checkThree2(int arr[][])  
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

}//end class


