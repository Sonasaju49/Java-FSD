package day33;

import java.util.LinkedList;
import java.util.Iterator;
public class linked2 {

	public static void main(String[] args) {
		LinkedList<String>a=new LinkedList<>();
		a.add("cat");
		a.add("fox");
		a.add("dog");
		Iterator itr=a.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		// TODO Auto-generated method stub

	}

}
