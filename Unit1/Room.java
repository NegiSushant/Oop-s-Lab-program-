package Unit1;

import java.util.Scanner;

public class Room {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Room1 r = new Room1();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the room Number: ");
		r.roomno = sc.nextInt();//207;
		
		System.out.println("Enter the room Type: ");
		r.roomtype = sc.next();//"NonAc";
		
		System.out.println("Enter the room Area: ");
		r.roomArea = sc.nextFloat();//200.56f;
		
		System.out.println("Enter the number of AC: ");
		r.ACMachine = sc.nextInt();//2;
//		r.roomno = 207;
//		r.roomtype = "Ac";
//		r.roomArea = 208.45f;
//		r.ACMachine = 4;
		//r.setData();
		r.display();
	}
}

class Room1{
	int roomno;
	String roomtype;
	float roomArea;
	int ACMachine;
	
	void setData() {
		this.roomno = 207;
		this.roomtype = "Non-Ac";
		this.roomArea = roomArea;
		this.ACMachine= ACMachine;
		
//		this.roomno = 207;
//		this.roomtype = "Non-Ac";
//		this.roomArea = 450.35f;
//		this.ACMachine = 4;
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the room Number: ");
//		this.roomno = sc.nextInt();//207;
//		
//		System.out.println("Enter the room Type: ");
//		this.roomtype = sc.next();//"NonAc";
//		
//		System.out.println("Enter the room Area: ");
//		this.roomArea = sc.nextFloat();//200.56f;
//		
//		System.out.println("Enter the number of AC: ");
//		this.ACMachine = sc.nextInt();//2;
	}
	
	
	void display() {
		//System.out.println("Room Number is: "+roomno+"! Room Type is: "+roomtype+"! Room Area is: "+roomArea+"! Number of AcMachine is: "+ACMachine);
		
		System.out.print("Room Number is: "+roomno+"! Room Type is: "+this.roomtype+"! Room Area is: "+this.roomArea+"! Number of AcMachine is: "+this.ACMachine);
	}

	

}
