package day33;

public class NullException {

	public static void main(String[] args) {
		String a =null;
		try
		{
			if(a.equals("Hello"))
				System.out.println("same");
			else
				System.out.println("not same");
		}
		catch(NullPointerException e) {
			System.out.println("NullPointerException Found");
			
			
		}
		// TODO Auto-generated method stub

	}

}
