package Unit3;

import java.util.Scanner;

class InInput extends Exception{
	String msg1;
	InInput(String m){
		this.msg1 = m;
	}
	
	public String str() {
		return msg1;
	}
}

class Customer{
	String custNo;
	String custName;
	String category;
	
	Customer(String a, String b, String c){
		custNo = a;
		custName = b;
		category = c;
	}
	
	public void customerNo() {
		try {
			if(custNo.charAt(0) == 'c' || custNo.charAt(0) == 'C') {
				System.out.println(custNo);
			}else {
				throw new InInput("Customer number is not vailid!");
			}
		}catch(InInput e) {
			System.out.println(e.str());
		}
	}
	
	public void customerNaam() {
		try {
			if(custName.length() >= 4) {
				System.out.println(custName);
			}else {
				throw new InInput("Customer name is not vailid!");
			}
		}catch(InInput e) {
			System.out.println(e.str());
		}
	}
	
	public void custCategory() {
		try {
			if(category.equals("Platinum") || category.equals("Gold") || category.equals("Silver")) {
				System.out.println(category);
			}else {
				throw new InInput("Customer category is not vailid!");
			}
		}catch(InInput e) {
			System.out.println(e.str());
		}
	}
}
public class TestCustm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1, s2, s3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter customer no: ");
		s1= sc.nextLine();
		System.out.println("Enter customer name: ");
		s2 = sc.nextLine();
		System.out.println("Enter customer category: ");
		s3 = sc.nextLine();
		
		Customer c = new Customer(s1, s2, s3);
		c.customerNo();
		c.customerNaam();
		c.custCategory();
	
	}

}
