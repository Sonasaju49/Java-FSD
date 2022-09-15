package day33;

import java.io.FileWriter;

public class testt {

	public static void main(String[] args) {
		try {
			FileWriter myWriter= new FileWriter("example.txt");
			myWriter.write("hello");
			myWriter.write("welcome to java");
			myWriter.close();
		
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		// TODO Auto-generated method stub

	}

}
