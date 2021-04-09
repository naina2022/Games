/* Connect Four 
 * Naina Purushothaman 
 * 4/9/21 
 * ConnectFourMain.java 
 * main method, runs the game by calling methods from ConnectFourBoard 
 */

public class ConnectFourMain
{
	public void play()
	{

		//creates instance of the FourBoard class  
		ConnectFourBoard b1 = new ConnectFourBoard(); 

		//displays the rules by calling rules method from FourBoard 
		b1.rules(); 

		//creates game board, 2D array called board 
		int[][] board = new int[6][7]; 

		//initializes all of the spaces of the 2D array to 0
		for(int j = 0; j < 6; j++)
		{
			for(int h = 0; h < 7; h++)
			{
				board[j][h] = 0; 
			}
		}
	
		//prints board before first guess 
		b1.print(board); 
		System.out.println(); 

		//allows players to keep playing until one wins 
		int counter = 0; 
		do
		{
			//calls play method from FourBoard, allows both players to make guesses  
			board = b1.play(board); 

			//prints board after each guess  
			b1.print(board); 

			//checks for four down, across, or diagonal 
			if(b1.checkDown(board) || b1.checkAcross(board) || b1.checkDiagonal(board))
			{
				counter++; 
			}
		}
		while(counter == 0); 

		System.out.println(); 
		System.out.println("Four in a Row!"); 
		System.out.println(); 

	}
}
