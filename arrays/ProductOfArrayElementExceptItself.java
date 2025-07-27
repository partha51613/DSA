/**
 * https://leetcode.com/problems/product-of-array-except-self/
 */
public class ProductOfArrayElementExceptItself {
    
    /**
     * This solution does not handle a few edge cases
     */
    public static int[] productExceptSelf(int[] nums) {
        int prod=1;
        int[] ans  = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            prod=1;
            for(int j=0;j<nums.length;j++){
                if(j==i){
                    continue;
                }
                prod *= nums[j];
            }
            ans[i] = prod; 
        }
        return ans;
    }
    /**
     * TODO : Write optimised solution
     * 
     */

    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4};
        for(int i: productExceptSelf(arr)){
            System.out.println(i);
        }
    }
}
