package day33;

import java.util.LinkedList;
import java.util.Collections;
import java.util.Iterator;
public class linkedreverse {

	public static void main(String[] args) {
		LinkedList<String>a=new LinkedList<>();
		a.add("black");
		a.add("blue");
		a.add("pink");
		a.add("purple");
		a.add("yellow");
		a.add("green");
		Collections.reverse(a);
		Iterator itr=a.listIterator(2);
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		// TODO Auto-generated method stub

	}



	// TODO Auto-generated method stub


		// TODO Auto-generated method stub

	}


