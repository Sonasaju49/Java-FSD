import java.util.Scanner;
public class String1 {

	public static void main(String[] args) {
		String s1,s2,s3;
		System.out.println("Inmate's Name:");
		Scanner sca=new Scanner(System.in);
		s1=sca.nextLine();
        System.out.println("Inmates's father's  name");
        s2=sca.nextLine();
        s1=s1.toUpperCase();
        s1 = s1 + " ";
        s2=s2.toUpperCase();
        s3=s1.concat(s2);
        char[] cs=s3.toCharArray();
        for(char c:cs) {
            if(Character.isDigit(c)||c=='!'||c=='@'||c=='#'||c=='$'||c=='%') {
                System.out.println("invalid name");
                System.exit(0);
            }
            
    }
System.out.println(s3);
}
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}


