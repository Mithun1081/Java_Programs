package practice_programs_java.bin;

public class InterfaceExample3 {
	public static void main(String[] args) {
		Airplane ap = new Airplane();
		ap.move();
		ap.fly();
	}
}
interface Movable{
	void move();
}
interface Flyable extends Movable{
	void fly();
	//void move();
}
class Airplane implements Flyable{
	public void move() {
		System.out.println("Airplane moves forward");		
	}
	public void fly() {
		System.out.println("Airplane flies");
	}
}