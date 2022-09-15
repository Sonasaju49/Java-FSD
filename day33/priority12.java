package day33;

import java.util.PriorityQueue;

public class priority12 {

	public static void main(String[] args) {
		PriorityQueue<String>pr=new PriorityQueue<>();
		PriorityQueue<String>pq=new PriorityQueue<>();
		pr.add("pink");
		pr.add("black");
		pr.add("ash");
		pr.add("red");
		pq.add("green");
		pq.add("ash");
		pq.add("red");
		pq.add("blue");
		System.out.println(pr);
		System.out.println(pq);
		for(String element:pr)
		{
			System.out.println(pq.contains(element)?"yes":"No");
			
		}
		
		// TODO Auto-generated method stub

	}

}
