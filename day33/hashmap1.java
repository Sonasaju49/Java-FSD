package day33;

import java.util.HashMap;
import java.util.Map;

public class hashmap1 {

	public static void main(String[] args) {
		HashMap<Integer,String> hashmap=new HashMap<Integer,String>();
		hashmap.put(1, " black");
		hashmap.put(2, "blue");
		hashmap.put(3,"red");
		hashmap.put(4, " green");
		System.out.println(hashmap);
		System.out.println("or");
		System.out.println();
		for(Map.Entry x : hashmap.entrySet()) {
			System.out.println(x.getKey()+ " "+x.getValue());
			
		}
		
		// TODO Auto-generated method stub

	}

}
