// Creating two simple classes that will act as lock objects
class A{}
class B{}

public class DeadLock {

    // Creating static objects of A and B
    // These objects will be used as locks for synchronization
    static A a = new A();
    static B b = new B();

    public static void main(String[] args){

        // Thread 1 definition using lambda expression
        Thread t1 = new Thread(() -> {

            // Thread 1 acquires lock on object 'a'
            synchronized(a){
                System.out.println("Thread 1 acquired lock on a");

                try{
                    // Pause the thread for some time
                    // This increases the chance of deadlock
                    Thread.sleep(100000);
                }
                catch(InterruptedException e){}

                // Thread 1 now tries to acquire lock on object 'b'
                System.out.println("Thread 1 waiting for Obj B: ");

                synchronized(b){
                    // This will execute only if 'b' is free
                    System.out.println("Thread 1 acquired lock on b");
                }
            }
        });

        // Thread 2 definition
        Thread t2 = new Thread(() -> {

            // Thread 2 acquires lock on object 'b'
            synchronized(b){
                System.out.println("Thread 2 acquired lock on b");
            }

            try{
                // Pause the thread to simulate processing time
                Thread.sleep(100000);
            }
            catch(InterruptedException e){}

            // Thread 2 now tries to acquire lock on object 'a'
            System.out.println("Thread 2 waiting for Obj A: ");

            synchronized(a){
                // This will execute only if 'a' is free
                System.out.println("Thread 2 acquired lock on a");
            }
        });

        // Start both threads
        t1.start();
        t2.start();
    }
}