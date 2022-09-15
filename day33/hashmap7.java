package day33;
import java.util.HashMap;


public class hashmap7 {

	public static void main(String[] args) {
		HashMap<Integer,String>hm=new HashMap<Integer,String>();
		hm.put(1, "blue");
		hm.put(2,"green");
		hm.put(3, "black");
		hm.put(4, "yellow");
		System.out.println(" hashmap is " +hm);
		if(hm.containsKey(1))
		{
			System.out.println("yes" + " " +hm);
			
		}
		else
		{
		System.out.println("no");
		}
		
		
		// TODO Auto-generated method stub

	}

}
