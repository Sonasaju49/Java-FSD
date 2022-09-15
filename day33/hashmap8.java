package day33;
import java.util.HashMap;


public class hashmap8 {

	public static void main(String[] args) {
		HashMap<Integer,String>hm=new HashMap<Integer,String>();
		hm.put(1, "blue");
		hm.put(2,"green");
		hm.put(3, "black");
		hm.put(4, "yellow");
		System.out.println(" hash map is " +hm);
		if(hm.containsValue("green"))
		{
			System.out.println("yes "+ " "+ hm.get(" green"));
			
		}
		else
		{
		System.out.println("no");
		}
		
		// TODO Auto-generated method stub

	}

}
