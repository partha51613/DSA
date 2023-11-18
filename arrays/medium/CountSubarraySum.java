package arrays.medium;

public class CountSubarraySum {
    public static void main(String[] args) {
        int arr[] = new int[]{3,1,2,4};
        int target=6;
        System.out.println(findAllSubarraysWithGivenSum(arr,target));
    }

    public static int findAllSubarraysWithGivenSum(int arr[], int s) {
        // Write your code here.    

        int count=0;
        int sum=0;

        for(int i=0;i<arr.length;i++){
            sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                System.out.println(sum);
                if(sum==s){
                    count++;
                }
            }
        }
        return count;
    }
}
