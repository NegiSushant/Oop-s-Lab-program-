package Unit3;
class FeeSubmitExcep extends Exception{
	String msg;
	FeeSubmitExcep(String msg){
		this.msg = msg;
	}
	public String toString() {
		return msg;
	}
}

class CanAdmission{
	int fee;
	void CheckFee(int fee) throws FeeSubmitExcep{
		if(fee <= 138000) {
			throw new FeeSubmitExcep("Your full fee is not Submited. Please submit your fee!");
		}else {
			System.out.println("Congratulations! Your are Student of KIET MCA!");
		}
	}
}

public class UserDefExcep {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CanAdmission f = new CanAdmission();
		try {
			f.CheckFee(10000000);
		}catch (FeeSubmitExcep e) {
			System.out.println(e.toString());
		}
	}

}
