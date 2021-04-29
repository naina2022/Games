/* 
 * Naina Purushothaman 
 * 3/30/21 
 * TicTacToeMain.java 
 * Has the play() method which actually plays the game by 
 * creating instances of the TicTacToeBoard and TicTacToePlay classes 
 */

public class TicTacToeMain
{
    //method that plays the game 
  	public void play() 
	  {
		TicTacToeBoard t1 = new TicTacToeBoard(); //a constructor 
		
		//System.out.println("Welcome to the game. Here is your board: ");  

		//gets the play board created in Board class  
		String[][] play = t1.getBoard();  
	
		//b1.printArray(play1); 
    TicTacToePlay p1 = new TicTacToePlay(); //a constructor
    p1.showRules(); 

		System.out.println(); 

		//prints the board for the user  
		t1.printBoard(play);  

		//plays the game 
		int check = 0; 
    int check2 = 0; 
    int[] guesses; 
    int checkGuess1 = 0; 
    int checkGuess2 = 0; 

		do
		{ 
      //player 1 guess and check  
      do
      {
        guesses = p1.guessUser(); 
        checkGuess1 = p1.checkUser1(guesses, play); 
      }
      while(checkGuess1 == 0); 

      //clears the console 
      System.out.print("\033[H\033[2J");  
      System.out.flush();
      System.out.println();

      //prints board 
      t1.printBoard(play); 

      //ends the game if player X gets three in a row 
      if(p1.checkThree1(play))
      {
        System.out.print("Game Over. Player X Wins."); 
        System.exit(0); 
      } //end if 

      //checks if the players tied after this move 
      if(p1.checkTie(play))
      {
        System.out.print("Tie"); 
        System.exit(0); 
      } //end if 

      //player 2 guess and check 
      do
      {
        guesses = p1.guessUser(); 
        checkGuess2 = p1.checkUser2(guesses, play); 
      }
      while(checkGuess2 == 0); 

      //ends the game if player Y gets three in a row 
      if(p1.checkThree2(play))
      {
        System.out.print("Game Over. Player O Wins."); 
        System.exit(0); 
      } //end if 

      //checks if the players tied after this move 
      if(p1.checkTie(play))
      {
        System.out.print("Tie"); 
        System.exit(0); 
      } //end if 

      //clears the console 
      System.out.print("\033[H\033[2J");  
      System.out.flush();
      System.out.println();
      
			if(p1.checkThree1(play))
      {
        check++; 
      }
      if(p1.checkThree2(play))
      {
        check++; 
      }
			t1.printBoard(play);
			System.out.println(); 
		}
		while(check == 0);

		System.out.println("Game Over");
		System.out.println(); 
		t1.printBoard(play); 
 
	}  //close play method 
} //close class 
