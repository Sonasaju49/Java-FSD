package day33;
import java.util.Iterator;
import java.util.LinkedList;
public class linked11 {

	public static void main(String[] args) {
		LinkedList<String>a=new LinkedList<>();
		a.add("cat");
		a.add("fox");
		a.add("dog");
		a.remove("cat");
		Iterator itr=a.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		// TODO Auto-generated method stub

	}



		// TODO Auto-generated method stub

	}


