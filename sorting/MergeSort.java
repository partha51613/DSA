import java.util.ArrayList;

public class MergeSort {
    public static void main(String[] args) {
        System.out.println("Merge Sort");
        int[] arr = new int[] {787,4545,3,2,4,7,985,1,3};
        int length= arr.length;
        mergeSort(arr, 0, length-1);
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
    
    }

    public static void mergeSort(int[] arr, int low, int high){
        
        if(low>=high){
            return;
        }
        int mid = (low+high)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1,high);
        merge(arr,low,mid,high);

    }
    public static void merge(int[] arr, int low, int mid, int high){

        int[] temp = new int[high-low+1];
        int k=0;
        int left=low;
        int right = mid+1;

        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp[k]=arr[left];
                left++;
            }else{
                temp[k] = arr[right];
                right++;
            }
            k++;
        }

        while(left <= mid){
            temp[k++] = arr[left++];
        }
        while(right <= high){
            temp[k++] = arr[right++];
        }

        // transfering all elements from temporary to arr //
        for (int i = low; i <= high; i++) {
            arr[i] = temp[i - low];
        }

        /*ArrayList<Integer> temp = new ArrayList<>(); // temporary array
        int left = low;      // starting index of left half of arr
        int right = mid + 1;   // starting index of right half of arr
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        //  if elements on the right half are still left //
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        // transfering all elements from temporary to arr //
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }*/

    }
}
