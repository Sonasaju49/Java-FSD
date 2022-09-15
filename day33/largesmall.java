package day33;
import java.util.*;


public class largesmall {

	public static void main(String[] args) {
		int large ,small,i;
		int a[]=new int[] {1,2,3,4,5,6,7,9};
		int n=a.length;
		large=small=a[0];
		for(i=1;i<n;++i)
		{
			if(a[i]>large)
				large=a[i];
			if(a[i]<small)
				small=a[i];
			
		}
		System.out.println("\n smallest element is  " +small);
		System.out.println("\n largest element is " +large);
		// TODO Auto-generated method stub

	}

}
