import java.util.Scanner;
public class matrixmul {

	public static void main(String[] args) {
		  Scanner sc = new Scanner (System.in);
	        
	        System.out.print(" Enter the number of rows : ");
	        int a = sc.nextInt();
	        
	        System.out.print(" Enter the number of columns : ");
	        int b = sc.nextInt();
	        
	        int p[][] = new int [a][b];
	        int q[][] = new int [a][b];
	        
	        System.out.println("\n Enter elements of first matrix ");
	        for (int i = 0; i < a; i++) {
	            for (int j = 0; j < b ; j++) {
	                
	                System.out.print("Enter the element of "+ (i+1) + " Row and " + (j+1) + " column ");
	                p[i][j] = sc.nextInt();
	            }
	        }
	        
	        System.out.println("\n Enter  elements of second matrix");
	        for (int i = 0; i < a; i++) {
	            for (int j = 0; j < b ; j++) {
	                
	                System.out.print("Enter the element of "+ (i+1) + " Row and " + (j+1) + " column ");
	                q[i][j] = sc.nextInt();



	   }



	}
	        System.out.println("\n  First Matrix ");
	        
	        for (int i = 0; i < a; i++) {
	            for (int j = 0; j < b ; j++) {
	                
	                System.out.print(p[i][j] + " ");
	            }
	            System.out.println();
	        }
	        
	        System.out.println("\n  Second Matrix ");
	        
	        for (int i = 0; i < a; i++) {
	            for (int j = 0; j < b ; j++) {
	                
	                System.out.print(q[i][j] + " ");
	            }
	            System.out.println();
	        }
	        int c[][] = new int[a][b];
	        
	        for (int i = 0; i < a; i++) {
	            for (int j = 0; j < b ; j++) {
	                for (int k = 0; k<a && k<b ; k++)
	                
	                c[i][j] += p[i][k] * q[k][j];
	            }
	            
	        }
	        
	        System.out.println("\n Product of Matrix : ");
	        
	        for (int i = 0; i < a; i++) {
	            for (int j = 0; j < b ; j++) {
	                
	                System.out.print(c[i][j] + " ");
	            }
	            System.out.println();
	        }
	}
	}
	
		 

		
		
		
	

	


		// TODO Auto-generated method stub

	


