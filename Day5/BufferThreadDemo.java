class BufferTask implements Runnable{
    private StringBuffer sb;
    public BufferTask(StringBuffer sb){
        this.sb = sb;
    }
    public void run(){
        for(int i=0;i<2000;i++){
            sb.append("a");
        }
    }
}
public class BufferThreadDemo{
    public static void main(String[] args){
        StringBuffer sb=new StringBuffer("Start");
        Thread t1=new Thread(new BufferTask(sb));
        Thread t2=new Thread(new BufferTask(sb));   
        t1.start();
        t2.start();//wait for first thread to finish
        
        try{
            t1.join();//for join() method we have to handle InterruptedException directly in main method or we can use try catch block
            t2.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(sb);
    }
}