/* Connect Four 
 * Naina Purushothaman 
 * 4/9/21 
 * ConnectFourBoard.java 
 * Class that has methods which displays rules, checks for four in a row, column, or diagonal, and prints the board 
 */

import java.util.Scanner; 

public class ConnectFourBoard
{
	Scanner input = new Scanner(System.in); 

	//method which displays the rules 
	public void rules()
	{
		System.out.println(); 
		System.out.println("Welcome to Connect Four!"); 
		System.out.println(); 
		System.out.println("Here are the rules: "); 
		System.out.println(); 
		System.out.println("This is a two player game. For each turn, enter the column you would like to place your chip in and, if you are Player 1, a 1 will be placed in the spot you choose. If you are Player 2, a 2 will be placed in the spot your choose. The game will end when one player has reached four in a row."); 
		System.out.println("---------------------------------------------"); 
	}
	//method that allows players to place their chips on the board 
	public int[][] play(int arr[][])
	{
		int row = 0; 
		int column = 0; 
		int counter = 5; 

		//prompts user for column choice 
		System.out.print("Player 1: Which column do you want to place chip? "); 
		column = input.nextInt(); 

		//clears screen
		System.out.print("\033[H\033[2J");  
    		System.out.flush();
	
		//checks if the row is available 
		if(arr[5][column - 1] == 1 || arr[5][column - 1] == 2)
		{
			counter = 5; 
			do
			{	
				counter--; 	
			}
			while(arr[counter][column - 1] == 1 || arr[counter][column - 1] == 2); 
		}

		arr[counter][column - 1] = 1; 

		print(arr);
 
		//checks if Player 1 has gotten a four down or four across 
		if(checkDown(arr) || checkAcross(arr) || checkDiagonal(arr))
		{
			return arr; 
		}

		row = 0; 
		column = 0; 
		counter = 5; 
		
		//Player 2's turn, prompts Player 2 for their column guess
  
		System.out.print("Player 2: Which column do you want to place chip? "); 
		column = input.nextInt(); 

		//clears screen
		System.out.print("\033[H\033[2J");  
    		System.out.flush();
	
		//checks if the row is available 
		if(arr[5][column - 1] == 1 || arr[5][column - 1] == 2)
		{
			counter = 5; 
			do
			{	
				counter--; 	
			}
			while(arr[counter][column - 1] == 1 || arr[counter][column - 1] == 2); 
		}

		arr[counter][column - 1] = 2; 

		return arr; 

	} //end of method 

	//method to print array (board) 
	public void print(int arr[][])
	{
		//prints the column headers 
		System.out.println(); 
		System.out.println("1   2   3   4   5   6   7"); 
		System.out.println("---------------------------"); 
		for(int j = 0; j < 6; j++)	
		{
			for(int h = 0; h < 7;  h++)
			{
				System.out.print(arr[j][h] + " | "); 
			}
			System.out.println(); 
		}
		System.out.println(); 
	} //end of method 

	//method which checks if there are four down 
	public boolean checkDown(int arr[][])
	{
		for(int h = 0; h < 7; h++)
		{
			for(int j = 0; j < 3; j++)
			{
				if(arr[j][h] == 1 && arr[j+1][h] == 1 && arr[j+2][h] == 1 && arr[j+3][h] == 1)
				{
					return true; 
				}
				else if(arr[j][h] == 2 && arr[j+1][h] == 2 && arr[j+2][h] == 2 && arr[j+3][h] == 2)
				{
					return true; 
				}
			} //end of inner for loop 
		} //end of outer for loop 
		return false; 
	} //end of method 

	//method which checks if there are four across 
	public boolean checkAcross(int arr[][])
	{
		for(int h = 0; h < 6; h++)
		{
			for(int j = 0; j < 4; j++)
			{
				if(arr[h][j] == 1 && arr[h][j+1] == 1 && arr[h][j+2] == 1 && arr[h][j+3] == 1)
				{
					return true; 
				}
				else if(arr[h][j] == 2 && arr[h][j+1] == 2 && arr[h][j+2] == 2 && arr[h][j+3] == 2)
				{
					return true; 
				}
			} //end of inner for loop 
		} //end of outer for loop 
		return false; 
	} //end of method 

	//checks if there is four diagonal 
	public boolean checkDiagonal(int arr[][]) 
	{
		//checks for diagonals with a negative slope 
		for(int h = 6; h > 0; h--)
		{
			for(int j = 5; j > 0; j--)
			{
				if(arr[j][h] == 1 && arr[j-1][h-1] == 1 && arr[j-2][h-2] == 1 && arr[j-3][h-3] == 1)
				{
					return true; 
				}
				else if(arr[j][h] == 2 && arr[j-1][h-1] == 2 && arr[j-2][h-2] == 2 && arr[j-3][h-3] == 2)
				{
					return true; 
				}
			} //end of inner for loop 
		} //end of outer for loop 

		//checks for diagonals with a positive slope 
		for(int h = 0; h < 6; h++)
		{
			for(int j = 5; j > 0; j--)
			{
				if(arr[j][h] == 1 && arr[j-1][h+1] == 1 && arr[j-2][h+2] == 1 && arr[j-3][h+3] == 1)
				{
					return true; 
				}
				else if(arr[j][h] == 2 && arr[j-1][h+1] == 2 && arr[j-2][h+2] == 2 && arr[j-3][h+3] == 2)
				{
					return true; 
				}
			} //end of inner for loop 
		} //end of outer for loop 

		//returns false if there are no diagonals with positive or negative slope 
		return false;

	} //end of method 
}
