class A extends Object{
    // extends Object class by default
    public A(){
        // super() is here but hidden
        System.out.println("in A");
    }
    public A(int m){
        // super() is here but hidden
        System.out.println("in A(int m)");
    }
}

class B extends A{
    public B(){
        super();
        System.out.println("in B");
    }
    public B(int n){
        this();
        /*  this will executes the constructor of the same class and 
        as there is no parameters the above constructor gets executed */
        System.out.println("in B(int n)");
    }
}

public class thisandsuper {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        B obj = new B();
    }
}
