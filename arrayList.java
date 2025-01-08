import java.util.ArrayList;
// import java.util.Collection;
import java.util.List;

public class arrayList {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        // List is sub-interface of Collection
        // ArrayList is a class which implements a List
        // <> is used to define the data type
        nums.add(6);
        nums.add(3);
        nums.add(9);
        nums.add(2);
        // .add() is used to add elements to the List

        System.out.println(nums.indexOf(3));
        // gives the index of the element 3

        System.out.println(nums.get(2));
        // gives the element which is present at index 2

        // for(int n:nums){
        //     System.out.println(n);
        // }    
    }
}
