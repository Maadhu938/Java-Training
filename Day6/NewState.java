class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread is running.");
    }
}

public class NewState {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        System.out.println("Thread state: " + t.getState()); 
        t.start(); // Start the thread, it will move to RUNNABLE state
        System.out.println("Thread state: " + t.getState()); 
        //when the r
    }
}