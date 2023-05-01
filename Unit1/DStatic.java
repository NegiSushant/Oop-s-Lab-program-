/*
Write a program to demonstrate static variable, methods, and blocks!
*/
package Unit1;

public class DStatic {
	static int num = 53;
	static {
		demo();
		System.out.print("static block");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo();
		System.out.print("Main Method!");
		
	}
	public static void demo() {
		System.out.println();
	}

}
 