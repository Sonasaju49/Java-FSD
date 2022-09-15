package day33;

public class Numforexc {

	public static void main(String[] args) {
		try 
		{
			int num=Integer.parseInt("a");
			System.out.println(num);
			
		}
		catch(NumberFormatException e)
		{
			System.out.println("Number Format Expection");
		}
		finally
		{
			System.out.println("anyways");
		}
		// TODO Auto-generated method stub

	}

}
