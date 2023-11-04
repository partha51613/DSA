public class OccurenceOfX {
    public static void main(String[] args) {
        int[] arr = new int[] {1,1,1,2,2,2,3,4,6,6,6};
        int target = 6;
        int n=arr.length;
        int floor=fs(arr,n,target);
        int ceil=cs(arr,n,target);
        System.out.println("Ceiling is: " +ceil);
        System.out.println("Floor is: " +floor);
        System.out.println("Target:" +target +" occured for " +(ceil-floor+1) +" times");
    }


    //Ceiling Search
    public static int cs(int[] arr, int n, int target){
        int low=0;
        int high=n-1;
        int ans=-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]<=target){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }

    //Floor Search
    public static int fs(int[] arr, int n, int target){
        int low=0;
        int high=n-1;
        int ans=-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>=target){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }

}
