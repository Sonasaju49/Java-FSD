package day33;

public class binarystring {

	public static void main(String[] args) {
		int mid,low,high;
		String key ="f",a[]= {"a","b","c","d","e"};
		low=0;
		high=3;
		mid=(low+high)/2;
		while(low<=high)
		{
			if(key.compareTo(a[mid])<0)
				high =mid-1;
			else if(a[mid]==key)
			{
				System.out.println("element found");
				break;
			}
			else
				low=mid+1;
			mid=(low+high)/2;
		}
		if(low>mid) {
			System.out.println("element is not found");
				
		}
	}
		// TODO Auto-generated method stu,b

	}


