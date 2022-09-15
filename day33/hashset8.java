package day33;

import java.util.HashSet;

public class hashset8 {

	public static void main(String[] args) {
		HashSet<String>t=new HashSet<>();
		t.add("a");
		t.add("b");
		t.add("c");
		t.add("d");
		HashSet<String>t1=new HashSet<>();
		t1.add("e");
		t1.add("d");
		t1.add("g");
		t1.add("h");
		t.retainAll(t1);
		System.out.println(t);
		
		
		// TODO Auto-generated method stub

	}

}
