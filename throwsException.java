class A{
    public void show() throws ClassNotFoundException{
        Class.forName("Calc"); 
    }
}

public class throwsException {
    public static void main(String[] args) {
        A obj = new A();
        try {
            obj.show();
        } 
        catch (ClassNotFoundException e) {
            e.printStackTrace();
            // printStackTrace gives the hierarcy of methods (like which method is calling whom.)
        }
    }
}
