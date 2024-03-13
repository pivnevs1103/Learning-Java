public class QuickSort {
    public static void main(String[] args) {

        int[] array = {20, 35, -15, 7, 55, 1, -22};

        quickSort(array, 0, array.length);

        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

    public static void quickSort(int[] array, int start, int end){

        // Once the arrays become one element arrays this is used to stop recursion
        if(end - start < 2){
            return;
        }

        // Returns the position of the pivot, everything smaller than the pivot is pushed to the left
        // and everything greater than the pivot is pushed to the right
        int pivotIndex = partition(array, start, end);
        quickSort(array, start, pivotIndex);
        quickSort(array, pivotIndex + 1, end);
    }

    public static int partition(int[] array, int start, int end){
        //This is using the first element as the pivot
        int pivotIndex = array[start];
        int i = start;
        int j = end;

        while(i < j){
            // Empty loop body(Using it to find a number that's smaller than the pivot)
            while(i < j && array[--j] >= pivotIndex);
             if(i < j){
                 array[i] = array[j];
             }

            // Empty loop body(Using it to find a number that's bigger than the pivot)
            while(i < j && array[++i] <= pivotIndex);
            if(i < j){
                array[j] = array[i];
            }
        }
        array[j] = pivotIndex;
        return j;
    }

}
