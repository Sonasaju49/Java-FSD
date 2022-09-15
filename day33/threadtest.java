package day33;

 class multiple extends Thread{
	 private Thread thread;
	 private String threadname;
	 multiple(String msg)
	 {
		 threadname=msg;
		 System.out.println("creating thread:"+threadname);
		 
	 }
	 public void run()
	 {
		 System.out.println("running thread:"+threadname);
		 try
		 {
			 for(int i=0;i<5;i++)
			 {
				 System.out.println("Thread:"+threadname+","+i);
				 Thread.sleep(50);
				 
			 }
		 }
		 catch(InterruptedException e)
		 {
			 System.out.println("Exception in thread:"+threadname);
			 
		 }
		 System.out.println("Thread"+threadname+"continue");
		 
	 }
	 public void start()
	 {
		 System.out.println("Start method"+threadname);
		 if(thread==null)
		 {
			 thread=new Thread(this,threadname);
			 thread.start();
		 }
	 }
 }
 public class threadtest
 {
	

	public static void main(String[] args) {
		multiple thread1=new multiple("first thread");
		thread1.start();
		multiple thread2=new multiple("second thread");
		thread2.start();
	}
 }
		// TODO Auto-generated method stub

	


