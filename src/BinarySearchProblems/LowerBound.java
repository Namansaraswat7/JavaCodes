package BinarySearchProblems;

public class LowerBound {
    /**
     * Lower bound search algorithm.<br>
     * Lower bound is kind of binary search algorithm but:<br>
     * -If searched element doesn't exist function returns index of first element which is bigger than searched value.<br>
     * -If searched element is bigger than any array element function returns first index after last element.<br>
     * -If searched element is lower than any array element function returns index of first element.<br>
     * -If there are many values equals searched value function returns first occurrence.<br>
     * Behaviour for unsorted arrays is unspecified.
     * <p>
     * Complexity O(log n).
     * <p>

     */
    public static int lowerBound(int[] array, int length, int value) {
        int low = 0;
        int high = length;
        while (low < high) {
            final int mid = (low + high) / 2;
            //checks if the value is less than middle element of the array
            if (value <= array[mid]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
    public static void main(String[] args) {

        int arr[] = {10 ,20 ,30,40,50 };
        System.out.println(lowerBound(arr,arr.length-1,55));

    }

}
