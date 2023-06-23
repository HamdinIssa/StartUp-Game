
import java.util.ArrayList;
public class StartUpBust {
 
    private int numOfGuesses = 0;
    private ArrayList<StartUp> startUps = new ArrayList<StartUp>() ;
    private GameHelper helper = new GameHelper();



    public void setUpGame(){

    StartUp one = new StartUp();
    one.setName("Google");
    StartUp two = new StartUp();
    two.setName("Microsoft");
    StartUp three = new StartUp();
    three.setName("Apple");

    startUps.add(one);
    startUps.add(two);
    startUps.add(three);
    
    System.out.println("Your goal is to sink three companies");
    System.out.println("Google, Microsoft, Apple");
    System.out.println("Try to sink them all in the fewest number of guesses");


    for(StartUp startUp : startUps)
{
	ArrayList<String> newLocation = helper.placeStartUp(3);
	
	startUp.setLocationCells(newLocation);
	

}//end for

}//end setupgame



    private void startPlaying(){

	while (!startUps.isEmpty()){
	String userGuess = (String) helper.getUserInput("Enter a guess");
	checkUserGuess(userGuess);

}//end While

finishGame();

}//end startplaying

    private void checkUserGuess(String userGuess){

	numOfGuesses++;
	String result="";
for(StartUp startUpToTest : startUps){
	 result = startUpToTest.checkYourSelf(userGuess);
	if (result.equals("hit")){break;}//end if
	if(result.equals("kill")){startUps.remove(startUpToTest);break;}//end if
}//end for

System.out.println(result);

}//end checkuserguess

    private void finishGame(){

	System.out.println("All startUps are dead! Your stock is now worthless");

	if(numOfGuesses <= 18){

	System.out.println("it only took you" + numOfGuesses + " guesses.");
	System.out.println("You got out before your options sank.");


         }//end if

else{

	System.out.println("Took you long enough. " + numOfGuesses + " gueses.");
	System.out.println("Fish are dancing with your options");


}//end else



}//end finishgame


 public static void main(String[] args) {

	StartUpBust game = new StartUpBust();
	game.setUpGame();
	game.startPlaying();

  } // close main

}



