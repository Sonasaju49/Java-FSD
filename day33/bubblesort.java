package day33;

public class bubblesort {

	public static void main(String[] args) {
		int [] b= { 54,32,40,12,1,4};
		int temp;
		for(int i=0;i<b.length;i++) {
			{
				for(int j=0;j<b.length-1;j++) {
					if(b[j]>b[j+1])
					{
						temp=b[j];
						b[j]=b[j+1];
						b[j+1]=temp;
					}
						
				}
			}
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]+ " ");
		}
		// TODO Auto-generated method stub

	}

}
