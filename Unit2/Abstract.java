package Unit2;

abstract class Kiet{
	abstract void MCA();
}
class Sem extends Kiet{
	void MCA() {
		System.out.println("Now you are students of kiet mca!");
	}
}

public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kiet obj = new Sem();
		obj.MCA();
	}

}
