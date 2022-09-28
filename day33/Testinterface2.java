package day33;

interface abc {
	float rateofinterest();
}
class SBI implements abc{
	public float rateofinterest() {
		return 9.15f;}
	
	}
class PNB implements abc{
	public float rateofinterest() {
		return 9.7f;
	}
}

public class Testinterface2 {

	public static void main(String[] args) {
		abc b=new SBI();
	System.out.println("ROI: "+b.rateofinterest());
	
		// TODO Auto-generated method stub

	}

}
