package day33;

import java.util.Scanner;


public class array {
	

	public static void main(String[] args) {
		int arr[]=new int[20];
		for(int i=1;i<=10;i++) {
			Scanner scan=new Scanner(System.in);
			System.out.print("enter the number" + i +":");
			arr[i]=scan.nextInt();
			
		}
		
			System.out.println("Displaying numbers in array");
			for(int j=0;j<10;j++) {
				System.out.print(arr[j] +"");
			}
		// TODO Auto-generated method stub

	}

}
