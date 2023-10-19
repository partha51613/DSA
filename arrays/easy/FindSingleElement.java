public class FindSingleElement {
    
    public class Solution {

        public static void main(String[] args) {
        int[] arr = new int[]{4,1,2,1,2,7,7,4,5,5,13};
        System.out.println(maxElement(arr));
        }
    
        public static int maxElement(int[] arr){
            int n = arr.length;
            int maximum =arr[0];

            //Get the max value from the array to create a new array of max+1 size
            for(int i=0;i<n;i++){
               maximum =  Math.max(maximum,arr[i]);
            }
            
            //NewArrary
            int[] newArr = new int[maximum+1];
            
            // Hash the given array in this new Array
            for(int i=0;i<n;i++){
                newArr[arr[i]]++;
            }

            //Find the element with count 1
            for(int i=0;i<maximum+1;i++){
                if(newArr[i]==1){
                    return i;
                }
            }
            
            return -1;
        }
    }
}
        


