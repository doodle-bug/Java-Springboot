class Human{
    private int age;
    private String name;
    // private means the variables can not be accessed outside the class

    public Human(){
        // creating a default constructor
        age = 12;
        name = "John";
        // giving default values to the object
    }

    public Human(int age, String name) {
        // creating a parameterized constructor
        this.age = age;
        this.name = name;
    }



    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
        // "this" refers to the current object which is calling this method
        // the first age is instance variable and the 2nd one is local variable
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class constructor {
    public static void main(String[] args) {
        Human obj = new Human();
        Human obj1 = new Human(26, "Mohit");

        obj.setAge(24);
        obj.setName("Amit");

        System.out.println(obj.getAge() +" : "+ obj.getName());
        System.out.println(obj1.getAge() +" : "+ obj1.getName());
    }
}
