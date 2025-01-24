import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class parallelStream {
    public static void main(String[] args) {

        int size = 10_000;
        List<Integer> nums = new ArrayList<>(size);

        Random ran = new Random();
        for(int i = 0; i<size; i++){
            nums.add(ran.nextInt(100));
        }
        
        long startSeq = System.currentTimeMillis();
        // gives the start time of operation in miliseconds
        int sum = nums.stream()
                    .map(n -> n*2)
                    .reduce(0, (c,e) -> c+e);
        long endSeq = System.currentTimeMillis();
        // gives the end time of operation in miliseconds

        long startSeq2 = System.currentTimeMillis();
        int sum2 = nums.stream()
                    .map(n -> {
                        try{
                            Thread.sleep(1);
                        }
                        catch (Exception e){
                        }
                        return n*2;
                    })
    // intentionally adding delays to find the difference in time of execution of the 3 blocks
                    .mapToInt(n -> n)
                    // mapToInt convert the element into Integer Stream
                    .sum();
                    // directly computes the sum of all elements of Integer Stream
        long endSeq2 = System.currentTimeMillis();

        long startSeq3 = System.currentTimeMillis();
        int sum3 = nums.parallelStream()
                    // parallel Stream create multiple threads to work on the operation
                    .map(n -> {
                        try{
                            Thread.sleep(1);
                        }
                        catch (Exception e){
                        }
                        return n*2;
                    })
                    .mapToInt(n -> n)
                    .sum();
        long endSeq3 = System.currentTimeMillis();

        System.out.println(sum + " " +sum2 +" "+sum3);

        System.out.println("Seq: "+(endSeq-startSeq));
        System.out.println("Seq2: "+(endSeq2-startSeq2));
        System.out.println("Seq3: "+(endSeq3-startSeq3));
        
    }
}
