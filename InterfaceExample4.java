package practice_programs_java.bin;

interface Painter{
	public abstract void paint();
}
interface Singer{
	public abstract void sing();
}

class Dancer{
	public void dance() {
		System.out.println("I can dance!");
	}
}
class Artist extends Dancer implements Painter, Singer{
	public void paint() {
		System.out.println("I can paint!");
	}
	public void sing() {
		System.out.println("I can sing!");
	}
}

public class InterfaceExample4 {
	public static void main(String[] args) {
		Artist art = new Artist();
		//Dancer d = new Dancer();
		art.dance();
		art.paint();
		art.sing();
		//d.dance();
	}
}
