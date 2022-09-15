package day33;

public class binarysearch {
	

	public static void main(String[] args) {
		int[]a= {2,5,6,7,8,9,56,7};
		int item=6;
		int li=0;
		int hi=a.length-1;
		int mi=(li+hi)/2;
		while(li<=hi) {
			if(a[mi]==item)
			{
				System.out.println("element is present");
				break;
			}
			else if(a[mi]<item)
			{
				li=mi+1;
				
			}
			else
			{
				hi=mi-1;
				
			}
			mi=(li+hi)/2;
		}
		if(li>hi)
		{
			System.out.println("element not found");
		}
	}
}

	
