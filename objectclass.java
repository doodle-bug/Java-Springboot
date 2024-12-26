class Laptop{
    String model;
    int price;

    public String toString(){
        return "Hey buddy!";
    }

    /* 
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }
    */
    // in java two objects are equal only when their values and hashcode both are equal
    // the above method is used to check that only

    public boolean equals(Laptop that){
        return this.model.equals(that.model) && this.price == that.price;
    }    
}

public class objectclass {
    public static void main(String[] args) {
        Laptop obj1 = new Laptop();
        obj1.model = "Lenovo Legion";
        obj1.price = 68000;

        Laptop obj2 = new Laptop();
        obj2.model = "Lenovo Legion";
        obj2.price = 68000;

        boolean result = obj1 == obj2;
        System.out.println(result);
        // as both has same values it still gives false because it compares the two objects by their hexadecimal values.

        boolean result1 = obj1.equals(obj2);
        System.out.println(result1);
        // this will gives true as it uses the above equals method

        System.out.println(obj1);
        System.out.println(obj2.toString());
        // both above line will give the same output i.e "Hey buddy!"
        // tostring() method is hidden and every other method is programmed gto override this method
        // it returns a string representation of the object if it's not defined already - in this case this method (toistring()) is defined above
    }
}
