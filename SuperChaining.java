package practice_programs_java.bin;

/*class Parent{
	public Parent() {
		System.out.println("Parent class is executing");
	}
}
class Child extends Parent{
	public Child() {
		System.out.println("Child class is executing");
	}
}
public class SuperChaining {
	public static void main(String[] args) {
		Child child = new Child();
	}

}*/


class Parent{
	 Parent() {
		System.out.println("Parent constructor");
	}
}
class Child extends Parent{
}
public class SuperChaining {
	public static void main(String[] args) {
		System.out.println("Main method is executing");
		new Child();
	}
}