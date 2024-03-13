/* NOTES:
- In place Algorithm
- O(n^2) time complexity
- Stable Algorithm
- Starts at index of 1 in the array and the code works through the unsorted
partition from left to right while the sorted partitioned is traversed from
right to left
*/

public class InsertionSort{
    public static void main(String[] args){

        int[] array = {20, 35, -15, 7, 55, 1, -22};

        // Assumes the first index in the array is already sorted
        // Will be sorted from left to right which is why it is incremented
        for(int firstUnsortedIndex = 1; firstUnsortedIndex < array.length;
            firstUnsortedIndex++){

            int newElement = array[firstUnsortedIndex];

            int i;

            // Traversing the sorted partition from right to left
            for(i = firstUnsortedIndex; i > 0 && array[i - 1] > newElement;
                    i--){
                array[i] = array[i - 1];
            }

            // Once the condition is met the newElement is inserted into the array
            // at place i
            array[i] = newElement;
        }

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
