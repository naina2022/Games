/**
 * Naina Purushothaman 
 * 3/30/21
 * TicTacToeBoard.java 
 * Creates the 3x3 board and has methods to access elements at 
 * specific locations and a getter method for the board 
*/

public class TicTacToeBoard
{
  //instance variable for the 2D board array 
  private String[][] board; 

  //default constructor 
  public TicTacToeBoard()
  {
    //initializes 3x3 board 

    board = new String[3][3]; 
    //populates board with empty Strings
    for(int i = 0; i < 3; i++)
    {
      for(int j = 0; j < 3; j++)
      {
        board[i][j] = "E"; 
      }//end inner for  
    } //end outer for 
  } //end TictacToeBoard() 

  //method to print the board 
  public void printBoard(String[][] board1)
  {
    //prints board header 
    System.out.println("  0 1 2"); 
		for(int x = 0; x < board1.length; x++)   //x is the row 
		{
			System.out.print(x); 
			for(int y = 0; y < board1[0].length; y++)   //y is the column 
			{
				System.out.print(" " + board1[x][y]); 
			} //close y loop 

			//this prints a new line after every row is printed 
			System.out.println(); 
		} //close x loop	 
  } //end printBoard() 

  /*method to return the String at a certain position
    input the row and column number (starting at 1) 
  */ 
  public String atBoard(int r, int c)
  {
    return board[r-1][c-1]; 
  } //end atBoard() 

  //getBoard method 
  public String[][] getBoard()
  {
    return board; 
  } //end getBoard() 
} //end class 
