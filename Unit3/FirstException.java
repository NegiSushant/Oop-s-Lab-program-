package Unit3;

import java.util.Scanner;

public class FirstException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		int a = sc.nextInt();
		
		System.out.println("Enter the second number: ");
		int b = sc.nextInt();
		
		try {
			int res = a / b;
			System.out.println(res);
			System.out.println("Second number is non-zero!");
			
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
		
	}

}
