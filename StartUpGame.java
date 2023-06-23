import java.util.ArrayList;
public class StartUpGame {
  public static void main(String[] args) {
    private int numOfGuesses = 0;

    StartUp theStartUp = new StartUp();
    int randomNum = (int) (Math.random() * 5);

    int[] locations = {randomNum, randomNum + 1, randomNum + 2};
    theStartUp.setLocationCells(locations);
    boolean isAlive = true;

    while (isAlive) {
      int guess = helper.getUserInput("enter a number");
      String result = (String) theStartUp.checkYourSelf(guess);
      numOfGuesses++;
      if (result.equals("kill")) {
        isAlive = false;
        System.out.println("You took " + numOfGuesses + " guesses");
      } // close if
    } // close while
  } // close main

}