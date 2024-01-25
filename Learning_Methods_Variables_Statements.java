public class Learning_Methods_Variables_Statements {
    public static void main(String[] args){

        // Declaring variables
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        // Calling the method using the initial variables that were declared
        calculateScore(gameOver, score, levelCompleted, bonus);

        // Calling the method using the values I chose
        calculateScore(true, 10000, 7, 50);

        // Reusing the variables name but assigning different values
        score = 12345;
        levelCompleted = 9;
        bonus = 150;

        // Calling the method with a return type and storing it in a variable
        int returnHighestScore = calculateScoreNew(gameOver, score, levelCompleted, bonus);
        System.out.println("Your new high score is " + returnHighestScore);

        //Another way of printing out the result without storing the value in a new variable
        System.out.println("Using the method with the return type and not storing in a new " +
                "variable, your new high score is " + calculateScoreNew(gameOver, score,
                levelCompleted, bonus));
    }

    // Created a method with no return type
    public static void calculateScore(boolean gameOver, int score,
                                      int levelCompleted, int bonus){

        // Using an if statement to calculate(Note: It will always be true)
        if(gameOver){
            score += levelCompleted * bonus;
        }
        System.out.println("Congrats your score is " + score);
    }

    // Created a method with a return type and same variables to showcase
    // how scoping of variables works
    public static int calculateScoreNew(boolean gameOver, int score,
                                     int levelCompleted, int bonus){

        if (gameOver){
            score += levelCompleted * bonus;
        }
        return score;
    }
}
