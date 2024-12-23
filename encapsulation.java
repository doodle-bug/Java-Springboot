class Human{
    private int age;
    private String name;
    // private means the variables can not be accessed outside the class

    public int getAge(){
        return age;
    }
    // to access private variables methods are used

    public void setAge(int a){
        age = a;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }

}

public class encapsulation {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(24);
        obj.setName("Amit");

        System.out.println(obj.getAge() +" : "+ obj.getName());
    }
}
