import tools.VeryAdvCalc;

public class inheritance {
    public static void main(String[] args) {
        VeryAdvCalc obj1 = new VeryAdvCalc();
        int r1 = obj1.add(4, 5);
        int r2 = obj1.sub(9, 4);
        int r3 = obj1.mul(3,4);
        int r4 = obj1.div(4,2);
        double r5 = obj1.power(2, 3);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
    }
}
