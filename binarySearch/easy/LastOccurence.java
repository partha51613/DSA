/**
 * Last Occurence
 * https://takeuforward.org/data-structure/last-occurrence-in-a-sorted-array/
 */
public class LastOccurence {
    public static int lastOccurence(int[] arr, int n, int target) {
        // Write your code here

        int low = 0;
        int high = n - 1;
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                ans = mid;
                low=mid+1;
            }
            if(arr[mid]<target){
                low = mid + 1;
            }
            if(arr[mid]>target){
                high=mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {3,4,13,13,13,20,40};
        int target = 13;
        int size=7;
        int val = lastOccurence(arr, size, target);
        if(val==-1){
            System.out.println("Not found");
        }else{
            System.out.println("Last index found at : " +val);
        }
    }
}
