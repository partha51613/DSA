public class TwoSum{
    public static void main(String[] args) {
        int[] arr = new int[]{4,1,2,1,2,7,7,4,5,5,13};
        int target=9;
        System.out.println(getTwoValues(arr,target));
        }
    public static String getTwoValues(int[] arr, int t){
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==t){
                    return "YES";
                }
            }
        }
        return "NO";
    
    }
}