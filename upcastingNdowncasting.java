class A{
    public void show1(){
        System.out.println("in A show");
    }
}

class B extends A{
    public void show2(){
        System.out.println("in B show");
    }
}

public class upcastingNdowncasting {
    public static void main(String[] args) {
        A obj = (A)new B();
        // this is upcasting
        obj.show1();

        B obj1 = (B) obj;
        // downcasting - here obj is of type A so type casting is used to make it of type B
        obj1.show2();

    }
}
