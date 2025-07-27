/**
 * 
 *https://takeuforward.org/arrays/floor-and-ceil-in-sorted-array/
 *
 * Example 1:
Input Format: n = 6, arr[] ={3, 4, 4, 7, 8, 10}, x= 5
Result: 4 7
Explanation: The floor of 5 in the array is 4, and the ceiling of 5 in the array is 7.

Example 2:
Input Format: n = 6, arr[] ={3, 4, 4, 7, 8, 10}, x= 8
Result: 8 8
Explanation: The floor of 8 in the array is 8, and the ceiling of 8 in the array is also 8.
 */

 public class FloorCeiling{
    public static void main(String[] args) {
        int[] arr = new int[] {3, 4, 4, 7, 8, 10};
        int target = 5;
        int n=6;
        System.out.println("Floor is: " +floorSearch(arr,n,target));
        System.out.println("Ceiling is: " +ceilingSearch(arr,n,target));
    }

    public static int floorSearch(int[] arr, int n, int target){
        int low=0;
        int high=n-1;
        int floorIndex=0;
        while(low<=high){
            int mid = (low+high)/2;
            if (arr[mid]<=target){
                floorIndex = mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return arr[floorIndex];
    }    
        
    public static int ceilingSearch(int[] arr, int n, int target){
        int low=0;
        int high=n-1;
        int ceilingIndex=0;
        while(low<=high){
            int mid = (low+high)/2;
            if (arr[mid]>=target){
                ceilingIndex = mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return arr[ceilingIndex];
    }
 }