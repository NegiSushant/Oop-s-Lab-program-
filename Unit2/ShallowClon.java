package Unit2;

class kiet2{
	int BTech;
	int MCA;
	
}
class KietCollege implements Cloneable{
	int MBA;
	int Pharma;
	kiet2 hostel = new kiet2();
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
public class ShallowClon {
	public static void main(String[] args) throws CloneNotSupportedException{
		KietCollege obj = new KietCollege();
		obj.MBA = 150;
		obj.Pharma = 100;
		obj.hostel.BTech =  2000;
		obj.hostel.MCA = 190;
		
		System.out.println(obj.MBA+ " " + obj.Pharma+ " "+obj.hostel.BTech+ " "+obj.hostel.MCA);
	}
}
