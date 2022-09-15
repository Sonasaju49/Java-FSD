package day33;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class treeset3 {

	public static void main(String[] args) {
		TreeSet<String>t=new TreeSet<>();
		t.add("yellow");
		t.add("pink");
		t.add(" blue");
		t.add("white");
		Iterator itr=t.descendingIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		// TODO Auto-generated method stub

	}

}
