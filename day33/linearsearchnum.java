package day33;

public class linearsearchnum {

	public static void main(String[] args) {
		int []s= {54,2,4,1,7};
		int item=4;
		int temp=0;
		for(int i=0;i<s.length;i++)
		{
			if(s[i]==item)
			{
				System.out.println("the index position is..."+i);
				temp=temp+1;
				
			}
		}
		if(temp==0)
		{
			System.out.println("item is not found");
		}
		// TODO Auto-generated method stub

	}

}
