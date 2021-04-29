/* Naina Purushothaman 
 * 4/7/21 
 * BattleshipBoard.java 
 * Has methods that creates the boards, statically sets the ships on the board, and 
 * prints the boards 
 */

public class BattleshipBoard
{
	//builds the play board (8x8)  
	int[][] play = new int[8][8];

  //builds the guess board (8x8)
	int[][] guess = new int[8][8];

	//statically set ships on the 'play' board for the user to guess 
	public void setShips(int arr1[][])
	{
		//one ship three spaces long, horizontal 
		arr1[2][2] = 4; 
		arr1[2][3] = 4; 
		arr1[2][4] = 4;

		//one ship two spaces long, vertical 
		arr1[4][4] = 4; 
		arr1[5][4] = 4; 

		//one ship four spaces long, horizontal 
		arr1[0][1] = 4; 
		arr1[0][2] = 4; 
		arr1[0][3] = 4; 
		arr1[0][4] = 4;   
	} //end setShips() 

	//prints the play board created earlier in this class  
	public void printShips()
	{
    //prints out array header 
		System.out.println("  0 1 2 3 4 5 6 7"); 
		for(int x = 0; x < 8; x++)   //x is the row 
		{
			System.out.print(x); 
			for(int y = 0; y < 8; y++)   //y is the column 
			{
				System.out.print(" " + play[x][y]); 
			} //close y loop 

			//this prints a new line after every row is printed 
			System.out.println(); 
		} //close x loop	
	} //end printShips()

	//a method that retrieves the guess array created in this class, getter method 
	public int[][] getGuess()
	{
		return guess; 
	} //end getGuess()

	//method that retrieves the play array created in this class, getter method 
	public int[][] getPlay()
	{
		return play; 
	} //end getPlay()

	//prints the guess board that was created previously in this class 
	public void printGuess()
	{
    //prints out array header 
		System.out.println("  0 1 2 3 4 5 6 7"); 
		for(int x = 0; x < 8; x++)   //x is the row 
		{
			System.out.print(x);
			for(int y = 0; y < 8; y++)   //y is the column 
			{
				System.out.print(" " + guess[x][y]); 
			} //end inner for 
			//this prints a new line after every row is printed 
			System.out.println(); 
		} //end outer for
	} //end printGuess() 

	//allows the user who calls this method to print any int array 
	public void printArray(int arr[][])
	{
    //prints out array header 
		System.out.println("  0 1 2 3 4 5 6 7"); 
		for(int x = 0; x < 8; x++)   //x is the row 
		{
			System.out.print(x);
			for(int y = 0; y < 8; y++)   //y is the column 
			{
				System.out.print(" " + arr[x][y]); 
			} //end inner for 
			//this prints a new line after every row is printed 
			System.out.println(); 
		} //end outer for
	} //end printArray()
} //end class 
