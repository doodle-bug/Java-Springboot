import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class comparator {
    public static void main(String[] args) {

        Comparator<Integer> com = new Comparator<Integer>(){
            // Comparator is a interface
            public int compare(Integer i, Integer j){
                // compare comes under Comparator class
                if(i%10 > j%10){
                    return 1;
                    // return 1 means to swap
                }
                else{
                    return -1;
                    // -1 means not swap
                }
            }
        };
        
        List<Integer> nums = new ArrayList<>();
        nums.add(41);
        nums.add(38);
        nums.add(72);
        nums.add(94);

        Collections.sort(nums, com);
        // (nums, com) means sorting on the rules of com

        System.out.println(nums);
    }
}
