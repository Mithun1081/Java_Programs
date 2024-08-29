package practice_programs_java.bin;

class GrandParent{
	 GrandParent() {
		// TODO Auto-generated constructor stub
		 System.out.println("Grand Parent constructor");
	}
}
class Parent extends GrandParent{
	Parent(){
		System.out.println("Parent constructor");
	}
}
class Child extends Parent{
	Child(){
		System.out.println("Child constructor");
	}
}

public class SuperChaining2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Child();

	}

}
