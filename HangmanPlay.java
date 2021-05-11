/* 
 * Naina Purushothaman 
 * 4/29/21 
 * HangmanPlay.java
 * Has the methods that are used to play the game
 */
 
import java.util.Scanner; 
import java.util.ArrayList; 

public class HangmanPlay
{
  //instance variable of a list for the letters in the alphabet 
  private ArrayList<String> letters; 

  //instance variable that is the String shown to the players that aren't guessing 
  private String[] show; 

  //default constructor 
  public HangmanPlay(String guess)
  {
    show = new String[guess.length()]; 
    //initializes show to dashes 
    for(int i = 0; i < show.length; i++)
    {
      show[i] = "_"; 
    } //end for 

    //initializes ArrayList letters
    letters = new ArrayList<String>();  
    letters.add("A"); 
    letters.add("B"); 
    letters.add("C"); 
    letters.add("D"); 
    letters.add("E"); 
    letters.add("F"); 
    letters.add("G"); 
    letters.add("H"); 
    letters.add("I"); 
    letters.add("J"); 
    letters.add("K"); 
    letters.add("L"); 
    letters.add("M"); 
    letters.add("N"); 
    letters.add("O"); 
    letters.add("P"); 
    letters.add("Q"); 
    letters.add("R"); 
    letters.add("S"); 
    letters.add("T"); 
    letters.add("U"); 
    letters.add("V"); 
    letters.add("W"); 
    letters.add("X"); 
    letters.add("Y"); 
    letters.add("Z"); 
  } //end constructor 

  //method showRules() that shows the rules 
  public void showRules() 
  {
    System.out.println("Welcome to Hangman!"); 
    System.out.println(); 
    System.out.println("Any number of players can play. The computer comes up with a word. The other players will take turns guessing letters and they will be told whether that letter is in the word and where in the word it is. You cannot guess the same letter twice, and you will be prompted for another letter if you do so. You get 6 tries/wrong answers."); 
    System.out.println(); 
  } //end showRules() method 

  //method that allows the players to guess a letter. Will return true if the guess is valid and false if the guess isn't valid, the word that the player needs to guess is input  
  public int guess(String word)
  {
    Scanner input = new Scanner(System.in); 
    boolean flag = false;
    String answer = "";  

    //the player guesses while the guess is valid (it hasn't been guessed before and it is a letter) 
    while(!flag)
    {
      System.out.print(" Guess a letter. Enter in all caps: "); 
      answer = input.nextLine(); 

      //checks if the letter hasn't been guessed before. If it has, the player has to guess again. 
      for(int h = 0; h < letters.size(); h++)
      {
        if(answer.equals(letters.get(h)))
        {
          flag = true; 
        } //end if 
      } //end for
    } //end while 
    int valid = 0;
    int pos = -1;  

    //checks whether any letter matches the word 
    for(int i = 0; i < word.length(); i++)
    {
      if(answer.equals(word.substring(i,i+1)))
      {
        valid++; 
        pos = i;   
      } //end if
    } //end for 

    //removes the letter from the ArrayList letters 
    for(int j = 0; j < letters.size(); j++)
    {
      if(letters.get(j).equals(answer))
      {
        letters.remove(j); 
      } //end if 
    } //end for 

    //changes the show array based on the guess 
    if(pos >= 0)
    {
      show[pos] = answer;
    } //end if 

    return pos; 
  } //end guess method 

  //method that prints the array of guesses 
  public void print()
  {
    for(int i = 0; i < show.length; i++)
    {
      System.out.print(show[i] + ""); 
    } //end for 
  } //end print() method 

  //method that checks if the game is over 
  public boolean gameOver()
  {
    for(int i = 0; i < show.length; i++)
    {
      if(show[i].equals("_"))
      {
        return false; 
      }
    }
    return true; 
  } //end gameOver method 
} //end class 
