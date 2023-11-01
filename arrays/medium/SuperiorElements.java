import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SuperiorElements {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 22, 12, 3, 0, 6};
        System.out.println(superiorEle(arr));
        }

        //Optimised Solution
        public static List<Integer> superiorEle(int[] a){
            int n = a.length;
            int max = Integer.MIN_VALUE;
            List<Integer> newList = new ArrayList<>();
            for(int i=n-1;i>=0;i--){
                if(a[i]>max){
                    max=a[i];
                    newList.add(a[i]);
                }
            }
            return newList;            
        }
    }

