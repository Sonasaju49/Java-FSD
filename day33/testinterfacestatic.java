package day33;
interface drawable{
	void draw();

	static int cube(int x) {
		return x*x*x;
	}
	class rectangle implements drawable{
		public void draw()
		{
			System.out.println("drawing rectangle");
			
		}
		
	


public class testinterfacestatic {
	


	public static void main(String[] args) {
		drawable d=new rectangle();
		d.draw();
		System.out.println(drawable.cube(3));
		
	}}}}

		// TODO Auto-generated method stub

	


