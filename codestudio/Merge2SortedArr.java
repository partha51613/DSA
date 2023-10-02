import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/**
 * Merge two sorted Arrays
 */
public class Merge2SortedArr {
    public static void main(String[] args){

        //List 1
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(6);
        list1.add(7);
        list1.add(8);
        list1.add(30);
        list1.add(40);
        System.out.println("List 1" +list1);
        
        
        //List 2
        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(4);
        list2.add(5);
        list2.add(7);
        list2.add(15);
        list2.add(40);
        System.out.println("List 2" +list2);
        
        //Merging the two Lists and getting merged list in return
        System.out.println(merge2sort(list1, list2));

    }

    public static List<Integer> merge2sort(List<Integer> list1, List<Integer> list2){
        
        int n = list1.size();
        int m = list2.size();
        HashSet<Integer> unionSet = new HashSet<>();
        
        //Adding elements from list 1 to the unionSet
        for(int i=0;i<n;i++){
            unionSet.add(list1.get(i));
        }
        System.out.println("unionSet after adding list 1 is : " +unionSet);


        // Adding elements from list 2 to the unionSet
        for(int i=0;i<m;i++){
            unionSet.add(list2.get(i));
        }
        System.out.println("unionSet after adding list 2 is : " +unionSet);
        
        //Creating a unionList and copying the unionSet elements to it
        List<Integer> unionList = new ArrayList<Integer>();
        for(int it: unionSet){
            unionList.add(it);
        }
        // System.out.println(unionList);
        Collections.sort(unionList);
        return  unionList;
    }

    
}
