package day33;

public class ThreadPrority extends Thread{
	public void run()
    {
          System.out.println("run() method");
          String threadName = Thread.currentThread().getName();
          Integer threadPrio = Thread.currentThread().getPriority();
          System.out.println(threadName + " has priority " + threadPrio);
    }
    public static void main(String[] args) throws InterruptedException
    {
          ThreadPrority t1 = new ThreadPrority();
          ThreadPrority t2 = new ThreadPrority();
          ThreadPrority t3 = new ThreadPrority();

          t1.setPriority(Thread.MAX_PRIORITY);
          t2.setPriority(Thread.MIN_PRIORITY);
          t3.setPriority(Thread.NORM_PRIORITY);

          t1.start();
          t2.start();
          t3.start();
    }
}


