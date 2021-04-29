/* 
 * Naina Purushothaman 
 * 4/26/21 
 * TwentyQuestionsPlay.java 
 * Has the methods which allow the player to play the game
 */

import java.util.Scanner; 

public class TwentyQuestionsPlay
{
  //method that displays the rules 
  public void showRules()
  {
    System.out.println("Welcome to 20 Questions!"); 
    System.out.println(); 
    System.out.println("This is a 2 player game. There is a guessing player and the answer player. The answer player thinks of any word while the guessing player types in yes or no questions to try and guess what the word is. The game ends when the word has been guessed."); 
    System.out.println(); 
    System.out.println("If the guessing player is out of questions to ask, there will be a sample question that they can ask provided by the computer.");
  } //end showRules() method 

  public boolean guess()
  {
    Scanner input = new Scanner(System.in); 
    Scanner input1 = new Scanner(System.in); 
    System.out.println(); 
    
    System.out.println(); 
    System.out.println("Guessing Player: What is your question? Here is a sample question if you have run out of ideas: " + randomQuestions() + "  ");

    String question = input.nextLine(); 

    //clears the console 
    System.out.print("\033[H\033[2J");  
    System.out.flush();
    System.out.println();
    System.out.println(); 

    System.out.println("Here is the question: " + question); 
    System.out.println("Answer player: Yes(Y), No(N), They got it! (E): ");

    String answer = input1.nextLine(); 
    if(answer.equals("E"))
    {
      return true; 
    } //end if 
    return false;
  } //end guess() method 

  //generates a random sample question if the guessing player needs a question
  public String randomQuestions()
  {
    //creates array of sample questions 
    String[] questions = {"Is it alive?", "Is is it a noun?", "Is it a person?", "Is it a verb?", "Is it an adjective?", "Is it an object?", "Is it small?", "Have I seen this before?", "Have I used this before?", "Is it an animal?"};

    //generated a random number 
    int num = 0; 
    num = (int) ((Math.random() * 9) + 1); 

    //returns a random question from the array 
    return questions[num]; 
  } //end randomQuestions() method 
} //end class 
