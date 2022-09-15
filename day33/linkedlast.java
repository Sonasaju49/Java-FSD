package day33;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class linkedlast {

	public static void main(String[] args) {
		LinkedList<String>a=new LinkedList<>();
		a.add("black");
		a.add("blue");
		a.add("pink");
		a.add("purple");
		a.add("yellow");
		a.add(5,"green");
		ListIterator itr=a.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		// TODO Auto-generated method stub

	}



	// TODO Auto-generated method stub





		// TODO Auto-generated method stub

	}


