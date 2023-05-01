package Unit2;
class shape{
	void draw(){
		System.out.println("Shape is Draw!");
		
	}
	void erase() {
		System.out.println("Shape is erase!");
	}
}
class Circle extends shape{
	void draw(){
		System.out.println("Circle is Draw!");
		
	}
	void erase() {
		System.out.println("Circle is erase!");
	}
	
}
class Triangle extends shape{
	void draw(){
		System.out.println("Triangle is Draw!");
		
	}
	void erase() {
		System.out.println("Traiagle is erase!");
	}
}
class Square extends shape{
	void draw(){
		System.out.println("Square is Draw!");
		
	}
	void erase() {
		System.out.println("Square is erase!");
	}
}
public class PolyMorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape obj = new Circle();
		obj.draw();
		obj.erase();
	}

}
