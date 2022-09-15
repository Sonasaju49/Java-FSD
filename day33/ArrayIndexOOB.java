package day33;

public class ArrayIndexOOB {

	public static void main(String[] args) {
		try {
			int a[]=new int[5];
			a[6]=15;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bounds exception occurs ");
		}
		// TODO Auto-generated method stub
System.out.println();
System.out.print(" the program then continues ");
	}

}
