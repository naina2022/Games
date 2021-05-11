/* 
 * Naina Purushothaman 
 * 5/11/21 
 * HangmanMain.java
 * Has the play() method that plays the game 
 */

import java.util.ArrayList; 

public class HangmanMain
{
  //method that plays the game 
  public void play()
  {
    //ArrayList of words the computer could pick 
    ArrayList<String> words = new ArrayList<String>(); 
    words.add("COMPUTER"); 
    words.add("QUESTION"); 
    words.add("STRING"); 
    words.add("WORDS"); 
    words.add("CODING"); 
    words.add("SPRING"); 
    words.add("PROJECT"); 
    words.add("GAMES"); 
    words.add("NUMBER"); 

    //generates random number and assigns the guess to that index 
    int pick = (int)((Math.random() * 8)); 
    String toGuess = words.get(pick); 

    //creates an instance of the HangmanPlay class 
    HangmanPlay p1 = new HangmanPlay(toGuess); 

    //shows rules 
    p1.showRules(); 

    //boolean variable that checks whether the game is over or not
    boolean flag = false; 

    //variable that keeps track of the number of wrong answers 
    int tries = 0;  

    int result; 

    //prints out the word with the correct number of blanks instead of the letters 
    p1.print(); 

    //loop that plays the game until the player guesses the word or until they exceed 6 wrong answers 
    while(!flag && tries < 6)
    {
      result = p1.guess(toGuess);

      //increments tries if the player guesses wrong 
      if(result == -1)
      {
        tries++; 
      } 

      //prints the word with blanks 
      p1.print();

      //checks whether the game is over 
      flag =  p1.gameOver(); 
    } //end while 

    //if the player loses the game and exceeds 6 wrong answers 
    if(tries >= 6)
    {
      System.out.println(); 
      System.out.println("Out of tries!");

      //prints out what the correct word was 
      System.out.println("Here was the word: " + toGuess);  
    } //end if 
    //if the player wins the game 
    else
    {
      System.out.println(); 
      System.out.println("You guessed it!"); 
    } //end else 
  } //end play() method 
} //end class  
