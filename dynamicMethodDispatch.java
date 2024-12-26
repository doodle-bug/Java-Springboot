class A{
    public void show(){
        System.out.println("in A show");
    }
}

class B extends A{
    @Override
    public void show(){
        System.out.println("in B show");
    }
}

class C extends A{
    @Override
    public void show(){
        System.out.println("in C show");
    }
}

@SuppressWarnings("unused")
class D{
    public void show(){
        System.out.println("in C show");
    }
}

public class dynamicMethodDispatch {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        obj = new B();
        // A obj = new B(); can be written like this
        obj.show();

        obj = new C();
        // A obj = new C(); can be written like this
        obj.show();

        // obj = new D();
        // this line will not work as D is not extending A
        obj.show();
    }
}
