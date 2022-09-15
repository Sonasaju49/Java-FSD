package day33;

public class linearsearch2 {

	public static void main(String[] args) {
		String[]s= {"sona","chinnu","hy",};
		int i;
		String item="sona";
		int flag=0;
		for(i=0;i<s.length;i++)
		{
			if(s[i]==item)
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("item is found at position"+i);
		}
		
		
		else
		{
			System.out.println("element not found");
		}
	}}
		
		
	
