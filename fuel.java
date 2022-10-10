import java.util.Scanner;

public class fuel {

	public static void main(String[] args) {
		double  a,b,d;
		double c,t,r;
		System.out.println("Enter the no of litres to fill the tank");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		System.out.println("Enter the distance covered");
		b=sc.nextInt();
		d=(a/b)*(100);
		System.out.println("Litres/100km"+ " "+d);
		c=(a*0.2642);
		t=(b*0.6214);
		r=t/c;
		System.out.println("miles/gallons");
		System.out.println(r);
		if(a>0)
		{
			System.out.println(a + " is valid input");
			
		}
		else
		{
			System.out.println(a + "invalid");
			
		}
		if(b>0)
		{
			System.out.println(b + " is valid input");
		}
		else
		{
			System.out.println(b + " is invalid");
			
		}
	}
		
	
		
		
		
		// TODO Auto-generated method stub

	}


