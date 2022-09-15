package day33;
import java.util.Scanner;

public class day {
	public static void main(String[] args)
	{
		int n;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter  day number");
		n=input.nextInt();
		String monthString;
		switch(n)
		{
		case 1: monthString="monday";
		        break;
		case 2: monthString="tuesday";
		        break;
		case 3: monthString="wednesday";
		       break;
		case 4: monthString="thursday";
		        break;
		case 5: monthString="friday";
		        break;
		case 6: monthString="saturday";
		        break;
		case 7: monthString="sunday";
		        break;
		case 8: monthString="August";
		        break;
		
		default:monthString="Wrong day";
		        break;
		}
		System.out.println(monthString);
	}
}





