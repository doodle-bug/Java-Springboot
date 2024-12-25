class A{
    public void show(){
        System.out.println("in A show");
    }
    public void config(){
        System.out.println("in A config");
    }
}

class B extends A{
    
    @Override
    public void show(){
        System.out.println("in B show");
    }
}

public class methodoverriding {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        // when calling show() the object will call the method of its own rather than of the superclass
        obj.config();
    }
}
