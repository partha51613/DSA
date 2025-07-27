/**
 * Upper Bound
 * https://www.codingninjas.com/studio/problems/implement-upper-bound_8165383
 * 
 */
public class UpperBound {
    public static int upperBound(int[] arr, int n, int target) {
        // Write your code here

        int low = 0;
        int high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 2, 7, 13 };
        int target = 2;
        System.out.println("Upper bound of " + target + " found at index: " + upperBound(arr,5,target));
    }
}
