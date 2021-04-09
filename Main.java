/* 
 *
 * Naina Purushothaman 
 * Main.java 
 * 3/10/21
 * The class with the main method, calls all the games 
 * in a series of if-statements prompting the user which
 * game they want to play 
 *
 * TO DO: Word Game with countries, states, etc.  
 */

import java.util.Scanner; 
class Main {

  //plays Mastermind 
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); 
    //prompt user which game they want to play 
    System.out.println(); 
    System.out.println("Welcome! Here are all of the game options: "); 
    System.out.println("Battleship"); 
    System.out.println("Mastermind"); 
    System.out.println("TicTacToe"); 
    System.out.println("Connect Four"); 
    System.out.println(); 

    boolean check = false; 
    int answer; 

    //prompts the user for an input, and keeps asking if answer is not valid 
    do
    {
      System.out.print("Which game do you want to play? Battleship (1), Mastermind (2), TicTacToe (3), or Connect Four (4): "); 
      answer = input.nextInt();
      if(answer == 1 || answer == 2|| answer == 3 || answer == 4)
      {
        check = true; 
      }
    } 
    while(!check); 

    if(answer == 1)
    {
      //clears the console 
      System.out.print("\033[H\033[2J");  
      System.out.flush();
      System.out.println();

      BattleshipMain m2 = new BattleshipMain(); 
      m2.play(); 
    }
    else if(answer == 2)
    {
      //clears the console 
      System.out.print("\033[H\033[2J");  
      System.out.flush();
      System.out.println();

      MastermindMain m1 = new MastermindMain(); 
      m1.play(); 
    }
    else if(answer == 3)
    {
      //clears the console 
      System.out.print("\033[H\033[2J");  
      System.out.flush();
      System.out.println();

      TicTacToeMain m3 = new TicTacToeMain(); 
      m3.play(); 
    }
    else if(answer == 4)
    {
      //clears the console 
      System.out.print("\033[H\033[2J");  
      System.out.flush();
      System.out.println();

      ConnectFourMain m4 = new ConnectFourMain(); 
      m4.play(); 
    }
  }
}
