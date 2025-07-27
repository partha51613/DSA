import java.util.HashMap;
import java.util.Map.Entry;

/**
 * Return the number that appears only once
 */

public class ReturnNumberAppearOnce {
    public static void main(String[] args) {
        int[] arr = new int[]{3,4,3,4,5,2,2,6,6,6,6,4,4,4,7,7};
        System.out.println(appearOnce(arr));
    }

    public static int appearOnce(int[] arr){
        int n= arr.length;
        HashMap<Integer,Integer> map1 = new HashMap<>();
        for(int i=0;i<n;i++){
            if(map1.containsKey(arr[i])){
                int value = map1.get(arr[i]);
                map1.put(arr[i], value+1);
                
            }
            else{
                map1.put(arr[i],1);
            }
        }

        int key1=0;
        // System.out.println("Final map" +map1);
        for(Entry<Integer, Integer> it: map1.entrySet()){
            if(it.getValue() == 1){
                key1 = (int) it.getKey();
            }
        }
        return key1;
    }
}
