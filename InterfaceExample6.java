package practice_programs_java.bin;

public class InterfaceExample6 {
	public static void main(String[] args){
		RBI sbi = new SBI();
		System.out.println("Accessing SBI methods");
		new InterfaceExample6().banking(sbi,555);
		
		RBI axis = new Axis();
		System.out.println("Accessing Axis methods");
		new InterfaceExample6().banking(axis, 777);
	}
	public void banking(RBI rbi, int rup) {
		rbi.authenticateUser();
		rbi.giveLoans();
		rbi.demonetize();
		System.out.println(RBI.rupeesToPaise(rup));
	
	}

}
interface RBI{
	//abstract methods
	void authenticateUser();
	void giveLoans();
	//default method
	default void demonetize() {
		System.out.println("500 notes not allowed");
	}
	//static method
	public static int rupeesToPaise(int rupees) {
		int paise =  rupees * 100;
		return paise;
	}
}
class SBI implements RBI{
	public void authenticateUser() {
		System.out.println("SBI authenticates with OTP");
	}
	public void giveLoans() {
		System.out.println("SBI gives loan at 7.5% rate of intrest");
	}
}
class Axis implements RBI{
	public void authenticateUser() {
		System.out.println("Axis authenticates with signature");
	}
	public void giveLoans() {
		System.out.println("Axis gives loan at 9.5% rate of intrest");
	}
	public void demonitize() {
		System.out.println("500 and 1000 notes not allowed");
	}
}