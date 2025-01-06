// functional interface
// interface A is functional interface as it has only one method

@FunctionalInterface
// using this annotation if we use more than 1 method it will give error
interface A{
    void show();
    // void show1();
}

// class B implements A{
//     public void show(){
//         System.out.println("in B show");
//     }
// }

public class typeOfInterface {
    public static void main(String[] args) {
        // using inner class
        A obj = new A(){
            public void show(){
                System.out.println("in show");
            }
        };
        obj.show();
    }
}
