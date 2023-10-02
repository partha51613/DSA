public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4};
        int N=5;
        int sum1=0;
        for(int i=0;i<N-1;i++){
            sum1 = sum1 + arr[i];
        }

        int sum2 = ((N)*(N+1))/2;
        int sum3 = sum2-sum1;
        System.out.println("Sum 1: " +sum1 +"Sum 2 :" +sum2);
        System.out.println(sum3);
    }
}
