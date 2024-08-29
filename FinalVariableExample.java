package practice_programs_java.bin;

public class FinalVariableExample {
	final int MAX_SPEED = 150;
	
	public void displaySpeed() {
		//MAX_SPEED = 200;
		System.out.println("The Maximum Speed is: " + MAX_SPEED);
	}

	public static void main(String[] args) {
		FinalVariableExample example = new FinalVariableExample();
		example.displaySpeed();
	}
}
