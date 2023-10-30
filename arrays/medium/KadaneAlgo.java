/**
 * Maximum Subarray Sum in an Array
 */

public class KadaneAlgo {
    public static void main(String[] args) {
        int[] arr = new int[]{-100,-5,1,2,1,-20,-40};
        System.out.println("Sumarray sum: " +subArraySum(arr));
        }

        

        /** O(N) solution 
         * Optimised solution
        */

        public static int subArraySum(int[] arr){
            int n = arr.length;
            int sum=0;
            int maxSum = Integer.MIN_VALUE;

            for(int i=0;i<n;i++){
                sum+= arr[i];
                maxSum = Math.max(maxSum, sum);
                if(sum<0) sum=0;
            }
            return maxSum;
        }

    
        /* O(N^2) */

        // public static int subArraySum(int[] arr){
        //     int maxSum=0;
        //     int sum=0;

        //     int i=0;
        //     int j=0;
        //     int n=arr.length;

        //     for(i=0;i<n;i++){
        //         sum=0;
        //         for(j=i;j<n;j++){
        //             sum+=arr[j];
        //             maxSum = Math.max(maxSum,sum);
        //         }
        //     }
            
        //     return maxSum;
        // }
}
