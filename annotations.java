/*Annotations in Java are a powerful 
feature used to provide metadata to 
Java code. They do not change the execution 
of the program but provide additional 
information to the compiler, 
runtime, or tools during development. */
class A{
    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("in A show");
    }
}

class B extends A{
    @Override
    // helps the compiler to know that the method of the superclass is overridden
    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("in B show");
    }
}

public class annotations {
    public static void main(String[] args) {
        B obj = new B();
        obj.showTheDataWhichBelongsToThisClass();
    }
}
