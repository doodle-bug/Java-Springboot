// class A implements Runnable {
//     // to implement a thread the class should extend thread class
//     public void run(){
//         // the method name should be run so that the scheduler knows which to executre when calling start()
//         for(int i = 1; i<=5; i++){
//             System.out.println("Hi");
//             try {
//                 Thread.sleep(2);
//                 // is used to pause the execution of the current thread for a specified amount of time(in milliseconds)
//             } 
//             catch (InterruptedException e) {
//                 e.printStackTrace();
//                 // used to help the developer understand the source of exception
//             }
//         }
//     }    
// }

// class B implements Runnable {
//     public void run(){
//         for(int i = 1; i<=5; i++){
//             System.out.println("Hello");
//             try {
//                 Thread.sleep(2);
//             } 
//             catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }    
// }

public class runnablej {
    public static void main(String[] args) {
        Runnable obj1 = () -> {
            for(int i = 1; i<=5; i++){
                System.out.println("Hi");
                try {
                    Thread.sleep(2);
                    // is used to pause the execution of the current thread for a specified amount of time(in milliseconds)
                } 
                catch (InterruptedException e) {
                    e.printStackTrace();
                    // used to help the developer understand the source of exception
                }
            }
        };
        Runnable obj2 = () -> {
            for(int i = 1; i<=5; i++){
                System.out.println("Hello");
                try {
                    Thread.sleep(2);
                    // is used to pause the execution of the current thread for a specified amount of time(in milliseconds)
                } 
                catch (InterruptedException e) {
                    e.printStackTrace();
                    // used to help the developer understand the source of exception
                }
            }
        };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
