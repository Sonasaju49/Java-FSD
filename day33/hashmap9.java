package day33;

import java.util.HashMap;
import java.util.Set;

public class hashmap9 {

	public static void main(String[] args) {
		HashMap<Integer,String>hm=new HashMap<Integer,String>();
		hm.put(1, "blue");
		hm.put(2,"green");
		hm.put(3, "black");
		hm.put(4, "yellow");
		Set set=hm.entrySet();
		System.out.println("Set Values " +set);
		
		// TODO Auto-generated method stub

	}

}
