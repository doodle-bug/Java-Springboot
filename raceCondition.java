class Counter{
    int count = 0;
    public synchronized void increment(){
        // synchronized will make sure the method will be called by one thread at a time
        count++;
    }
}

public class raceCondition {
    public static void main(String[] args) throws InterruptedException {

        Counter c = new Counter();

        Runnable obj1 = () -> {
            for(int i = 1; i<=10000; i++){
                c.increment();
            }
        };
        Runnable obj2 = () -> {
            for(int i = 1; i<=10000; i++){
                c.increment();
            }
        };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        // tells the main to wait before the t1 and t2 complete total execution
        /*
         * if both the threads reaches the increment() method at the same time,
         * the execution stops there and it will throw InterruptedExecution and
         * the value of c at that time will be printed.
         */

        System.out.println(c.count);
    }
}