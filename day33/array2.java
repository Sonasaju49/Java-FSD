package day33;
import java.util.Scanner;

public class array2 {

	public static void main(String[] args) {
		int arr[]=new int[20];
		Scanner sc =new Scanner(System.in);
		for(int i=1;i<=5;i++) {
			
			System.out.print("Enter the number  : " + i +" :");
			arr[i]=sc.nextInt();
		}
		System.out.println();
		//Scanner sc =new Scanner(System.in);
		
		System.out.print("enter the number to search in array");
		
		
			int num= sc.nextInt();
			int flag=0;
			for(int j=0;j<5;j++) {
				if(arr[j]==num) {
					flag=1;
					break;
					
					
					
				}
				else {
					flag=0;
				}
			}
			if(flag==1) {
				System.out.print(" the number" +num + "is present in array");
				
			}
			else {
				System.out.print("the number " +num + "is not present in array");
			}
		}
		// TODO Auto-generated method stub

	}


