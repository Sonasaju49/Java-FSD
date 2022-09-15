package day33;

public class Classnotfoundexception {

	public static void main(String[] args) {
		try {
			Class.forName("no classs exist");
			
		}
		catch(ClassNotFoundException e) {
		
			System.out.println(e);
			
		}
		System.out.println();
		System.out.println("program then continues");
		
		// TODO Auto-generatd method stub

	}

}
