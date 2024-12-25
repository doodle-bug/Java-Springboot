class Mobile{
    String brand;
    int price;
    static String name;
    // --- static makes this name variable common to all the objects
    // above 3 are instance variable 

    public void show(){
        System.out.println(brand+" : "+price+" : "+name);
    }
}

public class staticvariable {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Nothing";
        obj1.price = 30000;
        // obj1.name = "Phone 1";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 130000;
        // obj2.name = "S24 Ultra";

        // obj2.name = "Phone";
        // this will change all the objects names to Phone

        Mobile.name = "Android";
        // static variable are called as per their class name
        // can be called by object name but better avoid it as it'll create confusion 
        
        obj1.show();
        obj2.show();
    }
}
