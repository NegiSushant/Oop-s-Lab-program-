package Unit2;

import java.util.Scanner;

class Number{
	private double num;
	
	void setValue() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		num = sc.nextInt();
	}
	
	boolean isZero() {
		if(num == 0) {
			return true;
		}
		return false;
	}
	
	boolean isNegative() {
		if(num < Integer.MIN_VALUE) {
			return true;
		}
		return false;
	}
	
	boolean isOdd() {
		if(num % 2 != 0) {
			return true;
		}
		return false;
	}
	
	boolean isEven() {
		if(num % 2 == 0) {
			return true;
		}
		return false;
	}
	
	boolean isPrime() {
		if(num <= 1) {
			return false;
		}
		int c = 2;
		
		while(c*c <= num) {
			if(num % c == 0) {
				return false;
			}
			c++;
		}
		return true;
	}
	
	
}
public class Last {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number obj = new Number();
		obj.setValue();
		System.out.println("Is negative: "+obj.isNegative());
		System.out.println("Is prime: "+obj.isPrime());
		System.out.println("Is Even: "+obj.isEven());
		System.out.println("Is odd: "+obj.isOdd());
	}

}
