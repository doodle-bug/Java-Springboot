final class Calc{
    // when final is added in a class, we can't extend this class anywhere
    public final void show(){
        // method overriding doesn't works
        System.out.println("in Calc show");
    }
    public void add(int a, int b){
        System.out.println(a+b);
    }
}

// class AdvCalc extends Calc{
//     // can't extends hence stops the inheritance
//     public void show(){
//         System.out.println("in Adv Calc");
//     }
// }

public class finalkeyword{
    public static void main(String[] args) {
        // int num = 9;
        // num = 8;
        // System.out.println(num);
        // // value of num will change

        // final int num1 = 10;
        // num1 = 11;
        // // in this case it will not change
        // System.out.println(num1);

    // Calc obj = new AdvCalc();
    // obj.show();
    // obj.add(10, 15);
    }
}