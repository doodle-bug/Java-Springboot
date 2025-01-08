import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class set {
    public static void main(String[] args) {
        Set<Integer> nums = new HashSet<Integer>();
        // Set doesn't support index value
        // That's why the elements gets printed in random order

        nums.add(63);
        // .add() is used to add elements to the List
        nums.add(35);
        nums.add(91);
        nums.add(26);

        // Set only holds unique value
        // nums.add(6);

        // instead of for loop we can use Iterator interface to iterate through elements
        Iterator<Integer> values = nums.iterator();
        
        while (values.hasNext()) {
            // .hasNext() is used to check whether there is next element in the Set
            System.out.println(values.next());
            // comes under Iterator interface and used to retrieve next element from the iteration
        }

        // for(int n:nums){
        //     System.out.println(n);
        // }    
    }
}
