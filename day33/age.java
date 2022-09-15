package day33;
import java.util.Scanner ;


public class age {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print(" enter any number");
		int num= scan.nextInt();
		if(num>18) {
			System.out.println("eligible to vote");
			
		}
		else {
			System.out.println("not eligible to vote ");
		}
		
		// TODO Auto-generated method stub

	}

}
