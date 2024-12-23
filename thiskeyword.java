class Human{
    private int age;
    private String name;
    // private means the variables can not be accessed outside the class

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

public class thiskeyword {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(24);
        obj.setName("Amit");

        System.out.println(obj.getAge() +" : "+ obj.getName());
    }
}
