import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
    int age;
    String name;

    public Student(int age, String name){
        this.age = age;
        this.name = name;
    }
    
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    
}

public class comparatorImp {
    public static void main(String[] args) {
        /* 
        Comparator<Student> com = new Comparator<Student>(){
            public int compare(Student s, Student t){
                if(s.age > t.age){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        };
        */

        // using lambda expression and ternary operator on the above commented code block
        Comparator<Student> com = (s, t) -> (s.age > t.age) ? 1 : -1;

        List<Student> names = new ArrayList<>();
        names.add(new Student(24, "Amit"));
        names.add(new Student(26, "Harsh"));
        names.add(new Student(30, "Kedar"));
        names.add(new Student(22, "Atharva"));
        
        Collections.sort(names, com);

        for(Student s : names){
            System.out.println(s);
        }
        // System.out.println(names);
    }
}
