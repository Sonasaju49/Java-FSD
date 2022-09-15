package day33;
import java.util.Iterator;
import java.util.TreeSet;

public class treeset2 {

	public static void main(String[] args) {
		TreeSet<String>t=new TreeSet<>();
		t.add("sona");
		t.add("rose");
		t.add("russafid");
		t.add("chinnu");
		t.add("seetha");
		Iterator itr=t.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		// TODO Auto-generated method stub

	}

}
