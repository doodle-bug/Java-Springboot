// try - catch/multiple catch exception

public class exceptions {
    public static void main(String[] args) {
        int i = 2;
        int j = 0;

        int nums[] = new int[5];

        // first the try block executes, if error arrives it will execute the catch block
        try
        {
            j = 18/i;
            System.out.println(j);
            System.out.println(nums[2]);
            System.out.println(nums[5]);
        }
        catch(ArithmeticException e){
            // Exception is a class here
            System.out.println("Can't divide by zero.");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Stay in your limits.");
        }

        // this is used if we don't know what else can go wrong.
        catch(Exception e){
            System.out.println("Something went wrong." + e);
            // this e gives the type of error
            // this exception should be after all the other exception
        }
        System.out.println(j);
        System.out.println("Bye");
    }
}
