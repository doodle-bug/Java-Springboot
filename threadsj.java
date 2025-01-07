class A extends Thread {
    // to implement a thread the class should extend thread class
    public void run(){
        // the method name should be run so that the scheduler knows which to executre when calling start()
        for(int i = 1; i<=20; i++){
            System.out.println("Hi");
            try {
                Thread.sleep(5);
                // is used to pause the execution of the current thread for a specified amount of time(in milliseconds)
            } 
            catch (InterruptedException e) {
                e.printStackTrace();
                // used to help the developer understand the source of exception
            }
        }
    }    
}

class B extends Thread {
    public void run(){
        for(int i = 1; i<=20; i++){
            System.out.println("Hello");
            try {
                Thread.sleep(5);
            } 
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }    
}

public class threadsj {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        // here obj1 and obj2 are threads

        // obj2.setPriority(Thread.MAX_PRIORITY);
        /*
        Priority ranges [1,10], using priority we can only suggest the scheduler
        whom priority should be gives but it depends on the scheduler that it gives 
        priority or not
        */

        obj1.start();
        // start() is used to execute the run()
        obj2.start();
    }
}
