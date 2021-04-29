/* 
 * Naina Purushothaman 
 * 4/26/21 
 * TwentyQuestionsMain.java 
 * Has the play() method which is used to play the game 
 */
 
public class TwentyQuestionsMain
{
  //method that plays the game 
  public void play()
  {
    //creates an instance of the TwentyQuestionsPlay class 
    TwentyQuestionsPlay p1 = new TwentyQuestionsPlay(); 
    p1.showRules(); 

    System.out.println(); 
    System.out.println(); 
     System.out.println("Answer Player: Think of a secret word!"); 

    boolean flag = false; 
    int count = 0; 
    while(!flag || count <= 20)
    {
      if(p1.guess())
      {
        System.out.println("Game Over!"); 
        System.exit(0); 
      } //end else if 
      count++; 
    } //end while 
  } //end play() method 
} //end class 
