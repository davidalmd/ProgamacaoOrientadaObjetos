import java.util.ArrayList;

public class SimpleStartupGame {
    public static void main(String[] args) {
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();

        SimpleStartup theStartup =  new SimpleStartup();
        int randomNum = (int) (Math.random() * 5);

        // int [] location = {randomNum, randomNum + 1, randomNum + 2};
        ArrayList<String> location = new ArrayList<String>();
        location.add(Integer.toString(randomNum));
        location.add(Integer.toString(randomNum + 1));
        location.add(Integer.toString(randomNum + 2));
        theStartup.setLocationCells(location);

        boolean isAlive = true;

        while (isAlive) {
            String guess = helper.getUserInput("enter a number: ");
            String result = theStartup.checkYourself(guess);
            numOfGuesses++;
            if (result.equals("kill")){
                isAlive = false;
                System.out.printf("You took " + numOfGuesses + " guesses.");
            }
        }
    }
}
