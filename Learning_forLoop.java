/* Simple program just to showcase how the for loops works, all I am doing
is calling the for loop in the main method and increasing the interest rate
by calling the calculateInterest function
 */

public class Learning_forLoop {
    public static void main(String[] args){

        // simple for loop that increases the interest by 1 and prints it out
        for(double rate = 2.0; rate <= 5; rate++){
            System.out.println("$10,000 at " + rate + "% interest rate is = " +
                    calculateInterest(10000, rate));
        }
        System.out.println();

        // simple for loop that increases the interest by .25 and prints it out
        for(double i = 7.5; i <= 10; i += .25){
            System.out.println("$100 at " + i + "% interest rate is = " +
                    calculateInterest(100, i));
        }
        System.out.println();

        // Same thing as above except it showcases how to use the break statement
        // inside a for loop statement
        for(double i = 10; i <= 30; i+= 3){
            System.out.println("$100 at " + i + "% interest rate is = " +
                    calculateInterest(100, i));
            if(i == 19){
                break;
            }
        }

    }
    // A method that just calculates and returns the interest
    public static double calculateInterest(double amount, double interestRate) {

        return (amount * (interestRate / 100));
    }
}

