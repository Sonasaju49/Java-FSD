package day33;

public class quicksort {
	int partition (int a[],int first,int last )
	{
		int pivot=a[last];
		int i=(first -1);
		for(int j=first;j<=last-1;j++)
		{
			if(a[j]<pivot)
			{
				i++;
				int t=a[i];
				a[i]=a[j];
				a[j]=t;
				
			}
			
		}
		int t=a[i+1];
		a[i+1]=a[last];
		a[last]=t;
		return(i+1);
	}
	void quicksort (int a[],int first,int last)
	{
		if(first<last)
		{
			int p=partition(a,first,last);
			quicksort(a,first,p-1);
			quicksort(a,p+1,last);
		}
	}
	void printarr(int a[],int n)
	{
		int i;
		for(i=0;i<n;i++)
			System.out.print(a[i]+ " ");
		
	}

	public static void main(String[] args) {
		int a[]= {54,18,12,1,6,22};
		int n=a.length;
		System.out.println("elements before sorting--");
		quicksort q= new quicksort();
		q.printarr(a,n);
		q.quicksort(a,0,n-1);
		System.out.println("elements after sorting");
		q.printarr(a,n);
		System.out.println();
		// TODO Auto-generated method stub

	}

}
