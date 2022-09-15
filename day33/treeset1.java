package day33;
import java.util.Iterator;
import java.util.TreeSet;

public class treeset1 {

	public static void main(String[] args) {
		TreeSet<String>t =new TreeSet<>();
		t.add("pink");
		t.add("black");
		t.add("green");
		t.add("yellow");
		Iterator itr=t.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
		// TODO Auto-genera"ted method stub

	}

}
