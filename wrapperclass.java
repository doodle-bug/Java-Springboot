public class wrapperclass {
    public static void main(String[] args) {
        int num = 7;
        Integer num1 = num;
        // Integer num1 = new Integer(num) - this was used before but now deprecated as now it's done directly
        // autoboxing - taking a primitive value and storing it in a class object

        int num2 = num1;
        // int num2 = num1.intValue(); - this can be also used
        // unboxing - getting the value from class object to primitive type

        System.out.println(num1);
        System.out.println(num2);

        String str = "12";
        int num3 = Integer.parseInt(str);
        // parseInt - takes the string and convert it into integer
        System.out.println(num3*2);
    }
}
