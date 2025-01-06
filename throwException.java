// throw exception

public class throwException {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        // first the try block executes, if error arrives it will execute the catch block
        try
        {
            j = 18/i;
            if (j==0)
                throw new ArithmeticException("I don't want 0");
            // this msg (e) will be displayed by the catch exception below.
        }
        catch(ArithmeticException e){
            // Exception is a class here
            j = 18/1;
            System.out.println("That's the default output." + e);
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
