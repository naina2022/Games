/*
* MastermindBoard.java
* Laxmi and Naina
* 10/16/20
* Modfied by Naina on 4/5/21 
*/

import java.util.ArrayList;

public class MastermindBoard
{
  //builds the array to hold the colors. - Naina  
  String [] colors = new String[4];  

  //array, what colors we are using
 
  //populates the 'colors' array with the colors that we are using and then prints out the array - Laxmi 
  public void totalColors()
  {
    String [] allColors = new String[6];
    allColors[0] = "Yellow (Y)";
    allColors[1] = "Green (G)";
    allColors[2] = "Blue (B)";
    allColors[3] = "Red (R)";
    allColors[4] = "Pink (P)";
    allColors[5] = "Orange (O)";

    //divider to separate each of the user's guesses - Naina 
    System.out.println("-------------------------------------"); 
    
    //prints the array - Laxmi 
    System.out.println("Here are your color options: "); 
    for(int i = 0; i < 6; i++)
    {
      System.out.println(allColors[i]); 
    } //end for loop 
    System.out.println(); 
  } //end totalColors() 

  //method to statically set the four colors and positions in an array that is passed to method. //creates array for the computer to fill setColors() randomly - Naina and Laxmi 
  ArrayList<String> pickColors = new ArrayList<String>(6); 
  public void pickColorsFrom()
  { 
    pickColors.add("Y"); 
    pickColors.add("G");
    pickColors.add("B");
    pickColors.add("R");
    pickColors.add("P");
    pickColors.add("O");
  }  //end pickColorsFrom() 

  //randomly chooses colors for each new game - Laxmi and Naina 
  public String[] setColors()
  {
    int length = 6; 
    for (int n = 0; n < 4; n++)
    {
      int rand = (int) (Math.random() * length);
      
      colors[n] = pickColors.get(rand);
      pickColors.remove(rand);
      length--; 
    } //end for 
    /*colors[0] = "B"; 
    colors[1] = "R"; 
    colors[2] = "G"; 
    colors[3] = "Y";
    return colors;  */
    return colors;
  } //end setColors() 

  //method to check the user's guesses. Returns a number of either red or white pegs- position and color or color respectively
  public int[] checkGuesses(String[] guesses)
  {
    //prints out the user's guesses each time they guess 
    System.out.println(); 
    System.out.println("Here are your guesses: ");
    /*for(int j = 0; j < 4; j++)
    {
      System.out.print(guesses[j] + " "); 
    }*/

    //for loop which checks both color and position. Returns the final int array with the number of red pins and the number of white pins - Naina
    int checkPosition = 0;  
    for(int i = 0; i < 4; i++)
    {
      if(guesses[i].equals(colors[i]))
      {
        checkPosition++; //checkPosition = red pins 
      } //end of if statement 
    } //end of for loop 
    
    //nested for loop which checks only which colors are right - Laxmi
    int checkColors = 0; //checkColors = white pins + red pins 
    for(int k = 0; k < 4; k++)
    {
      for(int l = 0; l < 4; l++)
      {
        if (guesses[k].equals(colors[l]))
        {
          checkColors = checkColors + 1;
        } // end if statement
      }//end nested for loop
    }//end for loop
   // System.out.println(checkColors);

    //subtracts checkPosition from checkColors to set checkColors just to the number of white pins - Laxmi   
    checkColors = checkColors - checkPosition;
    
    //creates an int array of the number of red pins as the first element and the number of white pins as the second - Naina 
    int[] pins = {checkPosition, checkColors};

    //returns the int array  
    return pins; 
  } //end of checkGuesses 
} //end of class 
