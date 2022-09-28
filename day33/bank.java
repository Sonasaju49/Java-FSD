package day33;

 class banks {
	 public void getBalance()
	 {
		 System.out.println(0);
	 }
 }
 class BA extends banks{
	 public void getBalance()
	 {
		 System.out.println ("Balance=$100");
		 
	 }
 }
 class BB extends banks{
	 public void getBalance()
	 {
		 System.out.println("Balance=$150");
		 
	 }
 }
 class BC extends banks {
	 public void getBalance() {
		 System.out.println("Balance=$200");
	 }
 }
 public class bank {
	 
 

	public static void main(String[] args) {
		banks b=new banks();
		BA ba =new BA();
		BB bb=new BB();
		BC bc=new BC();
		b.getBalance();
		ba.getBalance();
		bb.getBalance();
		bc.getBalance();
	}
		// TODO Auto-generated method stub

	}


