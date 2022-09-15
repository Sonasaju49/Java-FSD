package day33;

 class banks {
	 public void getbalance()
	 {
		 System.out.println(0);
	 }
 }
 class BA extends banks{
	 public void getbalance()
	 {
		 System.out.println(1000);
		 
	 }
 }
 class BB extends banks{
	 public void getbalance()
	 {
		 System.out.println(1500);
		 
	 }
 }
 class BC extends banks {
	 public void getbalance() {
		 System.out.println(2000);
	 }
 }
 public class bank {
	 
 

	public static void main(String[] args) {
		banks b=new banks();
		BA ba =new BA();
		BB bb=new BB();
		BC bc=new BC();
		b.getbalance();
		ba.getbalance();
		bb.getbalance();
		bc.getbalance();
	}
		// TODO Auto-generated method stub

	}


