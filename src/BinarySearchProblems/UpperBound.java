package BinarySearchProblems;

public class UpperBound {
    /**
     * Upper bound search algorithm.<br>
     * Upper bound is kind of binary search algorithm but:<br>
     * -It returns index of first element which is grater than searched value.<br>
     * -If searched element is bigger than any array element function returns first index after last element.<br>
     * <br>
     * Behaviour for unsorted arrays is unspecified.
     * <p>
     * Complexity O(log n).

     */

    public static int upperBound(int[] array, int length, int value) {
        int low = 0;
        int high = length;
        while (low < high) {
             int mid = (low + high) / 2;
            //System.out.println(mid);
            if (value >= array[mid]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30 ,40 ,50};
        System.out.println(upperBound(arr,arr.length-1,22));


    }
}
