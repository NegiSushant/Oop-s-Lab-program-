package Unit2;
class Gen1{
	void Gen1Msg() {
		System.out.println("I am from Generation 1!");
	}
}
class Gen2 extends Gen1{
	void Gen2Msg() {
		System.out.println("I am from Generation 2!");
	}
}

class Gen3 extends Gen2{
	void Gen3Msg() {
		System.out.println("I am from Generation 3!");
	}
}
public class Inherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gen3 g = new Gen3();
		g.Gen1Msg();
		g.Gen2Msg();
		g.Gen3Msg();
		
	}

}
