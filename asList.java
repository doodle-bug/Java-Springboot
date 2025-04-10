import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class asList {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,5,7,3,2,6);
        // asList is a method which gives a list and belongs to a class called Arrays
        // we can directly add elements in asList

        // Stream works only once

        /*
        Stream<Integer> ss = nums.stream();
        // every value of nums gets copied to ss

        Stream<Integer> s1 = ss.filter(n -> n%2 == 0);
        // creates a Stream which contains only even values of ss

        Stream<Integer> s2 = s1.map(n -> n*2);
        // multiply those even elements to 2 
        */
        
        Stream<Integer> s2 = nums.stream()
                                .filter(n -> n%2 == 0)
                                .map(n -> n*2);
        // the above block can be simply written like this


        s2.forEach(n -> System.out.println(n));
        
        
        // nums.forEach(n -> System.out.println(n));
        // forEach method - gives one value at a time
        // belongs to a class called consumer which is a functional interface
    }
}
