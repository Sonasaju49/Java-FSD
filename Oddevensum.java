import java.util.Scanner;
public class Oddevensum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the Number");
	    int n=sc.nextInt();
	    int Evensum=0;
	    int Oddsum=0;
	    
	    while(n!=0)
	    {
	        int r = n%10;
	        if(r%2==0)
	        {
	            Evensum = Evensum+r;
	            
	            
	        }
	        else
	        {
	            Oddsum = Oddsum+r;
	            
	            
	        }
	        n=n/10;
	    }
	    System.out.println("Even Number Sum: "+Evensum);
	    System.out.println("Odd Number Sum: "+Oddsum);
	    
	    
	    }



	

	}


