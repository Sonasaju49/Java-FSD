package day33;

public class runnableinterface {
	String message;
	MyThread(String msg)
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
				System.out.println("")
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
