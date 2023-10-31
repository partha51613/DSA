/**
 * 
 * Rearrange by Sign
 * Input:
 * arr[] = {1,2,-4,-5}, N = 4
 * Output:
 * 1 -4 2 -5
 * 
 */

public class RearrangeBySign {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,-1,-2,-3};
        int n = arr.length;
        System.out.println("Array Length:" + n);
        RearrangebySign(arr, n);

    }

    public static void RearrangebySign(int[] arr, int n) {

        int evenIndex = 0;
        int oddIndex = 1;
        int[] newArr = new int[n];

        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                newArr[evenIndex] = arr[i];
                evenIndex = evenIndex + 2;
                System.out.println(arr[i]);
            } else {
                newArr[oddIndex] = arr[i];
                oddIndex = oddIndex + 2;
                System.out.println(arr[i]);
            }
        }

        System.out.println("Rearranged array elements are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
