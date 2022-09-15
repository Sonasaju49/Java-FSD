package day33;

abstract class animals {

	abstract void cats();
	abstract void dogs();
}
class cats extends animals {
	@Override
	void cats() {
		System.out.println("cats meow");
		
	}
}
class dogs extends animals {
	@Override
	void dogs() {
		System.out.println("dogs bark");
	
	}
}
public class Abts2{
	
	public static void main(String[] args) {
		cats s1= new cats();
		dogs s2=new dogs();
		s1.cats();
		s2.dogs();
		// TODO Auto-generated method stub

	}

}
