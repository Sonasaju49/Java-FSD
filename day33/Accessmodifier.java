package day33;

 class ParentClass{
	 int a=10;
	 public int b=20;
	 protected int c=30;
	 private int d =40;
	 void showData()
	 {
		 System.out.println();
			 System.out.println("inside parent class");
			 System.out.println();
			 System.out.println("a=" +a);
			 System.out.println("b="+b);
			 System.out.println("c" +c);
			 System.out.println("d="+d);
		 }
 }
	 class ChildClass extends ParentClass {
		 void showData1() {
			 System.out.println("inside child class");
			 System.out.println();
			 System.out.println("a=" +a);
			 System.out.println("b=" +b);
			 System.out.println("c=" +c);
		 }
	 }
	 public class Accessmodifier {
		 

	public static void main(String[] args) {
		ChildClass c= new ChildClass();
		c.showData();
		c.showData1();
		// TODO Auto-generated method stub

	}

}
