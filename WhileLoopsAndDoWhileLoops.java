// practicing using while loop and do while loops, they will all do the same thing
public class WhileLoopsAndDoWhileLoops {
    public static void main(String[] args){

        int number = 1;
        // Simple while loop that just prints the statement and increments
        // the number variable, until the condition 'number == 5' is met
        while(number != 5){
            number++;
            System.out.println("The number is currently " + number);
        }

        // Just using to separate the loops a bit better in the output
        System.out.println();
        System.out.println();



        int number2 = 1;
        // Similar to the while loop however the do while loop executes at
        // least once, but in this case it does the same thing
        do{
            number2++;
            System.out.println("The number is currently " + number2);
        }while(number2 != 5);

        // Just using to separate the loops a bit better in the output
        System.out.println();
        System.out.println();



        // Testing to see if the break statement works in a while loop
        int number3 = 1;

        // Without the break statement this would be an infinite loop
        while(true){
            number3++;
            System.out.println("The number is currently " + number3);
            if(number3 == 5) {
                break;
            }
        }


        // Just using to separate the loops a bit better in the output
        System.out.println();
        System.out.println();


        // Testing to see how the 'continue' statement works
        int number4  = 0;

        while(number4 < 5){
            number4++;
            // Once number == 2, the continue statement will skip this
            // loop iteration and not print the statement below
            if(number4 == 2){
                continue;
            }
            System.out.println("The number is currently " + number4);
        }

    }
}
