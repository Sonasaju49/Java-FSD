package day33;
interface printable{
	void print();
	
}

 class interr implements printable {
	public void print()
	{
		System.out.println("hi");
	}
}
public class A6{

	public static void main(String[] args) {
	interr obj=new interr();
	obj.print();
		// TODO Auto-generated method stub

	}

}
