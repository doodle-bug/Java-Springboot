class Mobile{
    String brand;
    int price;
    static String name;
    // --- static makes this name variable common to all the objects
    // above 3 are instance variable 

    public void show(){
        System.out.println(brand+" : "+price+" : "+name);
    }

    public static void show1(Mobile x){
        System.out.println(x.brand+" : "+x.price+" : "+name);
    }
}

public class staticmethod {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Nothing";
        obj1.price = 30000;

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 130000;

        Mobile.name = "Android";
        
        obj1.show();
        obj2.show();

        Mobile.show1(obj1);
    }
}
