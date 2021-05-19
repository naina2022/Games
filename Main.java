/* 
 * Naina Purushothaman 
 * Main.java 
 * 3/10/21
 * The class with the main method, calls all the games 
 * in a series of if-statements prompting the user which
 * game they want to play 
 */

import java.util.Scanner; 
class Main 
{

  //prints out all the game options that the user can play 
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); 
    //prompt user which game they want to play 
    System.out.println(); 
    System.out.println("Welcome! Here are all of the game options: "); 
    System.out.println(); 
    System.out.println("Battleship (1)"); 
    System.out.println("Mastermind (2)"); 
    System.out.println("TicTacToe (3)"); 
    System.out.println("Connect Four (4)"); 
    System.out.println("Twenty Questions (5)"); 
    System.out.println("Hangman (6)"); 
    System.out.println(); 

    boolean check = false; 
    int answer; 

    //prompts the user for an input, and keeps asking if answer is not valid 
    do
    {
      System.out.print("Which game do you want to play. Enter a number: "); 
      answer = input.nextInt();
      if(answer == 1 || answer == 2|| answer == 3 || answer == 4 || answer == 5 || answer == 6)
      {
        check = true; 
      } //end if
    } //end do while
    while(!check); 

    //series of if-statements that checks what the user inputted and plays the corresponding game
    if(answer == 1)
    {
      //clears the console 
      System.out.print("\033[H\033[2J");  
      System.out.flush();
      System.out.println();

      //creates an instance of the BattleshipMain class 
      BattleshipMain m2 = new BattleshipMain(); 

      //calls the method in BattleshipMain called play() which plays the game
      m2.play(); 
    } //end if
    else if(answer == 2)
    {
      //clears the console 
      System.out.print("\033[H\033[2J");  
      System.out.flush();
      System.out.println();

      //creates an instance of the MastermindMain class 
      MastermindMain m1 = new MastermindMain(); 

      //calls the method in MastermindMain called play() which plays the game
      m1.play(); 
    } //end else if
    else if(answer == 3)
    {
      //clears the console 
      System.out.print("\033[H\033[2J");  
      System.out.flush();
      System.out.println();

      //creates an instance of the TictacToeMain class 
      TicTacToeMain m3 = new TicTacToeMain(); 

      //calls the method in TicTacToeMain called play() which plays the game 
      m3.play(); 
    } //end else if
    else if(answer == 4)
    {
      //clears the console 
      System.out.print("\033[H\033[2J");  
      System.out.flush();
      System.out.println();

      //creates an instance of the ConnectFourMain class 
      ConnectFourMain m4 = new ConnectFourMain(); 

      //calls the method in ConnectFourMain called play() which plays the game
      m4.play(); 
    } //end else if
    else if(answer == 5)
    {
      //clears the console 
      System.out.print("\033[H\033[2J");  
      System.out.flush();
      System.out.println();

      //creates an instance of the TwentyQuestionsMain class 
      TwentyQuestionsMain m5 = new TwentyQuestionsMain(); 

      //calls the method in TwentyQuestionsMain called play() which plays the game 
      m5.play(); 
    } //end else if
    else if(answer == 6)
    {
      //clears the console 
      System.out.print("\033[H\033[2J");  
      System.out.flush();
      System.out.println();

      //creates an instance of the TwentyQuestionsMain class 
      HangmanMain m6 = new HangmanMain(); 

      //calls the method in TwentyQuestionsMain called play() which plays the game 
      m6.play(); 
    } //end else if
  } //end main method 
} //end class 
