package Unit3;
class Admisions{
	String Name;
	String course;
	float per;
	Admisions(String nam, String dom, float mark){
		this.Name =  nam;
		this.course = dom;
		this.per = mark;
	}//end constructor
	
	boolean Eligiblity() throws Exception{
		if(per >= 70) {
			throw new Exception("Congratulation "+Name+"! you are eligible for taking Admision in "+course+" Kiet");
		}else 
			return false;
	}//end eligibility
	void Allow() throws Exception{
		if(Eligiblity()) 
			System.out.println("You Are allow!");
		}//end allow
}//end admission

public class ThrowProg {
	public static void main(String[] args) {
	Admisions add = new Admisions("Shivanshu", "MCA", 88.8f);							
		try{
			 add.Allow();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
