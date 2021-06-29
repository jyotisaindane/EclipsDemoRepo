
public class NestedClass {
	private int d = 10;
	static int c = 5;

	static class Inner{
	//in static context, non-static variable must be accessed using object or 
		//object reference
		void display() {
			System.out.println(new NestedClass().d +"  "+ c);
		}
		public static void main(String[] args) {
			//Inner i=new Inner();
			//i.display();
			//or
			new Inner().display();
		}
	}
	
}
