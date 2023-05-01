package Unit1;

class SimpleObject{
	SimpleObject(){
		System.out.println("I'am here in the simpleObject without parameter!");
	}
	SimpleObject(int s){
		System.out.println("I'am here in the simpleObject with parameter!");
	}
}
public class SO {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleObject obj = new SimpleObject();
		SimpleObject obj1 = new SimpleObject(11);
//		obj.name;
                                                                                                  
	}

}

