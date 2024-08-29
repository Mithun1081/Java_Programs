package practice_programs_java.bin;



class Parent
{
	public Parent()
	{
		super();
		System.out.println("parent class 0 parameter constructor");
	}
	
	public Parent(String s1)
	{
		super();
		System.out.println("parent class 1 parameter constructor");
	}
}

class Child extends Parent
{
	public Child()
	{
		super();
		System.out.println("child class 0 parameter constructor");
	}
	public Child(String s2)
	{
		super();
		System.out.println("child class 1 parameter constructor");
	}
}

public class SuperExample1 {
	public static void main(String[] args)
	{
		new Child();
		new Child("java");
	}

}

