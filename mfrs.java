import java.util.Arrays;
import java.util.List;

public class mfrs {
    public static void main(String[] args) {
        
        List<Integer> nums = Arrays.asList(4,5,7,3,2,6);

        int result = nums.stream()
                        .filter(n -> n%2==0)
                        // output will be 4, 2, 6
                        .map(n -> n*2)
                        // output will be 8, 4, 12
                        .reduce(0, (c,e) -> c+e);
                        // here 0 is the initial value, c is carry and e is element & c+e is the operation
                        // output will be 0+8 = 8, then 8+4 = 12, then 12+12 = 24
        System.out.println(result);
        // result = 24
    }
}
