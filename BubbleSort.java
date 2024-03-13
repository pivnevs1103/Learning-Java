/* NOTES: Bubble sorts performance degrades quickly as the amount of numbers you have to sort
increases
 - It is a O(n^2) time complexity
 - In place algorithm
 - Stable sort algorithm(preserves the relative ordering of duplicate items) */

public class BubbleSort {
    public static void main(String[] args){

        // Initiating the array
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22};

        // The first loop decreases by one as it gets sorted one by one
        for(int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0;
                lastUnsortedIndex--){

            // Goes through the array and pushes the highest number to the right
            for(int i = 0; i < lastUnsortedIndex; i++){
                if(intArray[i] > intArray[i + 1]){
                    swap(intArray, i, i + 1);
                }
            }
        }

        // Print out statement
        for (int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }

    // Swaps two number in places as it traverses the array
    public static void swap(int[] array, int num1, int num2) {

        // If values are equal it does nothing
        if (num1 == num2) {
            return;
        }

        // if num1 is bigger than num2 it swaps them in places
        int tempNum = array[num1];
        array[num1] = array[num2];
        array[num2] = tempNum;
    }
}
