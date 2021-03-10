/* 
 *
 * Naina Purushothaman 
 * Main.java 
 * 3/10/21
 * The class with the main method, calls all the games 
 * in a series of if-statements prompting the user which
 * game they want to play 
 *
 */

import java.util.Scanner; 
class Main {
  public static void main(String[] args) {
    /*MastermindMain m1 = new MastermindMain(); 
    m1.play(); */

    BattleshipMain m2 = new BattleshipMain(); 
    m2.play(); 
  }
}
