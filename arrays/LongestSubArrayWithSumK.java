public class LongestSubArrayWithSumK{
        public static int longSubArr(int[] arr, int k) {
            int n = arr.length;
            int sum=0;
            int c=0;
            int max=0;
    
            for(int i=0;i<n;i++){              
                sum=0;
                c=0;    
                for(int j=i;j<n;j++){
                    sum+=arr[j];
                    c++;
                    if(sum==k){
                        max = Math.max(max,c);
                    }
                    if(sum>k){
                        break;
                    }
                }
            }
            return max;
        }
    

    public static void main(String[] args) {
        int[] arr = new int[]{4,1,2,1,2,7,7,4,5,5,13};
        int k=5;
        System.out.println(longSubArr(arr,k));
    }
}