/**
 * Naina Purushothaman 
 * 3/30/21
 * TicTacToeBoard.java 
 *
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
        board[i][j] = ""; 
      }
    }
  }

  //method to print the board 
  public void printBoard()
  {
    for(int i = 0; i < 3; i++)
    {
      for(int j = 0; j < 3; j++)
      {
        System.out.print(board[i][j] + " ");  
      }
    }
    System.out.println(); 
  }

  /*method to return the String at a certain position
    input the row and column number (starting at 1) 
  */ 
  public String atBoard(int r, int c)
  {
    return board[r-1][c-1]; 
  }

  //getBoard method 
  public String[][] getBoard()
  {
    return board; 
  }
}
