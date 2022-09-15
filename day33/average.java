package day33;
import java.util.Scanner;




	public class average {
		public static void main(String[] args)
		{
			int n;double result=0;
		
			
			Scanner sc =new Scanner(System.in);
			System.out.println("ENTER N");
			n=sc.nextInt();
			int a[]=new int[n];
			System.out.println("enter numbers");
			for(int i=0;i<n;i++)
				a[i]=sc.nextInt();
			for(int i=0;i<n;i++)
				result =result+a[i];
			System.out.println("average=" +result/n);
		
		}
	}



