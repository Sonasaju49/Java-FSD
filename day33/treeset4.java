package day33;
import java.util.Iterator;
import java.util.TreeSet;

public class treeset4 {

	public static void main(String[] args) {
		TreeSet<Integer>t=new TreeSet<>();
		TreeSet<Integer>th=new TreeSet<>();
		t.add(1);
		t.add(2);
		t.add(3);
		t.add(4);
		t.add(5);
		t.add(20);
		t.add(10);
		th=(TreeSet)t.headSet(7);
		Iterator itr=th.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		// TODO Auto-generated method stub

	}

}
