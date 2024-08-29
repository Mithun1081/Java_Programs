package practice_programs_java.bin;

class Car{
	String color;  // Instance variable
	String model;
	
	public Car(String color, String model) {
		this.color = color;   //Local variables
		this.model = model;
	}
}

public class ConstructorExample2 {
	public static void main(String[] args) {
		Car myCar = new Car("Blue", "Honda Civic");
		System.out.println("Car details: " +myCar.color + " " + myCar.model);
	}

}
