package day33;

import java.util.HashMap;

public class hashmap4 {

	public static void main(String[] args) {
		HashMap<Integer,String>hm=new HashMap<Integer,String>();
		hm.put(1, "blue");
		hm.put(2,"green");
		hm.put(3, "black");
		hm.put(4, "yellow");
		System.out.println(" original linked map" +hm);
		hm.clear();
		System.out.println("new mapping" +hm);
		
		// TODO Auto-generated method stub

	}

}
