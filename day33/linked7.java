package day33;
import java.util.Iterator;
import java.util.LinkedList;

public class linked7 {

	public static void main(String[] args) {
	
			LinkedList<String>a=new LinkedList<>();
			a.add("black");
			a.add("blue");
			a.add("pink");
			a.add("purple");
			a.add("yellow");
			a.add("green");
			a.add(0,"hi");
			
			Iterator itr=a.listIterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
			// TODO Auto-generated method stub

		}




		// TODO Auto-generated method stub

	}


