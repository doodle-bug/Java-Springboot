import java.util.HashMap;
import java.util.Map;

public class map {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<String, Integer>();
        // <> contains datatype of key:value pair
        
        students.put("Amit", 87);
        // .put() method is used to add pair to the map
        students.put("Bhavik", 45);
        students.put("Harsh", 91);
        students.put("Amol", 72);

        students.put("Harsh", 94);
        // keys can't be repeated, it just modifies the value belonging to Harsh

        // System.out.println(students);
        // prints whole map in random order

        // System.out.println(students.get("Harsh"));
        // .get() method prints the value of the given key

        // System.out.println(students.keySet());
        // .keySet() method gives all the Keys of the set

        for (String s : students.keySet()) {
            System.out.println(s+" : "+students.get(s));
        }
    }
}
