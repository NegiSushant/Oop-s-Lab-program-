package Unit1;


class A{
	int x;
	A(){
		x=10;
	}
	void show() {
		System.out.println(x);
	}
}
class B extends A{
	int y;
	B(){
		y=20;
	}
	void show() {
		System.out.println(x+" "+y);
	}
}
public class OVERRIDING {

	public static void main(String[] args) {
		A A1;
		A A2=new A();
        B B1=new B();
        A1 =A2;
        A1.show();
        A1=B1;
        A1.show();
	}
}
