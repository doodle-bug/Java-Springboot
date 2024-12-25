class Mobile{
    String brand;
    int price;
    static String name;

    static{
        name = "Phone";
        System.out.println("Static block");
    }

    // using constructor to initialize
    // everytime an object is created it calls the constructor
    public Mobile(){
        brand = "";
        price = 20000;
        System.out.println("Constructor block");
    }

    public void show(){
        System.out.println(brand+" : "+price+" : "+name);
    }   
}

public class staticblock {
    public static void main(String[] args) {

        // Class.forName("Mobile");
        // Used to load a class without creating object
        // and when a class loads the static block gets executed
        
        Mobile obj1 = new Mobile();
        obj1.brand = "Nothing";
        obj1.price = 30000;

        Mobile obj2 = new Mobile();

        obj1.show();
        obj2.show();
    }
}
