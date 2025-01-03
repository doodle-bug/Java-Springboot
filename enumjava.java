// enum is a special data type that enables a variable to be a set of predefined constants
enum Status{
    // java treats everything as class so Status here is a class
    Running, Failed, Pending, Success;
    // 0, 1, 2, 3 (position of these named constants)
    // all these 4 are objects of the class also called Named Constants
}

public class enumjava {
    public static void main(String[] args) {
        // Status[] s = Status.values();
        
        // for (Status status : s) {
        //     System.out.println(status+ " : "+ status.ordinal());
        // }

        Status s = Status.Success;
        // as we're working with constants switch is preferred over if else

        System.out.println(s.getClass().getSuperclass());
        
        switch (s) {
            case Running:
                System.out.println("All good.");
                break;

            case Failed:
                System.out.println("Try again.");
                break;

            case Pending:
                System.out.println("Please wait.");
                break;
        
            default:
                System.out.println("Done.");
                break;
        }

        // if(s == Status.Running){
        //     System.out.println("All good.");
        // }
        // else if (s == Status.Failed) {
        //     System.out.println("Try again.");
        // }
        // else if (s == Status.Pending) {
        //     System.out.println("Please wait.");
        // }
        // else{
        //     System.out.println("Done.");
        // }
    }
}
