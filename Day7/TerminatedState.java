// Creating a thread class by extending Thread
class MyThread2 extends Thread{

    // run() method contains the task that the thread will execute
    public void run(){
        // When the thread runs, this message is printed
        System.out.println("Thread is finished");
    }
}

public class TerminatedState {
    public static void main(String[] args) {

        // Creating an object of MyThread2 (Thread is in NEW state)
        MyThread2 t1 = new MyThread2();

        // Starting the thread, which calls the run() method
        // Thread state changes from NEW -> RUNNABLE
        t1.start();

        try {
            // Main thread waits until t1 finishes its execution
            // Without join(), main may finish before t1
            t1.join();
        } 
        catch (InterruptedException e) {
            // If the waiting thread is interrupted, this block executes
            System.out.println("Thread was interrupted " + e.getMessage());
        }

        // After the thread finishes execution, its state becomes TERMINATED
        // getState() returns the current state of thread t1
        System.out.println("State: " + t1.getState());
    }
}