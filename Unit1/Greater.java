/**
 * 
 */
/**
 * @author student
 *
 */
package Unit1;
import java.util.Scanner;
class Greatest{
	int a, b, c;
	void data() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the second number: ");
		int num2 = sc.nextInt();
		
		System.out.println("Enter the 3rd number: ");
		int num3 = sc.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			System.out.println(num1+ " is greatest!");
			
		}else if(num2 > num1 && num2 > num3) {
			System.out.println(num2+ " is greatest!");
		}else {
			System.out.println(num3+ " is greatest!");
		}
}
}
public class Greater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greatest obj = new Greatest();
		obj.data();
	}

}
