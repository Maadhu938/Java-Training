// Synchronization allows only one thread to access a shared resource at a time

// Two simple classes used as lock objects
class A1{}
class B1{}

public class DeadLockFree {

    // Creating shared lock objects
    static A1 a = new A1();
    static B1 b = new B1();

    public static void main(String[] args){

        // Thread 1 definition
        Thread t1 = new Thread(() -> {

            // Thread 1 acquires lock on object 'a'
            synchronized(a){

                // After locking 'a', it tries to lock 'b'
                synchronized(b){

                    // If both locks are acquired successfully, thread finishes safely
                    System.out.println("Thread 1 finished safely");
                }
            }
        });

        // Thread 2 definition
        Thread t2 = new Thread(() -> {

            // Thread 2 acquires lock on object 'b'
            synchronized(b){

                // After locking 'b', it tries to lock 'a'
                synchronized(a){

                    // If both locks are acquired successfully, thread finishes safely
                    System.out.println("Thread 2 finished safely");
                }
            }
        });

        // Start both threads
        t1.start();
        t2.start();
    }
}