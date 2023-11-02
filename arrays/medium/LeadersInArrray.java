import java.util.ArrayList;
import java.util.HashMap;

/**Leaders in an array */

public class LeadersInArrray {
    public static void main(String[] args) {
        int arr[] = new int[]{10, 22, 12, 3, 0, 6};
        leadersInArray(arr);
    }

    public static void leadersInArray(int[] arr){
        int n = arr.length;
        ArrayList<Integer>  l1 = new ArrayList<>();
        int max=Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
           if(arr[i]>max){
                l1.add(arr[i]);
                max=arr[i];
           }
        }
        System.out.println(l1);
    }


}
