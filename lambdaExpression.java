// functional interface
// interface A is functional interface as it has only one method

@FunctionalInterface
// using this annotation if we use more than 1 method it will give error
interface A{
    int add(int i, int j);
    // void show1();
}

// class B implements A{
//     public void show(){
//         System.out.println("in B show");
//     }
// }

public class lambdaExpression {
    public static void main(String[] args) {
        // using inner class
        /*
        A obj = new A(){
            public void show(int i){
                System.out.println("in show " + i);
            }
        };
        */

        // the above can be done in one line using lambda expression
        A obj = (i, j) -> i+j;
        // -> is lambda expression
        /*  
        if there is only one variable in method, the above statement can be written as:
        A obj = i -> System.out.println("in show " + i);
        */
        int result = obj.add(5, 9);
        System.out.println(result);
    }
}
