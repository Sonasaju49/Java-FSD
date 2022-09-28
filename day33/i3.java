package day33;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;



public class i3 {

	public static void main(String[] args) {
		LinkedList<Integer> l=new LinkedList<Integer>();
        l.add(13);
        l.add(29);
        l.add(3);
        Collections.reverse(l);
         
        l.forEach(i->System.out.println(i));
    }




		// TODO Auto-generated method stub

	}


