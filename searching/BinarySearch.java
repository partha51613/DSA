/**
 * 
 * https://www.codingninjas.com/studio/problems/binary-search_972
 * 
 */

public class BinarySearch {

    public static int search(int[] nums, int target) {
        // Write your code here.

        int n = nums.length;
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 7, 13 };
        int target = 7;
        System.out.println("Number " + target + " found at index: " + search(arr, target));
    }
}
