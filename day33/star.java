package day33;
import java.util.Scanner;

public class star {
	

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of rows");
		int n=sc.nextInt();
		int i=n,j;
		while(i>0)
		{
			j=0;
			while(j++<i)
			{
				System.out.print("*");
			}
			System.out.println();
			i--;
			}
		}
	}






