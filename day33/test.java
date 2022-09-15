package day33;

import java.io.File;

public class test {

	public static void main(String[] args) {
		File fileobj = new File("example.txt");
		try {
			boolean success=fileobj.createNewFile();
			if(success)
			{
				System.out.println("file got created");
				
			}
			else {
				System.out.println("file already exists");
				
			}
		}
		catch (Exception e) {
			System.out.println(e);
			
		}
		// TODO Auto-generated method stub

	}

}
