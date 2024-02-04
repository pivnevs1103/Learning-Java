/* Method overloading is when you have multiple methods with the same name
but different signature. Java will automatically be able to tell it apart */
public class Main {
    public static void main(String[] args) {

        //calling the first method
        int newScore = calculateScore("Sergey", 500);
        System.out.println("New Score is " + newScore);

        //Calling the second(overloaded method)
        calculateScore(75);

        // Calling the first(original with two parameters) method again to make sure it works
        // Also did some testing with different values in different places to see how Java would react
        calculateScore("Victor", 99);

        // Calling the third method to test the method overload again
        calculateScore();

    }

    // Simple method that's used as print out statement with a return that multiplies
    // the score by 1000
    public static int calculateScore(String playerName, int score) {

        System.out.println("Player " + playerName + " scored " + score
                + " points");
        return score * 1000;
    }

    // Method has the same name as the previous but I am using method overload
    // by changing the signature, in this case there is only one parameter
    public static void calculateScore(int score) {


        System.out.println();
        System.out.println("Unnamed Player scored " + score
                + " points");
    }

    public static void calculateScore() {

        System.out.println();
        System.out.println("No player name, no player score");
    }
}