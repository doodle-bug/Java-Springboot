public class stringbufferbuilder {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Amit");
        // create a string of buffer size 16 
        // stores a sting and gives 16 extra spaces

        System.out.println(sb.capacity());
        
        sb.append(" Anand");
        System.out.println(sb);


    }
}
