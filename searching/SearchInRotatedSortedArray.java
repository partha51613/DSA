import java.util.*;


public class SearchInRotatedSortedArray {

    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();

        /*Program Inputs */
        Integer[] myarr = new Integer[]{5,6,7,8,9,10,0,2,3};
        int target = 7;
        

        Collections.addAll(arr,myarr);
        System.out.println(search(arr,arr.size(),target));
    }

    public static int search(ArrayList<Integer> arr, int n, int k) {      
        int minIndex=0; 
        int min=Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            if(arr.get(i)<min){
                min=arr.get(i);
                minIndex=i;
            }
        }
        Collections.sort(arr);

        int low=0;
        int high=n-1;
        int ans=-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr.get(mid)==k){
                ans = mid;
                break;
            }else if(arr.get(mid)>k){
                high = mid-1;
            }else{
                low=mid+1;
            }
        }

        if(ans==-1){
            return -1;
        }else{
            int val = minIndex+ans;
            if(val>=n){
                return val-n;
            }else{
                return val;
            }
        }
    }
}
