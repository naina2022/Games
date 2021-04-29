/*
* MastermindUser.java
* Laxmi and Naina
* 10/16/20
* Modified by Naina 
*/

import java.util.Scanner; 

public class MastermindUser
{
  //method which displays the rules to the user - Naina 
  public void showRules()
  {
    System.out.println("WELCOME TO MASTERMIND"); 
    System.out.println(); 
    System.out.println("RULES"); 
    System.out.println("- There are four colors in four positions that you have to guess."); 
    System.out.println("- You will be prompted for a color guess in each position and you will enter your guess in a single, uppercase letter."); 
    System.out.println("- You will be given back the number of red pins and white pins which corresponds to the correct position and color and the color but incorrect position, respectively."); 
    System.out.println("Then you will be able to guess again. There can't be more than one of the same color."); 
  }

  //method for the User to guess the colors in the randomly set array. Returns a String array with the four guesses. 
  public String[] guess()
  {
    //creates instance of Scanner class 
    Scanner input = new Scanner(System.in); 

    //Asks the user what color they want to guess for each position and sets each of their answers to four variables. - Naina 
    String position1;
    String position2;
    String position3;
    String position4;

    //will prompt the user for a color in each position and, if the color doesn't match any of the options or was typed incorrectly, it will prompt them again until they enter a valid answer 

    //prompt for first position - Laxmi 
    do
    {
      System.out.print("First Position: "); 
      position1 = input.nextLine(); 
    } while (!position1.equals("Y") && !position1.equals("G") && !position1.equals("B") && !position1.equals("R") && !position1.equals("P") && !position1.equals("O"));

    //prompt for second position - Laxmi  
    do
    {
    System.out.print("Second Position: "); 
    position2 = input.nextLine();
    } while (!position2.equals("Y") && !position2.equals("G") && !position2.equals("B") && !position2.equals("R") && !position2.equals("P") && !position2.equals("O"));
    
    //promopt for third position - Laxmi 
    do
    {
    System.out.print("Third Position: "); 
    position3 = input.nextLine(); 
    } while (!position3.equals("Y") && !position3.equals("G") && !position3.equals("B") && !position3.equals("R") && !position3.equals("P") && !position3.equals("O"));

    //prompt for fourth position - Laxmi 
    do
    {
    System.out.print("Fourth Position: "); 
    position4 = input.nextLine(); 
    } while (!position4.equals("Y") && !position4.equals("G") && !position4.equals("B") && !position4.equals("R") && !position4.equals("P") && !position4.equals("O"));

    //creates a String array called guesses which stores the user's four guesses. - Naina 
    String [] guesses = {position1, position2, position3, position4}; 

    return guesses; 
  }//end of guess method 
}//end of class 
