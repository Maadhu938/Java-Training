// Creating a thread class by extending Thread
class Mythread3 extends Thread{

    // run() method contains the code that will execute when thread starts
    public void run(){

        // Print the thread name and its current state when it starts
        System.out.println(getName()+" Started state " + getState());

        // yield() pauses the current thread and gives other threads a chance to execute
        Thread.yield();

        try{
            // sleep() pauses the thread for 12 seconds
            // During this time the thread goes into TIMED_WAITING state
            Thread.sleep(12000); 
        }
        catch(InterruptedException e){
            // Executes if the thread is interrupted while sleeping
            System.out.println(getName()+" is interrupted " + e.getMessage());
        }

        // Print the thread name and state when it finishes execution
        System.out.println(getName()+" Finished state " + getState());
    }
}

// Main class
public class ThreadMethods{

    public static void main(String [] args){

        // Create two thread objects
        Mythread3 t1 = new Mythread3();
        Mythread3 t2 = new Mythread3();

        // Start both threads (state changes from NEW -> RUNNABLE)
        t1.start();
        t2.start();

        // Check and print thread states after starting
        System.out.println("After start t1 = " + t1.getState());
        System.out.println("After start t2 = " + t2.getState());

        try{
            // join() makes the main thread wait until t1 finishes
            t1.join();

            // main thread waits until t2 finishes
            t2.join();
        }
        catch(InterruptedException e){
            // Executes if the main thread is interrupted while waiting
            System.out.println("Main thread is interrupted " + e.getMessage());
        }

        // After join(), both threads should be completed
        // Their state becomes TERMINATED
        System.out.println("After join t1 state = " + t1.getState());
        System.out.println("After join t2 state = " + t2.getState());

        // isAlive() checks whether the thread is still running
        // It returns false because threads have finished execution
        System.out.println("Check t1 alive = " + t1.isAlive());
        System.out.println("Check t2 alive = " + t2.isAlive());
    }
}
//Thread.yield() -> it only hints to thread schedular/ony request
//priority basis -> can only request but doesnot guarantee that current thread will stop or not
//Main decider-> JVM amd Os decides which thread gets paused