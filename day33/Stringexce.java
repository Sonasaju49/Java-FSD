package day33;

public class Stringexce {

	public static void main(String[] args) {
		try 
		{
			String s="sona ";
			char c=s.charAt(8);
			System.out.println(c);
		}
		catch (StringIndexOutOfBoundsException e)
		{
			System.out.println("outbound");
			
		}
		finally
		{
			System.out.println("print anyways");
		}
		// TODO Auto-generated method stub

	}

}
