package day33;

public class Nullpointer {

	public static void main(String[] args) {
		String s =null;
		try {
			System.out.print(" first element " +s.charAt(0));
		}
		catch (NullPointerException e) {
			System.out.println("null pointer exception occur");
		}
		// TODO Auto-generated method stub

	}

}
