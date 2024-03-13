/* NOTES:
- In place algorithm
- Unstable Algorithm
- Each Traversal selects the largest element and moves it in the sorted partition
- Usually better than bubble sort and doesn't require as much swapping
 */

public class SelectionSort {
    public static void main(String[] args){

        // Initiating the array
        int[] array = { 20, 35, -15, 7, 55, 1, -22};

        // Outer loop that decreases the last unsorted index once a value has been sorted
        for(int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0;
                lastUnsortedIndex--){

            // Index of the largest element in the array in place 0
            int largestNumber = 0;

            // Goes through the whole array and once the larger value has been found it is
            // assigned to the largestNumber variable
            for(int i = 1; i <= lastUnsortedIndex; i++){
                if(array[i] > array[largestNumber]) {
                    largestNumber = i;
                }
            }

            // Swaps the largest number found with the last place in the unsorted index
            swap(array, largestNumber, lastUnsortedIndex);
        }

        // Printout Statement
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

    // Swaps two number in places as it traverses the array
    public static void swap(int[] array, int num1, int num2){

        // If values are equal it does nothing
        if(num1 == num2){
            return;
        }

        // Swaps num1 and num2 in places using an extra variable
        int tempNum = array[num1];
        array[num1] = array[num2];
        array[num2] = tempNum;
    }
}
