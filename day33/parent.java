package day33;

abstract  class parents {
	abstract void message();
}
class sub1 extends parents {
	public void message() {
		System.out.println("this is first subclass");
		
	}
}
class sub2 extends parents {
	public void message () {
		System.out.println("this is second subclass");
	}
}
public class parent {
	
	

	public static void main(String[] args) {
		sub1 s1= new sub1();
		sub2 s2= new sub2();
		s1.message();
		s2.message();
		// TODO Auto-generated method stub

	}

}
