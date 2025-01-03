enum Laptop{
    Macbook(2500), XPS(2800), Legion(1800), Surface;

    private Laptop() {
        price = 500;
    }

    private int price;

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class enumclass {
    public static void main(String[] args) {
        // Laptop lap = Laptop.Macbook;
        // System.out.println(lap+" : "+lap.getPrice());

        for(Laptop lap : Laptop.values()){
            // values() gives all the constants in the enum
            System.out.println(lap+ " : "+lap.getPrice());
        }
    }
}
