public class Print1ToNRecursion {
    public static int[] printNos(int x) {
        
        // Write Your Code Here
        int[] arr= new int[x];
        return returnNo(arr,x);
        
    }

    public static int[] returnNo(int[] arr, int n){
        if(n==0){
            return arr;
        }
        else{
            arr[n-1] = n;
            return returnNo(arr,n-1);
        }
    }

    public static void main(String[] args){
        int n=10;
        int[] arr1 = printNos(n);
        // System.out.print(printNos(n));
        for(int it: arr1){
            System.out.println(it);
        }
    }
}
