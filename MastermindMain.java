/*
*
* Main.java
* Laxmi and Naina
*10/16/20
*
*/

import java.util.Scanner; 
public class MastermindMain {
  public void play() {
    //creates a String array to hold the colors randomly set in Board - Naina  
    String [] colors1 = new String[4]; 

    //creates an instance of the Board class - Naina 
    MastermindBoard b1 = new MastermindBoard(); 

    //creates an instance of the User class - Naina 
    MastermindUser u1 = new MastermindUser(); 

    //displays the rules for the user - Naina 
    u1.showRules();
    System.out.println();  

    //calls the setColors method from the Board class and passes the colors array to the method. This will statically set the array 'colors' to the four colors.- Laxmi  
    b1.pickColorsFrom();
    colors1 = b1.setColors(); 
    
    //this allows the user to guess for a maximum of 10 tries or while they don't get it right. 
    int numTries = 0;

    //declares an int array to store the array returned by the checkGuesses method in Board  
    int[] pins;

    //creates 10x4 array to store and display the user's guesses - Naina and Laxmi 
    String[][] display = new String[10][4]; 
    String[] guessUser; 

    //sets placeholders for guessUser 
    for(int i = 0; i < 10; i++)
    {
      for(int j = 0; j < 4; j++)
      {
        display[i][j] = "0"; 
      }
    }

    //variable that keeps track of the row number which the user's guess should go into in the array 
    int rowCount = 0; 
    int[][] trackPins = new int[10][2]; 
    do
    {
      //clears the screen after each guess 

      //prints out all of the color options each time the user guesses 
      b1.totalColors(); 
      
      //prints out the number of tries the user is currently on
      System.out.println("Try #" + (numTries + 1)); 

      //checkGuesses method called by passing the result of the guess method into the method. Sets the 'pins' int array to the value of the checkGuesses method each time the user makes a guess.
      
    
      guessUser = u1.guess(); 
      pins = b1.checkGuesses(guessUser);

      //stores user guesses in the display array 
      display[rowCount][0] = guessUser[0]; 
      display[rowCount][1] = guessUser[1]; 
      display[rowCount][2] = guessUser[2]; 
      display[rowCount][3] = guessUser[3];

      //clears the console - Naina 
      System.out.print("\033[H\033[2J");  
      System.out.flush();
      System.out.println(); 

       
      trackPins[rowCount][0] = pins[0]; 
      trackPins[rowCount][1] = pins[1];

      //prints the display array - Laxmi 
      for(int i = 0; i < 10; i++)
      {
        for(int j = 0; j < 4; j++)
        {
          System.out.print(display[i][j] + " "); 
        }
         System.out.println("|" + trackPins[i][0] + " " + trackPins[i][1]);  
      }

      //prints out the user's feeback for the number of red pins and the number of white pins - Laxmi 
      System.out.println("Red pins: " + pins[0]); 
      System.out.println("White pins: " + pins[1]);

      //increments numTries to keep track of what try the user is on - Naina 
      numTries++;
      rowCount++;  

      System.out.println(); 
      Scanner input = new Scanner(System.in);  
      System.out.print("Press Enter to continue: "); 
      String output = input.nextLine(); 

      //reprints the guessing array so the user can see it
      /*for(int i = 0; i < 10; i++)
      {
        for(int j = 0; j < 4; j++)
        {
          System.out.print(display[i][j] + " "); 
        }
        System.out.println(); 
      }
      System.out.println("Red pins: " + pins[0]); 
      System.out.println("White pins: " + pins[1]);*/
    } while(numTries < 10 && pins[0] != 4);

    //makes user know they won the game if the number of red pins is 4 - Laxmi 
    if (pins[0] ==4)
    {
      System.out.println("Congratulations! You broke the code!");
    }
    
    //user knows they ran out of chances and they lost if the number of tries is greater than 10 - Laxmi 
    if (numTries == 10)
    {
      System.out.println("------------------------------------"); 
      System.out.println("You lost! You did not break the code in 10 tries!");
    }

    //prints out the right answer
    System.out.println();  
    System.out.println("Here was the right answer: "); 
    //prints out 'colors1' array with the colors statically set by the method "setColors" in Board class - Naina
    for(int i = 0; i < 4; i++)
    {
      System.out.print(colors1[i]); 
    }
  } //end method play
} //end class
