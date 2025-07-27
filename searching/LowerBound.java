/**
 * Lower Bound
 * https://www.codingninjas.com/studio/problems/lower-bound_8165382
 */
public class LowerBound {
    public static int lowerBound(int[] arr, int n, int target) {
        // Write your code here

        int low = 0;
        int high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= target) {
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
        System.out.println("Lower bound of " + target + " found at index: " + lowerBound(arr,5,target));
    }
}
