import java.util.Scanner;
public class bill {

	public static void main(String[] args) {
		int a,b,c,p,q,y,t;
		System.out.println("Enter the no of pizzas bought");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		p=(a*100);
		System.out.println("Enter the no of puffs bought");
		Scanner sc1 =new Scanner(System.in);
		b=sc.nextInt();
		q=(b*20);
		System.out.println("Enter the no of cool drinks bought");
		Scanner sc2=new Scanner(System.in);
		c=sc1.nextInt();
		y=(c*10);
		t=p+q+y;
		System.out.println("Bill Details");
		System.out.println("No of pizzas :" +a);
		System.out.println("No of puffs:" +b);
		System.out.println("No of cooldrinks:" +c);
		System.out.println("Total Price =" +t);
		System.out.println("ENJOY THE SHOW");
	}
		
		
		

		
				
		
		
		
		
		// TODO Auto-generated method stub

	}


