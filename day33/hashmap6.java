package day33;
import java.util.HashMap;


public class hashmap6 {

	public static void main(String[] args) {
		HashMap<Integer,String>hm=new HashMap<Integer,String>();
		hm.put(1, "blue");
		hm.put(2,"green");
		hm.put(3, "black");
		hm.put(4, "yellow");
		System.out.println(" original linked map" +hm);
		HashMap<Integer,String>hm1=new HashMap<Integer,String>();
		hm1=(HashMap)hm.clone();
		System.out.println("clonned map" +hm1);
		
		// TODO Auto-generated method stub

	}

}
