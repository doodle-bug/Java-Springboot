class Calculator{
    int num = 5;

    public int add(int n1, int n2){
        System.out.println(num);
        int r = n1 + n2;
        return r;
    }
}

public class classnobject {
    public static void main(String[] args) {
        // int data = 10;

        Calculator obj = new Calculator();
        // object creation
        int result = obj.add(3,4);
        // int result = num1+num2;
        System.out.println(result);
    }
}
