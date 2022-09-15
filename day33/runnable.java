package day33;

 class mythread implements Runnable {
	String message;
	mythread(String msg)
	{
		message=msg;
	}
	public void run()
	{
		for(int count=0;count<=5;count++)
		{
			try
			{
				System.out.println("Run method:" +message);
				Thread.sleep(100);
			}
			catch(InterruptedException ie)
			{
				System.out.println("Exception in thread:"+ ie.getMessage());
			}
		}
	}
}
 public class runnable
 {
	 public static void main(String[]args)
	 {
		 mythread ob1=new
				 mythread("MyThread ob1");
		 mythread ob2=new
				 mythread("MyThread ob2");
		 Thread t1=new Thread(ob1);
		 Thread t2=new Thread(ob2);
		 t1.start();
		 t2.start();
		 
	 }
 }
	
	


